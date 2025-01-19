package Lecture12;

import java.util.*;

public class stringQuestion {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        char ch=sc.next().charAt(0);
        if(ch>='A' && ch<='Z'){
            System.out.println("Upper Case");
        }else{
            System.out.println("Lower Case");
        }
        sc.close();
    }    
}
