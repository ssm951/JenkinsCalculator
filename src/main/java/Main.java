import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("Welcome to the Not Normal Calculator");
        System.out.println("Type \"help\" for help. \"exit\" to terminate calculator");
        while(true) {
            System.out.print("Enter a command: ");
            Scanner scan = new Scanner(System.in);
            switch (scan.next()) {
                case "add":
                    System.out.println(calc.add(scan.nextInt(), scan.nextInt()));
                    break;
                case "subtract":
                    System.out.println(calc.subtract(scan.nextInt(), scan.nextInt()));
                    break;
                case "multiply":
                    System.out.println(calc.multiply(scan.nextInt(), scan.nextInt()));
                    break;
                case "divide":
                    System.out.println(calc.divide(scan.nextInt(), scan.nextInt()));
                    break;
                case "fibo":
                    System.out.println(calc.fibonacciNumberFinder(scan.nextInt()));
                    break;
                case "binary":
                    System.out.println(calc.intToBinaryNumber(scan.nextInt()));
                    break;
                case "exit":
                    System.out.println("Exiting.");
                    System.exit(0);
                    break;
                default:
                    printUsage();
            }
        }
    }

    private static void printUsage() {
        System.out.println("Usage: <command> <parameters>");
        System.out.println("Commands: add, subtract, multiply, divide, fibo, binary, exit, help");
    }
}
