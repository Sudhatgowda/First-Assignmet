import java.util.Scanner;

public class sudhswitch {
    public static void main(String[] args) {

        double num1, num2, num3 = 0;
        char oper;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any two numbers");
        num1 = scan.nextDouble();
        num2 = scan.nextDouble();
        System.out.println("enter operator");
        oper = scan.next().charAt(0);
        switch (oper) {

            case '+':
                num3 = num1 + num2;
                System.out.println("Addition Result is " + num3);
                break;

            case '-':
                num3 = num1 - num2;
                System.out.println("Substraction Result is " + num3);
                break;

            case '*':
                num3 = num1 * num2;
                System.out.println("Addition Result is " + num3);
                break;

            case '/':
                num3 = num1 / num2;
                System.out.println("Addition Result is " + num3);
                break;

            default:
                System.out.println("Invalid Operator");
        }
    }
}