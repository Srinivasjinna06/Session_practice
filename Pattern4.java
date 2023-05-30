import java.util.*;

public class Pattern4
{
	public static void main(String[] args)
	{
	   Scanner s=new Scanner(System.in);
	    System.out.println("Enter the Number: ");
	    int num=s.nextInt();
	    for(int i=0;i<num;i++)
	    {
	        for(int j=num-i;j>1;j--)
	        {
	            System.out.print(" ");
	       }
	       for(int j=0;j<=i;j++)
	       {
	           System.out.print("* ");
	       }
	       System.out.println();
	    }
	}
}