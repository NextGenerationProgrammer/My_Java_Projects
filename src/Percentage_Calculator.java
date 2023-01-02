import java.util.Scanner;

public class Percentage_Calculator
{
    public static void main(String[] args)
    {
    Scanner pc = new Scanner(System.in);

        System.out.println("Enter the marks of Subjects:");

        System.out.print("Mathematics : " );
        double math = pc.nextDouble();

        System.out.print("English Grammar : ");
        double english = pc.nextDouble();

        System.out.print("History : ");
        double history = pc.nextDouble();

        System.out.print("Geography : ");
        double geography = pc.nextDouble();

        System.out.print("Biology : ");
        double biology = pc.nextDouble();

        double percentage = (math+english+history+geography+biology)/500*100;
        System.out.print("Percentage = " + percentage + "%");
    }
}
