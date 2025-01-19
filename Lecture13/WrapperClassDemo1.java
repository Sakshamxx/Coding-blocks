package Lecture13;

public class WrapperClassDemo1 {
    public static void main(String[] args) {
        int a=5;
        // Integer a=new Integer(5);

        Integer a1=5;
        System.out.println(a1);

        // AutoBoxing
        int b=12;
        // Integer c=b;
        Integer c= Integer.valueOf(b);
        System.out.println(c);

        // UnBoxing
        // int d=c;
        int d= c.intValue();
    }
}
