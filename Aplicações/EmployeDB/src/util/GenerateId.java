package util;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class GenerateId {
    public static String generateId(String param) throws NoSuchAlgorithmException {
        //get algorith of cript
        MessageDigest algorithm = MessageDigest.getInstance("SHA-256");
        //get byte of param send of user
        byte[] byte_of_message = param.getBytes();
        //get bytes after hash's
        byte[] byte_of_hash = algorithm.digest(byte_of_message);

        //hash in string
        StringBuilder hex_string = new StringBuilder();

        for(byte item_b: byte_of_hash) {
            String hex = Integer.toHexString(0xff & item_b);
            if (hex.length() == 1) {
                hex_string.append('0');
            }
            hex_string.append(hex);
        }
        return hex_string.toString();
    }
}
