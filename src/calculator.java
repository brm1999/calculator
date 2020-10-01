//author : Bishal Raj Majumder
//Java code for a calculator

// Importing Java math libraries
import java.util.*;

// Created a class named Calculator
public class calculator {

    
 public static void main(String[] args) {

     // Used scanner to get input
    Scanner sc = new Scanner(System.in);
     
    // Instructions
    System.out.print("\nEnter two numbers: ");
     
    // nextDouble() reads the next double from the keyboard
    double first = sc.nextDouble();
    double second = sc.nextDouble();
     
     // Instructions
    System.out.print("\nEnter an operator (+, -, *, /): ");
    char op = sc.next().charAt(0);
    double result;
     
     // Used a switch case
    switch(op)
    {
        case '+':
                result = first + second;
                break;

            case '-':
                result = first - second;
                break;

            case '*':
                result = first * second;
                break;

            case '/':
                result = first / second;
                break;

            // operator doesn't match any case constant (+, -, *, /)
            default:
                System.out.printf("\nError! operator is not correct");
                return;
        }

        // To display results
        System.out.printf("\n%.1f %c %.1f = %.1f", first, op, second, result);
    }
}
