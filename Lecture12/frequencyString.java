package Lecture12;

import java.util.*;

public class frequencyString {
    public static void main(String[] args) {

        String str="aabccAd";
        int[] fre= new int[256];
        
        for(int i=0;i<str.length();i++){
            char ch= str.charAt(i);
            int ascii = ch;
            // fre[ascii]=fre[ascii]+1;
            fre[ascii]++;
        }
        for(int i=0;i<fre.length;i++){
            if(fre[i]!=0){
                char ch = (char)i;
                System.out.println(ch+" -> "+ fre[i]);
            }
        }
    }
}
