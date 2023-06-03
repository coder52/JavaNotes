package B07_HashFunctions.SHA;

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class SHA_256 {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        // Convert str in to byte array
        byte[] strBytes = str.getBytes(StandardCharsets.UTF_8);
        // get diggest of bytes by SHA-256
        MessageDigest md = MessageDigest.getInstance( "SHA-256" ) ;
        byte[] digestStrBytes = md.digest(strBytes);
        //convert digested byte array into signum representation
        BigInteger strSignum = new BigInteger( 1, digestStrBytes ) ;
        // Convert into hex value
        StringBuilder hexStr = new StringBuilder( strSignum.toString( 16 ) ) ;
        //pad the zeros in front of hexStr if it is shorter than 64
        while (hexStr.length()<64){
            hexStr.insert(0,'0');
        }
        System.out.println(hexStr);
    }
}
