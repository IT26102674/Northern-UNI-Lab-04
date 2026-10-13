import java.util.Scanner;

public class IT26102674Lab4Q3{
	
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int number = input.nextInt();
        
        String value = (number>0) ? "positive" : (number<0) ? "negative" : "zero";
        
        System.out.print("The number is " + value);
        
          
    }
}