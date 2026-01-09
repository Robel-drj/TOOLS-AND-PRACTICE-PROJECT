
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
            System.out.println("     =>press 12 to view developers");
            System.out.println("     =>press 13 to exit");
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
                 case 12 -> developers();
                case 13-> {
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

  
}