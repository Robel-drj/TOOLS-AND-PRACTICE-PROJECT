
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
            System.out.println("     =>press 6 to view developers");
            System.out.println("     =>press 7 to exit");
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
                 case 6 -> developers();
                case 7 -> {
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

    }

    public static void sqr() {
        double num;
        Scanner in = new Scanner(System.in);
        System.out.print("please eneter the number want to know squer root:".toUpperCase());
        num = in.nextDouble();
        System.out.println("your number squer root=" + Math.sqrt(num));
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
        } while (inp != "exit" && inp != "y");
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
}