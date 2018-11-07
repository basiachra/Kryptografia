package pl.edu.agh;

import java.io.File;
import java.io.FileOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {

    public static void main(String[] args) {


	    if (args[0].contains("enc")) {
	        System.out.println("Encrypting file!");
            CipherMachine machine = new CipherMachine();
            /* read data and encrypt*/


        } else if(args[0].contains("dec")) {
            System.out.println("Decrypting file!");
            /* read cryptogram, decrypt and save plain message*/


        } else System.out.println("Undefined command!");


    }
}
