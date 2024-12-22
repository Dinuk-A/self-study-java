package org.example.utils.encrp;

import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;

public class EncrWithSecretKeysExm {

    // generate a secret key to support encryption
    public static void generateKey() {

        try {
            KeyGenerator keyGen = KeyGenerator.getInstance("AES");
            keyGen.init(128);
            SecretKey seckey = keyGen.generateKey();
            System.out.println("key: " + seckey);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    // use it to encrypt
    public static void encryDecryEx() {
        try {
            KeyGenerator keyGen = KeyGenerator.getInstance("AES");
            keyGen.init(128);
            SecretKey seckey = keyGen.generateKey();

            System.out.println("key: " + seckey);
            System.out.println();

            String text = "dinuka";

            // Encrypt data
            Cipher cipher = Cipher.getInstance("AES");
            cipher.init(Cipher.ENCRYPT_MODE, seckey);
            byte[] encryptedData = cipher.doFinal(text.getBytes());
            System.out.println(encryptedData);

            // decrypt data
            cipher.init(Cipher.DECRYPT_MODE, seckey);
            byte[] decryptedData = cipher.doFinal(encryptedData);
            System.out.println(new String(decryptedData));

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    //directly create a secret key by providing raw bytes
    public static void genKeyWithRawData() {
        byte[] keyBytes = "123456789".getBytes();

        System.out.println(Arrays.toString(keyBytes));
        SecretKey sk = new SecretKeySpec(keyBytes, "AES");

        System.out.println("key " + sk);
        
        System.out.println("algo used "+ sk.getAlgorithm());
        System.out.println("format "+ sk.getFormat());
        System.out.println("key in primary format "+ sk.getEncoded());
    }

}
