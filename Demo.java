


public class Demo {

    public static void main(String[] args) {
        System.out.println("This is my first ever java program"); //string output using println
        System.out.print("This is the second line "); // string output using print which doesn't print the string in new line
        System.out.println(2 + 2); // performing addition inside the println
        System.out.println(3 + 9); // same as above
        System.out.println(9 + 9); //same as above
        String name = "krish"; // creating string variable 
        int a = 2 + 2; // creating int varible for addition
        System.out.println(name + " " + a); // printing varibles string + int together 
        boolean b;
        b = true;
        System.out.println(b); // printing varible without assigning value when creating
        int num = 1;
        num = 2;
        System.out.println(num); // updating the value of num after assigning a value to it.
        // final String name1 = "krish1";
        // name1 = "chris";
        // System.out.print(name1); // final keyword used to make the declared variable value unchangable.
        String name1 = "Navaneetha ";
        String name2 = "Krishnan";
        final String fullName = name1 + name2;
        int number1 = 1;
        int number2 = 2;
        final int c = number1 + number2;
        System.out.println(fullName);// adding two string variables
        System.out.println(c);// adding two integer variables
        String firstName = "Navaneetha ", lastName = "Krishnan";
        System.out.println(firstName + lastName); // declaring two variable of same type in single line 

        //student data static
        String stuName = "Navaneetha Krishnan";
        int stuId = 12;
        String stuDept = "Computer Science";
        int stuAge = 23;

        System.out.println("Name: " + stuName);
        System.out.println("ID: " + stuId);
        System.out.println("Age: " + stuAge);
        System.out.println("Department: " + stuDept);

        //Area of rectangle in float note: f is used to mention float and d is used to mention double at the end of the value
        float length = 10.5f;
        float breadth = 9.2f;

        float area = length * breadth;

        System.out.println("Length: " + length);
        System.out.println("Breadth: " + breadth);
        System.out.println("Area of Rectangle: " + area);

        char myVar1 = 65, myVar2 = 66, myVar3 = 67; // ASCII value can be displayed using char keyword for appropriate ASCII value numbers.

        System.out.println(myVar1);
        System.out.println(myVar2);
        System.out.println(myVar3);

        /*  type casting widening casting and narrow casting 
              Widening Casting (automatically) - converting a smaller type to a larger type size
                byte -> short -> char -> int -> long -> float -> double

              Narrowing Casting (manually) - converting a larger type to a smaller size type
                double -> float -> long -> int -> char -> short -> byte      
         */
        int cast1 = 1;
        float floatValue = cast1;
        System.out.println(floatValue);// widening casting 

        float cast2 = 1.7f;
        int intValue = (int) cast2;
        System.out.println(intValue);//narrowing casting

        // calculating percentage 
        int maxScore = 500;

        int myScore = 484;

        float percentage = (float) myScore / maxScore * 100f;
        System.out.println(percentage);
        System.out.println(myScore < maxScore);
        System.out.println(myScore < maxScore || maxScore > myScore); // or operator
        System.out.println(myScore < maxScore && maxScore < myScore); // and operator

        //string methods 
        String stringMethod1 = "Navaneetha Krishnan";
        String stringMethod2 = " M.Sc Computer Science";
        String stringMethod3 = "Hi! this is me\n\t \"Navaneetha Krishnan\""; // to include quotes inside a string "\" should be used
        System.out.println(stringMethod1.length()); // to check the length of the string
        System.out.println(stringMethod1.toUpperCase()); // to change the string to uppercase 
        System.out.println(stringMethod1.toLowerCase()); // to change the string to lowercase
        System.out.println(stringMethod1.indexOf("Navaneetha")); // to find the position of the word in a string
        System.out.println(stringMethod1.concat(stringMethod2));// joining to string as well as "+" can be used.
        System.out.println(stringMethod3);

        //math class
        System.out.println(Math.max(10, 20));
        System.out.println(Math.min(10, 20));
        System.out.println(Math.abs(-1.712));
        System.out.println(Math.sqrt(9));
        System.out.println((int) (Math.random() * 101));// to get random number b/w 0 to 100

        //if..else
        int voteAge = 18;
        int myAge;
        myAge = 18;
        if (myAge > voteAge) {
            System.out.println("You can vote");
        } else if (myAge == voteAge) {
            System.out.println("Need to verify the month");
        } else {
            System.out.println("You cannot vote");
        }

        // if else in single line using ternary operator 
        // syntax : variable = (condition) ? expressionTrue :  expressionFalse;
        myAge = 19;
        String canVote = (myAge > voteAge) ? "You can vote " : "You cannot vote";
        System.out.println(canVote);

        //switch statment
        /*The switch expression is evaluated once.
        The value of the expression is compared with the values of each case.   
        If there is a match, the associated block of code is executed.
        The break and default keywords are optional, and will be described later in this chapter */
        // syntax
        /*
         switch(expression) {
          case x:
            // code block
            break;
          case y:
            // code block
            break;
            default:
            // code block
        }
         */
        int day = 5;

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("enter number between 1 to 7");
        }

        /* also can be written as
         switch (day) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> throw new AssertionError();
        }
         */
        //while loop
        myAge = 1;
        while (myAge < voteAge) {
            System.err.println(myAge);
            myAge++;
        }
        //if condition inside while loop
        myAge = 1;
        while (myAge <= voteAge) {
            if (myAge >= voteAge) {
                System.out.println("You can vote");

            } else {
                System.out.println("You cannot vote");
            }
            myAge++;
        }

        //for loop
        for (int loope = 0; loope < 10; loope++) {

            if (loope % 2 == 0) {
                System.out.println("the even number is" + loope);
            } else {
                System.out.println("the odd number is" + loope);
            }

        }

        //just a try using ternary if condition inside while to check whether output will display or not.
        int iWhile = 0;
        while (iWhile <= 100) {
            String message = (iWhile % 2 == 0) ? "The number is even: " + iWhile : "The number is odd: " + iWhile;
            System.out.println(message);
            iWhile++;

        }
        // Outer loop
        for (int i = 1; i <= 2; i++) {
            System.out.println("Outer: " + i); // Executes 2 times

            // Inner loop
            for (int j = 1; j <= 3; j++) {
                System.out.println(" Inner: " + j); // Executes 6 times (2 * 3)
            }
        }

        // for each loop for Array 
        /*
           Syntax
           for (type variableName : arrayName)
         */
        String[] cars = {"tata", "bmw", "tesla", "audi"};
        System.out.println("The Car list is...");
        for (String i : cars) {
            System.out.println(i);
        }

        // multiplication table using for loop
        for (int table3 = 1; table3 < 20; table3++) {
            System.out.println(table3 + " x 3 " + " = " + table3 * 3);
        }

        // break statement
        int i = 0;
        while (i < 10) {
            System.out.println(i);
            i++;
            if (i == 4) {
                break;
            }
        }

        // calculating the average of an array
        int ages[] = {20, 22, 18, 35, 48, 26, 87, 70};

        float sum = 0, avg;
        for (float sumNum : ages) {
            sum = sum + sumNum;
        }
        int lengthArray = ages.length;
        avg = sum / lengthArray;
        System.out.println(avg);
// calculate the lowest number in the array
        int lowAge = ages[0];
        for (int low : ages) {
            if (lowAge > low) {
                lowAge = low;
            }

        }
        System.out.println(lowAge);
// factorial using while and if condition
        int fact = 3;
        int factresult = 1;
        if (fact == 0) {
            System.out.println("1");
        } else {
            while (fact > 0) {
                factresult = factresult * fact;

                fact--;
            }

        }
        System.out.println(factresult);

       

        //methods
        myMethod("\"Navaneetha Krishnan\"", 23);
        int myMeh = myMethod1(10.5);
        System.out.println(myMeh);
        ifelse(3);

        System.out.println(facto(4));
        System.out.println(addNumber(3, 4));

    }
// method called using void

    public static void myMethod(String a, int b) {
        System.out.println(a + " Hi I'm from the myMethod and My age is " + b);
    }

    ;
//method using return type
    public static int myMethod1(double a) {

        int b = (int) a;
        return b;

    }

    //if else using method 
    public static void ifelse(int a) {
        if (a < 18) {
            System.out.println("you cannot vote");

        } else {
            System.out.println("you can vote");
        }
    }
    // factorial using method recursion

    public static int facto(int a) {
        if (a == 0) {
            return 1;
        }

        return a * facto(a - 1);
    }

    //recursion to add all number between two numbers
    public static int addNumber(int a, int b) {
        if (b > a) {
            return b + addNumber(a, b - 1);
        } else {
            return b;

        }
    }
}
