import java.util.Scanner;

public class PercentageCalculator
{
    public static void main(String args[])
    {
        int mark[] = new int[3];
        int i;
        float sum=0;
        float total, perc;
        Scanner s = new Scanner(System.in);
		
      for(i=0; i<3; i++)
        {
        	System.out.println("Enter marks Obtained in Subjects : ");
        	mark[i] = s.nextInt();
            sum = sum + mark[i];
        }
		
        total = sum;
        perc = (sum/300) * 100;
		
        System.out.println("Total Marks obtained = " +total);
		
        System.out.println("Percentage scored= " +perc+ "%");
    }
}