package B07_HashFunctions.MD5;

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class MD5 {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        // Convert str in to byte array
        byte[] strBytes = str.getBytes(StandardCharsets.UTF_8);
        // get diggest of bytes by SHA-256
        MessageDigest md = MessageDigest.getInstance( "MD5" ) ;
        byte[] digestStrBytes = md.digest(strBytes);
        //convert digested byte array into signum representation
        BigInteger strSignum = new BigInteger( 1, digestStrBytes ) ;
        // Convert into hex value
        StringBuilder hexStr = new StringBuilder( strSignum.toString( 16 ) ) ;
        System.out.println(hexStr);
    }
}
