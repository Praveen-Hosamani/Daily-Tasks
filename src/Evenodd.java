import java.util.Scanner;

public class Evenodd {

    public static void main(String[] args) {
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

    }
}
