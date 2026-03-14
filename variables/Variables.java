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


    
    }
}
