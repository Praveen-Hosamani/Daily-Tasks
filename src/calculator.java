import java.util.Scanner;

public class calculator {

    public static void main (String [] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double aa = sc.nextDouble();

        System.out.print("Enter second number: ");
        double bb = sc.nextDouble();

        System.out.print("Enter third number: ");
        double cc = sc.nextDouble();

        System.out.println("Enter operator (+ - * /): ");
        char op = sc.next().charAt(0);

        if (op == '+') {
            System.out.println(aa + bb+cc);
        } else if (op == '-') {
            System.out.println(aa - bb - bb);
        } else if (op == '*') {
            System.out.println(aa * bb * cc);
        } else if (op == '/') {
            if (bb == 0 || cc==0) {
                System.out.println("Infinity");
            } else {
                System.out.println(aa / bb / cc);
            }
        } else {
            System.out.println("Invalid operator");
        }

        sc.close();
    }
}
