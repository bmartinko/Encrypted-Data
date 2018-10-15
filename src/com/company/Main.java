package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
    Scanner kbsReader = new Scanner(System.in);
    System.out.println("Please type a word");
    String input = kbsReader.nextLine();
    Encryption output = new Encryption(input);
    System.out.println(output);

    System.out.println("Do you want to decrypt this? If so, press 1. Otherwise, press 2.");
    int press = kbsReader.nextInt();




    }
}
