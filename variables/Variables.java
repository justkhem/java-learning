// ============================================
// Variables & Data Types - Practice
// ============================================

public class Variables {

    public static void main(String[] args) {

        // ── 1. Basic Variables ──────────────────
        String name = "Khem Raj";   // Names should be stored as String
        int age = 25;               // Whole numbers should be stored as int

        System.out.println(name);
        System.out.println(age);

        // System.out.println(...) prints the text and moves cursor to a new line
        // Concatenation (joining things together with +)
        System.out.println("Hi, I am " + name + ", and I am " + age + " years old.");
        // Always end statements with ;


        // ── 2. Profile ──────────────────────────
        String city = "Fukuoka";
        int luckyNum = 9;
        String favFood = "Ramen";

        System.out.println("I live in " + city + ", my lucky number is " + luckyNum + ", and I love " + favFood + "!");


        // ── 3. Age Calculator ───────────────────
        int currentYear = 2026;
        int dob = 2001;
        int myAge = currentYear - dob;

        System.out.println(myAge);  // prints calculated age

        // Recalculating date of birth from age
        // Note: you can't redeclare a variable with its type (e.g. int dob = ...) — just reassign it
        dob = currentYear - myAge;
        System.out.println(dob);

        // int is a primitive data type


        // ── 4. Shopping ─────────────────────────
        // double is used to store numbers with decimals
        double price = 48.99;
        int quantity = 9;
        double total = price * quantity;

        System.out.println(total);
        System.out.println("Apple was " + price + " per/kg. So I bought " + quantity + " kgs of apple for " + total + ".");

        // Recalculating price per kg
        price = total / quantity;
        System.out.println("The apple was " + price + " per/kg.");

        //Boolean & char
        //Boolean is also a primitive data type, for stating if the statement is true or false
        //Char for storing single character, should place inside ''

        boolean isStudying = true;
        boolean isNotStudying = false;

        System.out.println("Khem is not studying. -> " + isNotStudying);
        System.out.println("Khem is studying. ->" + isStudying);

        //char

        char myGrade = 'A';
        float myPercentage = 83.23f;
        System.out.println("My grade is " + myGrade + "My percentage is " + myPercentage +"%.");


        //Java Type Casting

        //Widening casting (Converting smaller size type to larger)

        int myInt = 9;
        double myDouble = myInt;

        System.out.println(myDouble);

        //Narrowing casting (Converting larger size type to smaller)

        double myDoble = 9.79d;
        int myInT = (int) myDoble;

        System.out.println(myInT);



        // Compound Assignment Operators
        // Used for adjustng the values

        int score = 5;
        score += 6; //Addition (Has all arthemetic operators. -> check notes.md)

        System.out.println(score);


        // Order of Operations: PEMDAS
        // 1. Parenthess
        // 2. Exponents
        // Modulo / Multiplication / Division (left to right)
        // 4. Addition / Subtraction (left to right)

        int num = 12 / (10 - 4) + 4 * 2;
        // Step 1: (10 - 4) = 6
        // Step 2: 12 / 6 = 2
        // Step 3: 4 * 2 = 8
        // Step 4: 2 + 8 = 10
        System.out.println(num); // 10

        // Greater Than and Less Than
        int a = 10;
        int b = 5;

        System.out.println(a > b);  // true  (10 is greater than 5)
        System.out.println(a < b);  // false (10 is not less than 5)
        System.out.println(a >= 10); // true  (10 is equal to 10)
        System.out.println(a <= 4);  // false (10 is not less than or equal to 4)


        // Equals and Not Equals
        // for checking whether the value of the variables are smae or different
        int numberOfCars = 13;
        int numberOfBus = 12;
        
        boolean sameNumberOfVehicles = numberOfCars == numberOfBus;
        boolean differenceInNumbers = numberOfCars != numberOfBus;
        System.out.println(sameNumberOfVehicles); //false
        System.out.println(differenceInNumbers); //true

        // Greater/Less Than or Equal To
        // Checking whether one variable's value is greater/less than, or equals to that of another

        double mySalary = 28 * 1200; // My actual salary
        double myExpectedSalary = 100000; // Expected salary for this month

        boolean thisMonthPay = myExpectedSalary >= mySalary; // Whether true or false

        System.out.println(thisMonthPay); //true

        // .equals()
        // use for checking whether a date stored in the variable is equal, for String

        // Suppose in a website 3 people entered their name and now we wanna check if two variables has the same name

        String person1 = "David";
        String person2 = "Alex";
        String person3 = "David";

        System.out.println(person1.equals(person2)); //false
        System.out.println(person1.equals(person3)); //true

        // String Concatenation
        // Its is joining things together into a sentence.

        //　Example: 
        // My name is Khem and i wanna say "Hello Khem", so using String Concatenation we can do:

        String myName = "Khem";
        System.out.println("Hello " + myName); //prints Hello Khem

        // final keyword
        // giving specific/constant value to a varibale, that's unchangeable

        final double VALUE_OF_PI = 3.14;
        //Java won't give you an error if you write: valueOfPie

        System.out.println(VALUE_OF_PI);











    
    }
}
