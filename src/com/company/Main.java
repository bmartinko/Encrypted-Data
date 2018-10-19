package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

    Scanner kbsReader = new Scanner(System.in);
    String word;
    int press;
    System.out.println("What word do you want to use?");
    String wordUse = kbsReader.nextLine();
    Encryption wordThing = new Encryption(wordUse);
    System.out.println("Press 0 to encrypt a word");
    System.out.println("Press 1 to decrypt a word");
    press = kbsReader.nextInt();
    if (press == 1){
        System.out.println("Your encrypted word is " + wordThing.encrypt(wordUse));
    }
    else if (press == 0){
            System.out.println("Your encrypted word is " + wordThing.decrypt(wordUse));
        }






    }
}
