import java.util.ArrayList;

public class Loops {
     static void main(String [] args){

         //Loops concepts
         for(int a=1; a<=5; a++){
             System.out.println(a);
         }

         String name = "Welcome to GPT Mudhol";
         for(int i = 0; i<name.length();i++){
             System.out.println(name.charAt(i));
         }

         //ArrayList concepts
         ArrayList<Integer> numbers = new ArrayList<>();
         numbers.add(10);
         numbers.add(20);
         numbers.add(30);
         numbers.add(40);
         numbers.add(50);
         System.out.println(numbers);
         System.out.println(numbers.remove(2));
         System.out.println(numbers);
         System.out.println(numbers.remove(Integer.valueOf(50)));
         numbers.set(1,1000);
         System.out.println(numbers);
    }
}
