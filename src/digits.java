import java.util.Scanner;

public class digits {

    public static void main(String [] args){
        Scanner co = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = co.nextInt();

        int length = String.valueOf(num).length();
        System.out.println("Digits count = " + length);

    }
}
