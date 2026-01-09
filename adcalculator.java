
import java.util.InputMismatchException;
import java.util.Scanner;

public class adcalculator {
    static public void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ch;
        do {
            System.out.println("******************************************");
            System.out.println("        WELCOME TO MY FIRST JAVA CALCULATOR!!");
            System.out.println("******************************************");
            System.out.println("     =>press 1 to addition");
            System.out.println("     =>press 2 to substruction");
            System.out.println("     =>press 3 to multiplication");
            System.out.println("     =>press 4 to division");
            System.out.println("     =>press 5 to squer root");
            System.out.println("     =>press 6 to power(Exponent)");
            System.out.println("     =>press 7 to Modulus operation");
            System.out.println("     =>press 8 to Percentage operation");
            System.out.println("     =>press 9 to factorial operation");
            System.out.println("     =>press 10 to average operation");
            System.out.println("     =>press 11 to absolute value operation");
            System.out.println("     =>press 12 to Logarithm operation");
            System.out.println("     =>press 13 to Trigonometry operation");
            System.out.println("     =>press 13 to prime check");
            System.out.println("     =>press 13 to GCD operation");
            System.out.println("     =>press 13 to LCM operation");
            System.out.println("     =>press 14 to view developers");
            System.out.println("     =>press 15 to exit");
            System.out.print("         =>please enter ur chooise:".toUpperCase());
            ch = input.nextInt();
            System.out.println("");
            switch (ch) {
                case 1 -> {
                    addition();
                    addmore();
                }
                case 2 -> {
                    substruction();
                    addmores();
                }
                case 3 -> {
                    multiplication();
                    addmorem();
                }
                case 4 -> {
                    division();
                    addmored();
                }
                case 5 -> {
                    sqr();
                    addmoreq();
                }
                case 6 -> {
                    power();
                    addmorep();
                }
                case 7 -> {
                    modulus();
                    addmoremod();
                }
                case 8 -> {
                    percentage();
                    addmoreper();
                }
                  case 9 -> {
                    factorial();
                    addmoref();
                }
                  case 10 -> {
                   absolute();
                    addmoreabs();
                }
                  case 11 -> {
                    average();
                    addmoreavg();
                }
                case 12 -> {
                    logarithm();
                    addmoreLog();
                }
                case 13 -> {
                    trigonometric();
                    addmoreTrig();
                }
                case 14 -> {
                    primeCheck();
                    addmorePrime();
                }
                case 15 -> {
                    gcdOperation();
                    addmoreGCD();
                }
                case 16 -> {
                    lcmOperation();
                    addmoreLCM();
                }
                 case 17 -> developers();
                case 18-> {
                }
                default -> System.out.println(" \"error\"please enter the correct chooise".toUpperCase());
            }
        } while (true);
    }

    public static void developers() {
        System.out.println("Group Member");
        System.out.println("1.sosina yeshidenber");
        System.out.println("2.fiker bilelegn");
        System.out.println("3.mihret girma");
        System.out.println("4.yonaf amsalu");
        System.out.println("5.robel dereje");

    }

    public static void addition() {

    Scanner input = new Scanner(System.in);
    final int MAX_NUMBERS = 20;  // limit to prevent too many inputs
    int n = 0;

    // Ask user how many numbers to add
    while (true) {
        System.out.print("How many numbers do you want to add? ");
        try {
            n = input.nextInt();
            if (n < 2) {
                System.out.println("Addition requires at least 2 numbers. Please try again.");
                continue;
            }
            if (n > MAX_NUMBERS) {
                System.out.println("Too many numbers! Maximum allowed is " + MAX_NUMBERS);
                continue;
            }
            break; // valid number of inputs
        } catch (InputMismatchException e) {
            System.out.println("Invalid input! Please enter an integer.");
            input.next(); // clear invalid input
        }
    }

    double result = 0;
    String expression = "";

    // Get the first number
    for (int i = 1; i <= n; i++) {
        while (true) {
            System.out.print("Enter number " + i + ": ");
            try {
                double num = input.nextDouble();
                result += num;

                // Build expression string
                if (i == 1) {
                    expression += num;
                } else {
                    expression += " + " + num;
                }

                break; // exit inner while loop if valid
            } catch (InputMismatchException e) {
                System.out.println("Invalid number! Please enter a valid numeric value.");
                input.next(); // clear invalid input
            }
        }
    }

    // Display the result
    System.out.println(expression + " = " + result);
    }

    public static void substruction() {
        Scanner input=new Scanner(System.in);
        final int MAX_NUMBERS=20;
         int n=0;
         System.out.println("How many numbers do you want to subtruct? ");
         try {
            n= input.nextInt();
            if(n<2){
                System.out.println("Subtraction requires at least 2 numbers. ");
                
            }
            if(n>MAX_NUMBERS){
                System.out.println("Too many numbers! Maximum allowed is "+ MAX_NUMBERS);
            }
             
         } catch (InputMismatchException e) {
            System.out.println("Invalid input! Enter an integer. ");
            input.next();
         }
         double result =0;
         String expression= "";
         System.out.println("Enter number 1: ");
         try {
             result=input.nextDouble();
             expression+= result;
         } catch (InputMismatchException e) {
            System.out.println("Invalid number! ");
            input.next();
         }
         for(int i=2; i<=n; i++){
            System.out.println("Enter number"+i+": ");
            try {
                double num= input.nextDouble();
                result-=num;
                expression+= " - "+num;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Try again.");
                input.next();
                i--;
            }
         }
         System.out.println(expression + " ="+result);
         if(result<0)
         System.out.println("Warning: ");
    }

    public static void multiplication() {

    }

    public static void division() {
    Scanner input = new Scanner(System.in);

    try {
        System.out.println("----- DIVISION OPERATION -----");

        // Ask for numerator
        System.out.print("Enter numerator: ");
        double numerator = input.nextDouble();

        // Ask for denominator
        System.out.print("Enter denominator: ");
        double denominator = input.nextDouble();

        // Check division by zero
        if (denominator == 0) {
            System.out.println("Error: Division by zero is not allowed.");
            return;
        }

        // Perform division
        double result = numerator / denominator;

        // Display result
        System.out.println(numerator + " / " + denominator + " = " + result);

    } catch (InputMismatchException e) {
        System.out.println("Invalid input! Please enter numeric values only.");
        input.next(); // clear invalid input
    }
}


    public static void sqr() {
        double num;
        Scanner in = new Scanner(System.in);
        System.out.print("please eneter the number want to know squer root:".toUpperCase());
        num = in.nextDouble();
        System.out.println("your number squer root=" + Math.sqrt(num));
    }
  
  public static void power() {
    Scanner in = new Scanner(System.in);
    double base, exponent;

    System.out.print("ENTER BASE NUMBER: ");
    base = in.nextDouble();

    System.out.print("ENTER EXPONENT: ");
    exponent = in.nextDouble();

    System.out.println("RESULT = " + Math.pow(base, exponent));
}
 
 public static void modulus() {
    Scanner in = new Scanner(System.in);

    try {
        System.out.print("ENTER FIRST NUMBER: ");
        int a = in.nextInt();

        System.out.print("ENTER SECOND NUMBER: ");
        int b = in.nextInt();

        if (b == 0) {
            System.out.println("CANNOT MOD BY ZERO!");
            return;
        }

        System.out.println("RESULT = " + (a % b));
    } catch (InputMismatchException e) {
        System.out.println("INVALID INPUT! ENTER INTEGERS ONLY.");
        in.next();
    }
}

public static void percentage() {
    Scanner in = new Scanner(System.in);
    double total, percent;

    System.out.print("ENTER TOTAL NUMBER: ");
    total = in.nextDouble();

    System.out.print("ENTER PERCENTAGE: ");
    percent = in.nextDouble();

    System.out.println("RESULT = " + (total * percent / 100));
}

public static void factorial() {
    Scanner in = new Scanner(System.in);

    try {
        System.out.print("ENTER A NUMBER: ");
        int num = in.nextInt();

        if (num < 0) {
            System.out.println("FACTORIAL NOT DEFINED FOR NEGATIVE NUMBERS.");
            return;
        }

        long fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }

        System.out.println("FACTORIAL = " + fact);
    } catch (InputMismatchException e) {
        System.out.println("INVALID INPUT! ENTER AN INTEGER.");
        in.next();
    }
}
public static void absolute() {
    Scanner in = new Scanner(System.in);

    try {
        System.out.print("ENTER A NUMBER: ");
        double num = in.nextDouble();

        System.out.println("ABSOLUTE VALUE = " + Math.abs(num));
    } catch (InputMismatchException e) {
        System.out.println("INVALID INPUT! ENTER A NUMBER.");
        in.next();
    }
}
public static void average() {
    Scanner in = new Scanner(System.in);

    int n;
    try {
        System.out.print("HOW MANY NUMBERS DO YOU WANT TO AVERAGE? ");
        n = in.nextInt();

        if (n <= 0) {
            System.out.println("NUMBER COUNT MUST BE GREATER THAN 0.");
            return;
        }

        if (n > 100) {
            System.out.println("TOO MANY NUMBERS! MAX IS 100.");
            return;
        }
    } catch (InputMismatchException e) {
        System.out.println("INVALID INPUT! ENTER AN INTEGER.");
        in.next();
        return;
    }

    double sum = 0;

    for (int i = 1; i <= n; i++) {
        try {
            System.out.print("ENTER NUMBER " + i + ": ");
            sum += in.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("INVALID NUMBER! TRY AGAIN.");
            in.next();
            i--; // retry same index
        }
    }

    double avg = sum / n;
    System.out.println("AVERAGE = " + avg);
}

public static void logarithm() {
     Scanner input = new Scanner(System.in);
    double num = 0;
    boolean validInput = false;

    System.out.println("----- LOGARITHM OPERATION -----");

    // Get positive number from user
    while (!validInput) {
        try {
            System.out.print("Enter a positive number to find log base 10: ");
            num = input.nextDouble();

            if (num <= 0) {
                System.out.println("Error: Logarithm is undefined for zero or negative numbers.");
            } else {
                validInput = true; // input is valid
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input! Please enter a numeric value.");
         input.next(); // clear invalid input
        }
    }

    // Perform calculation
    double result = Math.log10(num);

    // Display result
    System.out.println("Log10(" + num + ") = " + result);
}

// Addmore function for logarithm
public static void addmoreLog() {
    String inp;
     Scanner input = new Scanner(System.in);
    do {
        System.out.println("Do you want to perform logarithm again? Press 'y' for yes, anything else to return to menu.");
        inp = input.next().toLowerCase();

        if (inp.equals("y")) {
            logarithm();
        } else {
            System.out.println("Redirecting to main menu...");
            return; // back to main menu
        }
    } while (!inp.equals("y"));
}
public static void trigonometric() {
    int choice = 0;
    boolean validChoice = false;

    System.out.println("----- TRIGONOMETRIC FUNCTIONS -----");
    System.out.println("1. sin(x)");
    System.out.println("2. cos(x)");
    System.out.println("3. tan(x)");

    // Choose function
    while (!validChoice) {
        Scanner input = new Scanner(System.in); 
        try {
            System.out.print("Choose function (1-3): ");
            choice = input.nextInt();

            if (choice < 1 || choice > 3) {
                System.out.println("Invalid choice! Please enter 1, 2, or 3.");
            } else {
                validChoice = true;
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input! Enter an integer choice.");
            input.next(); // clear invalid input
        }
    }

    // Enter angle in degrees
    double angle = 0;
    boolean validAngle = false;

    while (!validAngle) {
        Scanner input = new Scanner(System.in); 
        try {
            System.out.print("Enter the angle in degrees: ");
            angle = input.nextDouble();
            validAngle = true;
        } catch (InputMismatchException e) {
            System.out.println("Invalid input! Please enter a numeric value for the angle.");
            input.next(); // clear invalid input
        }
    }

    double radians = Math.toRadians(angle); // convert to radians
    double result = 0;

    // Perform calculation
    switch (choice) {
        case 1 -> result = Math.sin(radians);
        case 2 -> result = Math.cos(radians);
        case 3 -> {
            if (Math.cos(radians) == 0) { // tangent undefined
                System.out.println("Error: Tangent is undefined at " + angle + " degrees.");
                return; // exit method
            }
            result = Math.tan(radians);
        }
    }

    // Display result
    String func = (choice == 1) ? "sin" : (choice == 2) ? "cos" : "tan";
    System.out.println(func + "(" + angle + " degrees) = " + result);
}
public static void primeCheck() {
    int num = 0;
    boolean validInput = false;

    System.out.println("----- PRIME NUMBER CHECK -----");

    while (!validInput) {
        try {
            System.out.print("Enter a positive integer to check if it's prime: ");
            

            if (num <= 0) {
                System.out.println("Please enter a positive integer greater than 0.");
            } else {
                validInput = true;
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input! Please enter an integer.");
            
        }
    }

    boolean isPrime = true;

    if (num == 1) {
        isPrime = false;
    } else {
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
    }

    if (isPrime) {
        System.out.println(num + " is a prime number.");
    } else {
        System.out.println(num + " is NOT a prime number.");
    }
}




public static void gcdOperation() {
    int a = 0, b = 0;
    boolean validInput = false;

    System.out.println("----- GCD CALCULATION -----");

    while (!validInput) {
        try {
            System.out.print("Enter first positive integer: ");
            
            System.out.print("Enter second positive integer: ");
           

            if (a <= 0 || b <= 0) {
                System.out.println("Both numbers must be positive integers.");
            } else {
                validInput = true;
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input! Please enter integers.");
            
        }
    }

    // Euclidean algorithm
    int x = a, y = b;
    while (y != 0) {
        int temp = y;
        y = x % y;
        x = temp;
    }

    System.out.println("GCD of " + a + " and " + b + " is: " + x);
}
 public static void lcmOperation() {
    int a = 0, b = 0;
    boolean validInput = false;

    System.out.println("----- LCM CALCULATION -----");

    while (!validInput) {
        try {
            System.out.print("Enter first positive integer: ");
            
            System.out.print("Enter second positive integer: ");
           

            if (a <= 0 || b <= 0) {
                System.out.println("Both numbers must be positive integers.");
            } else {
                validInput = true;
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input! Please enter integers.");
            
        }
    }

    // LCM using formula: LCM(a, b) = |a*b| / GCD(a, b)
    int gcd = a, temp = b;
    while (temp != 0) {
        int t = temp;
        temp = gcd % temp;
        gcd = t;
    }

    int lcm = (a * b) / gcd;
    System.out.println("LCM of " + a + " and " + b + " is: " + lcm);
}

// Addmore function for trigonometric operations
public static void addmoreTrig() {
    String inp;
    Scanner input = new Scanner(System.in); 
    do {
        System.out.println("Do you want to perform trigonometric calculation again? Press 'y' for yes, anything else to return to menu.");
        inp = input.next().toLowerCase();

        if (inp.equals("y")) {
            trigonometric();
        } else {
            System.out.println("Redirecting to main menu...");
            return; // back to main menu
        }
    } while (!inp.equals("y"));
}
    public static void addmore() {
        Scanner input = new Scanner(System.in);
        String inp = "";
        do {
            System.out.println("if u want add more press \"y\" else write \"anything\" ".toUpperCase());
            inp = input.next().toLowerCase();
            switch (inp) {
                case "y":
                    addition();
                    break;
                case "exit":
                default:
                    System.out.println("       redirecting to home page".toUpperCase());
                    adcalculator.main(null);
                    break;
            }
        } while (inp != "exit");
    }

    public static void addmores() {
        Scanner input = new Scanner(System.in);
        String inp = "";
        do {
            System.out.println("if u want add more press \"y\" else write \"anything\" ".toUpperCase());
            inp = input.next().toLowerCase();
            switch (inp) {
                case "y":
                    substruction();
                    break;
                case "exit":
                default:
                    System.out.println("       redirecting to home page".toUpperCase());
                    adcalculator.main(null);
                    break;
            }
        } while (!"exit".equals(inp) && inp != "y");
        System.out.println("error");
    }

    public static void addmorem() {
        Scanner input = new Scanner(System.in);
        String inp = "";
        do {
            System.out.println("if u want add more press \"y\" else write \"anything\" ".toUpperCase());
            inp = input.next().toLowerCase();
            switch (inp) {
                case "y":
                    multiplication();
                    break;
                case "exit":
                default:
                    System.out.println("       redirecting to home page".toUpperCase());
                    adcalculator.main(null);
                    break;
            }
        } while (inp != "exit");
    }

    public static void addmored() {
        Scanner input = new Scanner(System.in);
        String inp = "";
        do {
            System.out.println("if u want add more press \"y\" else write \"anything\" ".toUpperCase());
            inp = input.next().toLowerCase();
            switch (inp) {
                case "y":
                    division();
                    break;
                case "exit":
                default:
                    System.out.println("       redirecting to home page".toUpperCase());
                    adcalculator.main(null);
                    break;
            }
        } while (inp != "exit");
    }

    public static void addmoreq() {
        Scanner input = new Scanner(System.in);
        String inp = "";
        do {
            System.out.println("if u want add more press \"y\" else write \"anything\" ".toUpperCase());
            inp = input.next().toLowerCase();
            switch (inp) {
                case "y":
                    sqr();
                    break;
                case "exit":
                default:
                    System.out.println("       redirecting to home page".toUpperCase());
                    adcalculator.main(null);
                    break;
            }
        } while (inp != "exit");
    }
  public static void addmorep() {
    Scanner input = new Scanner(System.in);
    String inp = "";

    do {
        System.out.println("IF U WANT POWER AGAIN PRESS \"Y\" ELSE WRITE \"ANYTHING\"".toUpperCase());
        inp = input.next().toLowerCase();

        switch (inp) {
            case "y" -> power();
            default -> {
                System.out.println("REDIRECTING TO HOME PAGE".toUpperCase());
                adcalculator.main(null);
            }
        }
    } while (!inp.equals("exit"));
}
public static void addmoremod() {
    Scanner input = new Scanner(System.in);
    String inp = "";

    do {
        System.out.println("IF U WANT MODULUS AGAIN PRESS \"Y\" ELSE WRITE \"ANYTHING\"".toUpperCase());
        inp = input.next().toLowerCase();

        switch (inp) {
            case "y" -> modulus();
            default -> {
                System.out.println("REDIRECTING TO HOME PAGE".toUpperCase());
                adcalculator.main(null);
            }
        }
    } while (!inp.equals("exit"));
}
public static void addmoreper() {
    Scanner input = new Scanner(System.in);
    String inp = "";

    do {
        System.out.println("IF U WANT PERCENTAGE AGAIN PRESS \"Y\" ELSE WRITE \"ANYTHING\"".toUpperCase());
        inp = input.next().toLowerCase();

        switch (inp) {
            case "y":
                percentage();
                break;
            default:
                System.out.println("REDIRECTING TO HOME PAGE".toUpperCase());
                adcalculator.main(null);
                break;
        }
    } while (!inp.equals("exit"));
}
public static void addmoref() {
    Scanner input = new Scanner(System.in);
    String inp = "";

    do {
        System.out.println("IF U WANT FACTORIAL AGAIN PRESS \"Y\" ELSE WRITE \"ANYTHING\"".toUpperCase());
        inp = input.next().toLowerCase();

        switch (inp) {
            case "y":
                factorial();
                break;
            default:
                System.out.println("REDIRECTING TO HOME PAGE".toUpperCase());
                adcalculator.main(null);
                break;
        }
    } while (!inp.equals("exit"));
}
public static void addmoreabs() {
    Scanner input = new Scanner(System.in);
    String inp = "";

    do {
        System.out.println("IF U WANT ABSOLUTE AGAIN PRESS \"Y\" ELSE WRITE \"ANYTHING\"".toUpperCase());
        inp = input.next().toLowerCase();

        switch (inp) {
            case "y":
                absolute();
                break;
            default:
                System.out.println("REDIRECTING TO HOME PAGE".toUpperCase());
                adcalculator.main(null);
                break;
        }
    } while (!inp.equals("exit"));
}
public static void addmoreavg() {
    Scanner input = new Scanner(System.in);
    String inp;

    do {
        System.out.println("IF YOU WANT TO AVERAGE MORE PRESS \"y\" ELSE TYPE \"exit\"");
        inp = input.next().toLowerCase();

        if (inp.equals("y")) {
            average();
        } else {
            System.out.println("REDIRECTING TO HOME PAGE");
            adcalculator.main(null);
            return;
        }
    } while (true);
}
public static void addmorePrime() {
    String inp = null;
    do {
        System.out.println("Do you want to check another number? Press 'y' for yes, anything else to return to menu.");
        

        if (inp.equals("y")) {
            primeCheck();
        } else {
            System.out.println("Redirecting to main menu...");
            return;
        }
    } while (!inp.equals("y"));
}
  public static void addmoreGCD() {
    String inp;
     Scanner input = new Scanner(System.in); 
    do {
        System.out.println("Do you want to calculate GCD again? Press 'y' for yes, anything else to return to menu.");
        inp = input.next().toLowerCase();

        if (inp.equals("y")) {
            gcdOperation();
        } else {
            System.out.println("Redirecting to main menu...");
            return;
        }
    } while (!inp.equals("y"));
}
public static void addmoreLCM() {
    String inp;
    Scanner input = new Scanner(System.in); 
    do {
        System.out.println("Do you want to calculate LCM again? Press 'y' for yes, anything else to return to menu.");
        inp = input.next().toLowerCase();

        if (inp.equals("y")) {
            lcmOperation();
        } else {
            System.out.println("Redirecting to main menu...");
            return;
        }
    } while (!inp.equals("y"));
}

}