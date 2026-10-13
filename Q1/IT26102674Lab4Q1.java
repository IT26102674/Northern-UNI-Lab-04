import java.util.Scanner;

public class IT26102674Lab4Q1{
	
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number");
        int number = input.nextInt();

        if (number>0)
        {
            System.out.print("The number is positive");
        
        }else if (number<0)
        {
            System.out.print("The number is Negative");
            
        }else {

            System.out.print("The number is Zero");

        }

    }
}