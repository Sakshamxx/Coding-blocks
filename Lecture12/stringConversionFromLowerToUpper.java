package Lecture12;

import java.util.*;

public class stringConversionFromLowerToUpper {
    public static void main(String[] args) {
        char ch='a';
        ch=(char)(ch-('a'-'A'));
        ch-=32;
        System.out.println(ch);
    }
}
