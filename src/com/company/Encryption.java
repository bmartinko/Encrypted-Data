package com.company;

/**
 * Created by bm846 on 10/15/18.
 */
public class Encryption {
    public String word;
    public int encryption;

    public Encryption (String w){

        for (int i = 0; i < w.length(); i++){
            char next = w.charAt(i);
            encryption = next + 5;
            word += encryption;

        }
        System.out.println(word);
    }

}
