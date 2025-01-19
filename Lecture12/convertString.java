package Lecture12;

import java.util.*;

public class convertString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str=sc.next();

        String ans=" ";
        for(int i=0;i<str.length();i++){
            char ch= str.charAt(i);
            if(ch>='A' && ch<='Z'){
                ch= (char)(ch+ ('a'-'A'));
            }else{
                ch = (char)(ch - ('a'-'A'));
            }
            ans+=ch;
        }
        System.out.println(ans);
    }
}
