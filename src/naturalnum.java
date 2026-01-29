import java.util.Scanner;

public class naturalnum {
    public static void main(String [] args){
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
    }
}
