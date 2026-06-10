package FunctionInterface;
// Functional Interface annotation
// This tells Java that this interface should contain only ONE abstract method
@FunctionalInterface

// Creating interface named NumberChecker
interface NumberChecker {

    // Abstract method
    // Takes integer as parameter
    // Returns boolean value (true/false)
    boolean checkNumber(int number);
}

// Functional Interface annotation
@FunctionalInterface

// Creating interface named CharChecker
interface CharChecker {

    // Abstract method
    // Takes character as parameter
    // Returns nothing (void)
    void checkChar(char ch);
}

// Main class starts
public class Anonymousclass {

    // Static method to check whether number is prime or not
    // static -> can call directly inside main method
    // boolean -> returns true or false
    public static boolean isPrime(int number) {

        // Prime numbers are always greater than 1
        if (number <= 1) {

            // If number <=1 return false
            return false;
        }

        // Loop starts from 2
        // Runs till square root of number
        // Optimized prime checking logic
        for (int i = 2; i <= Math.sqrt(number); i++) {

            // If number divisible by i
            // then it is not prime
            if (number % i == 0) {

                // Return false
                return false;
            }
        }

        // If no factors found return true
        return true;
    }

    // Main method execution starts here
    public static void main(String[] args) {

        // Creating object of NumberChecker using Anonymous Inner Class
        NumberChecker numberChecker = new NumberChecker() {

            // Overriding interface method
            @Override
            public boolean checkNumber(int number) {

                // Calling isPrime method
                // and returning result
                return isPrime(number);
            }
        };

        // Sample number
        int num = 7;

        // Calling checkNumber method
        // If true -> prime
        if (numberChecker.checkNumber(num)) {

            // Print prime message
            System.out.println(num + " is Prime");

        } else {

            // Print not prime message
            System.out.println(num + " is Not Prime");
        }

        // Creating object of CharChecker using Anonymous Inner Class
        CharChecker charChecker = new CharChecker() {

            // Overriding interface method
            @Override
            public void checkChar(char ch) {

                // Converting character into ASCII value
                int ascii = (int) ch;

                // Checking whether ASCII value is prime
                if (isPrime(ascii)) {

                    // Print prime ASCII result
                    System.out.println("ASCII value of '" + ch + "' = "
                            + ascii + " is Prime");

                } else {

                    // Print not prime ASCII result
                    System.out.println("ASCII value of '" + ch + "' = "
                            + ascii + " is Not Prime");
                }
            }
        };

        // Calling checkChar method with character A
        charChecker.checkChar('A');
    }
}