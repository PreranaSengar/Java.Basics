import java.util.Scanner;

public class IfElse {
        //check the year is leap or not//
        public static void main(String[] args) {
            System.out.println("enter any year:");
            Scanner input = new Scanner(System.in);
            int year = input.nextInt();
            if ((year % 4 == 0) || ((year % 400 == 0)&&(year % 100==0)))
            {
                System.out.println("year is a leap year");
            }
            else {
                System.out.println("year is not a leap year");
            }
        }
    }

