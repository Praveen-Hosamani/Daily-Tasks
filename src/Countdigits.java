import java.util.Scanner;

public class Countdigits {

    public static void main(String []args){
//        Scanner co = new Scanner(System.in);
//        System.out.print("Enter a number: ");
//        int num = co.nextInt();
//        int count = 0;
//
//        if (num == 0) {
//            count = 1;
//        }
//
//        while (num != 0) {
//            num = num / 10;
//            count++;
//        }
//
//        System.out.println("Digits count = " + count);


       Scanner test = new Scanner(System.in);
       System.out.print("Enter student marks : ");
       int mark  = test.nextInt();

       if(mark<=39 ){
           System.out.println("Student fail");
       }else{
           System.out.println("Student pass");
       }
    }
}
