package com.company;

/**
 * Created by bm846 on 10/15/18.
 */
public class Encryption {
    public String wordA;
    public String wordB ;

    public Encryption (String s){
        wordA = s;
    }

    public String encrypt (String wordA){

        for (int i = 0; i < wordA.length(); i++){
        char next = wordA.charAt(i);
        next+= 5;
        wordB += next ;

        }
        return wordB;
    }
    public String decrypt (String wordA){
        for(int i = 0; i < wordA.length(); i++){
            char next = wordA.charAt(i);
            next -= 5;
            wordB += next;
        }
        return wordB;
    }
}

