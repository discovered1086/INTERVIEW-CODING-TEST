package com.kingshuk.corejava.algorithms.encryption;


import java.io.FileInputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.security.*;
import java.util.Objects;

public class KeyStoreUtil {

    private KeyStoreUtil() {
        throw new UnsupportedOperationException("This is not allowed");
    }

    public static KeyStore loadKeyStoreFile(String keyStorePassword) throws Exception {
        KeyStore keyStore = KeyStore.getInstance("PKCS12");
        keyStore.load(Files.newInputStream(Path.of("src/main/resources/konvergion-data-keystore.jks")),
                keyStorePassword.toCharArray());
        return keyStore;
    }


    public static KeyPair loadKeyPairFromKeyStore(KeyStore keyStore, String password) throws Exception {
        KeyStore store = Objects.requireNonNull(keyStore);
        String alias = store.aliases().nextElement();
        Key privateKey = store.getKey(alias, password.toCharArray());
        PublicKey publicKey = store.getCertificate(alias).getPublicKey();
        return new KeyPair(publicKey, (PrivateKey) privateKey);
    }
}
