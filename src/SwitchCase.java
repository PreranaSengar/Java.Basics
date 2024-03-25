import java.util.Scanner;

public class SwitchCase {
    public static void main(String args[])

    {
        // easy use of arithmetic operation in switch case you can simply solve you problems

        float a,b,c,result;
        char symbol;
        System.out.println("Enter values to calculate:");
        Scanner input = new Scanner(System.in);
        a = input.nextFloat();
        b = input.nextFloat();
        c = input.nextFloat();

        System.out.println("Enter sign (+,-,*,/,%):");
        symbol=input.next().charAt(0);
        switch (symbol){
            case '+': result=a+b+c;
                System.out.println("sum of values is: "+result);
                break;
            case '-': result=a-b-c;
                System.out.println("Sub of values is: "+result);
                break;
            case '*':result=a*b*c;
                System.out.println("product of  values is: "+result);
                break;
            case '/': result=a/b;
                System.out.println("Divisor  of these values is: "+result);
                break;
            case '%':result=a%b;
                System.out.println("modulus of these values is: "+result);
                break;
            default:
                System.out.println("not acceptable values");
        }
    }
}
