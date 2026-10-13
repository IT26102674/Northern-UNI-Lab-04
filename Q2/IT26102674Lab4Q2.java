import java.util.Scanner;

public class IT26102674Lab4Q2{
	
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the Lab test marks :");
        double labMark = input.nextInt();

        if (labMark < 0 ||labMark > 100)
        {

            System.out.println("Please Enter the correct marks (out of 100) ...");
            return;
        }

        System.out.println("Enter the Exam marks :");
        double examMark = input.nextInt();

        
        if (examMark < 0 || examMark > 100)
        {

            System.out.println("Please Enter the correct marks (out of 100) ...");
            return;
        
        }

        System.out.println("Enter the percentage given from the Lab test :");
        double labMarkpercent = input.nextInt();
            
        System.out.println("Enter the percentage given from the Exam : ");
        double examMarkpercent = input.nextInt();

        if (labMarkpercent + examMarkpercent != 100)
        {
            System.out.println("Please Enter the correct percentage ...");
            return;
        }
        
        double finallabtestmarks = labMark*labMarkpercent/100;
        double finalexammarks = examMark*examMarkpercent/100;
        double finalmark = (finalexammarks+finallabtestmarks)/2;

        System.out.println("Final exam marks is " + finalmark);
        

    }
    
}