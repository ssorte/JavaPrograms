import java.util.Scanner;
//import java.util.*;

public class ArrayProgram {

    public static void main(String args[])
    {
        int arr[] = new int[10];
        int i;
        Scanner s = new Scanner(System.in);
		
        System.out.print("Enter any 10 numbers : ");
        
        for(i=0;i<10;i++)
        {
            arr[i] = s.nextInt();
            
            }
        for(i=0; i<10; i++)
        {
        	//System.out.println(""+)
        	System.out.println("The numbers are:" + arr[i]);
        }
        
    }
}