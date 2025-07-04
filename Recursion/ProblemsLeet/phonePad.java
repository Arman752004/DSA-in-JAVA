package Recursion.ProblemsLeet;
//https://leetcode.com/problems/letter-combinations-of-a-phone-number/description/

import java.util.ArrayList;

public class phonePad {
    public static void main(String[] args) {
        System.out.println(padRet("", "23"));
        System.out.println(padCount("", "12"));
    }
    static void pad(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        int digit = up.charAt(0) - '0';      //this will convert '2' -> 2

        for (int i = (digit - 1) * 3; i < digit * 3; i++) {         //i will run till one less than the digit * 3
            char ch = (char) ('a' + i); 
            pad(p + ch, up.substring(1));
        }
    }

    static ArrayList<String> padRet(String p,String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        int digit = up.charAt(0) - '0';      //this will convert '2' -> 2

        ArrayList<String> list = new ArrayList<>();

        for (int i = (digit - 1) * 3; i < digit * 3; i++) {         //i will run till one less than the digit * 3
            char ch = (char) ('a' + i); 
            list.addAll(padRet(p + ch, up.substring(1)));
        }
        return list;
    }

    static int padCount(String p,String up){
        if(up.isEmpty()){
            return 1;
        }
        int count = 0;
        int digit = up.charAt(0) - '0';      //this will convert '2' -> 2
        for (int i = (digit - 1) * 3; i < digit * 3; i++) {         //i will run till one less than the digit * 3
            char ch = (char) ('a' + i); 
            count = count + padCount(p + ch, up.substring(1));
        }
        return count;
    }
}
