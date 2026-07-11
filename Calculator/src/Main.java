import java.util.Scanner;

public class Main {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    double num1;
    System.out.print("enter the first number: ");
    num1 = scanner.nextDouble();

    System.out.print("operation to be performed(+,-,*,/,%,^): ");
    char operator;
    operator = scanner.next().charAt(0);

    double num2;
    System.out.print("enter the second number: ");
    num2 = scanner.nextDouble();

    double result;
    switch(operator){
        case '+':
            result = num1 + num2;
            System.out.println("the result of the operation is: " + result);
            break;
        case '-':
            result = num1 - num2;
            System.out.println("the result of the operation is: " + result);
            break;
        case '*':
            result = num1 * num2;
            System.out.println("the result of the operation is: " + result);
            break;
        case '/':
            if(num2==0){
                System.out.println("can't divide by Zero!");
                break;
            }
            result = num1 / num2;
            System.out.println("the result of the operation is: " + result);
            break;
        case '%':
            result = num1 % num2;
            System.out.println("the result of the operation is: " + result);
            break;
        case '^':
            result = Math.pow(num1, (int)num2);
            System.out.println("the result of the operation is: " + result);
            break;
        default:
            System.out.println("not a specified operation!");
            break;

    }

    scanner.close();
    }
}
