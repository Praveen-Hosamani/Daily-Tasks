public class Teacher {
    static void main(String[] args) {
        //Data Types
        int a = 10;
        double b = 20.10;
        String c = "Praveen";
        char d = 's';

        System.out.println(a+ " this is int");
        System.out.println(b+ " this is double");
        System.out.println(a + b);

        //Operations
        int x = 15 , y=5;
        System.out.println("sum of " +x+ " and " +y+ " is : " +(x+y));
        System.out.println("subtract of " +x+ " and " +y+ " is : " +(x-y));
        System.out.println("multiplication of " +x+ " and " +y+ " is : " +(x*y));
        System.out.println("division of " +x+ " and " +y+ " is : " +(x/y));

        //Condition statements
        // 1) if else
        int marks = 50;
        if(marks>=40){
            System.out.println("student pass");
        } else{
            System.out.println("student fail");
        }

        // 2) else if
        int studentMarks = 90;
        if(studentMarks>=90){
            System.out.println("grade A");
        } else if(studentMarks>=75){
            System.out.println(" grade B");
        } else if(studentMarks>=60){
            System.out.println(" grade C");
        } else if(studentMarks>=35){
            System.out.println(" grade pass");
        } else{
            System.out.println("fail");
        }

    }
}
