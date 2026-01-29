import java.util.Scanner;

public class week2assignment {
    static void main(String[] args) {

        //Task-01
       // Even or odd number

        Scanner a = new Scanner(System.in);
        System.out.print("Enter a number: ");

        int number = a.nextInt();

        if (number < 0) {
            System.out.println(number + " you enter negative number ");
        } else if (number % 2 == 0) {
            System.out.println("The number " + number + " is an Even number");
        } else {
            System.out.println("The number " + number + " is an Odd number");
        }


          //Task-02
    //     //Multiplication table

//        Scanner b = new Scanner(System.in);
//        System.out.print(" Enter a number : ");
//
//        int muth = b.nextInt();
//
//        for(int i = 1 ; i<=10 ; i++){
//            System.out.println(+muth+ " * " + i + " = " +(muth*i));
//        }

    //     //Task-03
    //     // Simple calculator


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

    //     //Task-04
    //     // Months

//         Scanner m = new Scanner(System.in);
//         System.out.println(" Enter your month : ");
//         int months = m.nextInt();
//
//         switch (months) {
//             case 1:
//                 System.out.println("January");
//                 break;
//
//             case 2:
//                 System.out.println("February");
//                 break;
//
//             case 3:
//                 System.out.println("March");
//                 break;
//
//             case 4:
//                 System.out.println("April");
//                 break;
//
//             case 5:
//                 System.out.println("May");
//                 break;
//
//             case 6:
//                 System.out.println("June");
//                 break;
//
//             case 7:
//                 System.out.println("July");
//                 break;
//
//             case 8:
//                 System.out.println("August");
//                 break;
//
//             case 9:
//                 System.out.println("September");
//                 break;
//
//             case 10:
//                 System.out.println("October");
//                 break;
//
//             case 11:
//                 System.out.println("November");
//                 break;
//
//             case 12:
//                 System.out.println("December");
//                 break;
//
//             default:
//             System.out.println( " Months only 12 ");
//         }

        //task-05 Count digits
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
//
//
           //count-digits
//        Scanner co = new Scanner(System.in);
//        System.out.print("Enter a number: ");
//        int num = co.nextInt();
//
//        int length = String.valueOf(num).length();
//            System.out.println("Digits count = " + length);

        //Sum of natural numbers
        Scanner x = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = x.nextInt();
        int sum = 0;
        int i = 0;


        while (i <= n) {
            sum = sum + i;
            i++;
        }

        System.out.println("Sum of first natural numbers = " + sum);
//
        }



    }

