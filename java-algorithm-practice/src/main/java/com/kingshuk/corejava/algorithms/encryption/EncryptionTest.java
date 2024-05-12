package com.kingshuk.corejava.algorithms.encryption;

public class EncryptionTest {

    public static void main(String[] args) {
        String theText = "access-production-972fd1f2-b0d5-4ecc-b309-f13d5936341d";
        String encryptedText = EncryptionUtil.performEncryption(theText, "Iofdtiger#1086");

        System.out.println(encryptedText);
        String decryptedText = EncryptionUtil.performDecryption(encryptedText, "Iofdtiger#1086");

        System.out.println(decryptedText);
    }
}
