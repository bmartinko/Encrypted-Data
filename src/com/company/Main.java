package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

    Scanner kbsReader = new Scanner(System.in);
    String word;
    int press;
    Encryption wordThing;


        System.out.println("Press 0 to encrypt a word");
        System.out.println("Press 1 to decrypt a word");
     press = kbsReader.nextInt();
    if (press == 1){

        System.out.println("Please write a word to encrypt");
        word = kbsReader.nextLine();
        wordThing = new Encryption(word);
        System.out.println("Your encrypted word is " + wordThing.encrypt(word));
    }
    else if (press == 0){
            System.out.println("Please write a word to encrypt");
            word = kbsReader.nextLine();
            wordThing = new Encryption(word);
            System.out.println("Your encrypted word is " + wordThing.decrypt(word));
        }






    }
}
