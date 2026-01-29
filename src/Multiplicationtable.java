import java.util.Scanner;

public class Multiplicationtable {
    public static void main(String [] args){
        Scanner b = new Scanner(System.in);
        System.out.print(" Enter a number : ");
        int muth = b.nextInt();

        for(int i = 1 ; i<=10 ; i++){
            System.out.println(+muth+ " * " + i + " = " +(muth*i));
       }

    }
}
