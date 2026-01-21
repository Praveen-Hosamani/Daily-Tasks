public class level1 {
    static void main(String[] args) {
        // ................20-01-2026...............
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

        //Switch statement
        int day = 2;
        switch (day){
            case 1:
                System.out.println("Sunday");
                break;

            case 2:
                System.out.println("Monday");
                break;

            case 3:
                System.out.println("Tuesday");
                break;

            case 4:
                System.out.println("Wednesday");
                break;

            case 5:
                System.out.println("Thursday");
                break;

            case 6:
                System.out.println("Friday");
                break;

            case 7:
                System.out.println("Saturday");
                break;

            default:
            System.out.println("Invalid Day");

        }

        //.............21-1-2026..............

        //Task-01 Even or Odd
        int a1 = 20;
        if(a1%2==0){
            System.out.println(a1 + " is the Even number ");
        } else{
            System.out.println(a1+ " is the Odd number ");
        }

        //Task-02 Positive, Negative or Zero
        int a2 = 10;
        if(a2>=0){
            System.out.println( a2+ " is the positive number ");
        } else if(a2<0){
            System.out.println(a2+ " is the negative number ");
        }else{
            System.out.println(a2+ " is the equal to 0 ");
        }

        //Task-03 Largest of Two Numbers
        int b1 = 10, b2 = 20;
        if(b1<b2){
            System.out.println(b2 + " is the greater than " +b1);
        } else if(b1==b2){
           System.out.println(b1 + " and " +b2+ " is both are equal ");
        } else{
            System.out.println(b1 + " is the less than " +b2);
        }

        //Task-04 Voting Eligibility
        int age = 17;
        if(age>=18){
            System.out.println("Your age is : " +age+ " so you can vote ");
        } else{
            System.out.println("Your age is : " +age+ " so you cannot be vote ");
        }
    }
}
