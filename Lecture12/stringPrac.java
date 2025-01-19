package Lecture12;
import java.util.*;
public class stringPrac {

    public static boolean IsPalindrone(String str){
        String str1= reverse(str);
        if(str1.equals(str)){
        return true;}
        else {
        return false;}

    }

    public static String reverse(String str){
        String ans="";
        for(int i=str.length()-1;i>=0;i--){
            ans+= str.charAt(i);
        }
        return ans;
    }
        public static void main(String[] args) {
        String str1= new String("Hello");
        String str2= new String("Hello");
        String str3= "Hello";
        String str4= "Hello";
        // System.out.println(str1==str2);
        // System.out.println(str3==str4);

        String str5=str3+"e";
        // System.out.println(str5);
        // System.out.println(str3);
        Scanner sc = new Scanner(System.in);
        String str= sc.next();
        String ans=reverse(str);
        // System.out.println(ans);
        System.out.println(IsPalindrone(str));
        sc.close();
    }
}
