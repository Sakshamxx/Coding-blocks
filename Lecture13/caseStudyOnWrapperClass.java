package Lecture13;

public class caseStudyOnWrapperClass {

    public static void update(Integer a){
        a++;
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        // Integer a=13;
        // System.out.println(a);
        // update(a);
        // System.out.println(a);
        // No update reason wrapper class are immutable

        // Integer a=12;
        // Integer b=12;
        // Integer c=500;
        // Integer d=500;

        // if(a==b){
        //     System.out.println("Equal");
        // }else{
        //     System.out.println("Diffrent");
        // }

        // if(c==d){
        //     System.out.println("Equal");
        // }else{
        //     System.out.println("Diffrent");
        // }

    // Due to Integer Cache->EQUAL->DIFFRENT

    // CASE 4

    Integer a=new Integer(12);
        Integer b=new Integer(12);
        Integer c=500;
        Integer d=500;

        if(a==b){
            System.out.println("Equal");
        }else{
            System.out.println("Diffrent");
        }

        if(c==d){
            System.out.println("Equal");
        }else{
            System.out.println("Diffrent");
        }
        // DUE TO NEW KEYWORD->DIFFRENT->DIFFRENT
    }
}
