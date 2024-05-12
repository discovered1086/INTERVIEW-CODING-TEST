package com.kingshuk.corejava.algorithms.encryption;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import java.nio.charset.StandardCharsets;
import java.security.*;
import java.util.Base64;
import java.util.List;

public class EncryptionUtil {

    private static final String RSA = "RSA";

    private EncryptionUtil() {
        throw new UnsupportedOperationException("This is not allowed");
    }


    public static String performEncryption(String plainText, PublicKey publicKey) throws NoSuchPaddingException,
            NoSuchAlgorithmException, InvalidKeyException, IllegalBlockSizeException, BadPaddingException {
        Cipher cipher = Cipher.getInstance(RSA);
        cipher.init(Cipher.ENCRYPT_MODE, publicKey);
        return new String(Base64.getEncoder().encode(cipher.doFinal(plainText.getBytes(StandardCharsets.UTF_8))));
    }


    public static String performDecryption(String cipherText, PrivateKey privateKey) throws NoSuchPaddingException,
            NoSuchAlgorithmException, InvalidKeyException, IllegalBlockSizeException, BadPaddingException {
        Cipher cipher = Cipher.getInstance(RSA);
        cipher.init(Cipher.DECRYPT_MODE, privateKey);
        return new String(cipher.doFinal(Base64.getDecoder().decode(cipherText)));
    }

    public static String performEncryption(String plainText, String keyStorePassword) {
        try {
            KeyPair keyPair = KeyStoreUtil.loadKeyPairFromKeyStore(KeyStoreUtil.loadKeyStoreFile(keyStorePassword), keyStorePassword);
            return performEncryption(plainText, keyPair.getPublic());
        } catch (Exception exception) {
            throw new RuntimeException(exception);
        }
    }


    public static String performDecryption(String cipherText, String keyStorePassword) {
        try {
            KeyPair keyPair = KeyStoreUtil.loadKeyPairFromKeyStore(KeyStoreUtil.loadKeyStoreFile(keyStorePassword), keyStorePassword);
            return performDecryption(cipherText, keyPair.getPrivate());
        } catch (Exception exception) {
            throw new RuntimeException(exception);
        }
    }
}
