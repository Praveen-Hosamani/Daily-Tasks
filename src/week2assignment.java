import java.util.Scanner;

public class week2assignment {
    static void main(String[] args) {

        //Task-01
        //Even or odd number

//        Scanner a = new Scanner(System.in);
//        System.out.print(" Enter a number : ");
//
//        int number = a.nextInt();
//
//        if(number%2==0){
//            System.out.println(" The number " +number+ " is the Even number ");
//        } else{
//            System.out.println(" The number " +number+ " is the Odd number ");
//        }

        //Task-02
        //Multiplication table

//        Scanner b = new Scanner(System.in);
//        System.out.print(" Enter a number : ");
//
//        int muth = b.nextInt();
//        for(int i = 1 ; i<=10 ; i++){
//            System.out.println(+muth+ " * " + i + " = " +(muth*i));
//        }

        //Task-03
        // Simple calculator

//        Scanner p = new Scanner(System.in);
//
//        System.out.print(" Enter first number : ");
//        int x = p.nextInt();
//
//        System.out.print(" Enter second number : ");
//        int y = p.nextInt();
//
//        System.out.print(" Select Operator + , - , * , /  : ");
//        char operator = p.next().charAt(0);
//
//        switch (operator) {
//            case  '+':
//                System.out.println(" Sum of " +x+ " and " +y+ " is : " +(x+y));
//                break;
//
//            case '-':
//                System.out.println(" Subtract of " +x+ " and " +y+ " is : " +(x-y));
//                break;
//
//            case '*':
//                System.out.println(" Multiplication of " +x+ " and " +y+ " is : " +(x*y));
//                break;
//
//            case '/':
//                if (y != 0) {
//                    System.out.println("Division of " + x + " and " + y + " is : " + ((double) x / y));
//                } else {
//                    System.out.println("Division by zero is not allowed");
//                }
//                break;
//
//            default:{
//                System.out.println("You enter wrong operator");
//            }
//
//        }

        //Task-04
        // Months

        Scanner m = new Scanner(System.in);
        System.out.println(" Enter your month : ");
        int months = m.nextInt();

        switch (months) {
            case 1:
                System.out.println("January");
                break;

            case 2:
                System.out.println("February");
                break;

            case 3:
                System.out.println("March");
                break;

            case 4:
                System.out.println("April");
                break;

            case 5:
                System.out.println("May");
                break;

            case 6:
                System.out.println("June");
                break;

            case 7:
                System.out.println("July");
                break;

            case 8:
                System.out.println("August");
                break;

            case 9:
                System.out.println("September");
                break;

            case 10:
                System.out.println("October");
                break;

            case 11:
                System.out.println("November");
                break;

            case 12:
                System.out.println("December");
                break;

            default:
            System.out.println( " Months only 12 ");
        }

    }
}
