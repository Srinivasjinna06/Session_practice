import java.util.*;

public class Pattern3
{
	public static void main(String[] args)
	{
	   Scanner s=new Scanner(System.in);
	    System.out.println("Enter the Number: ");
	    int num=s.nextInt();
	    for(int i=1;i<=num;i++)
	    {
	        for(int j=1;j<=num;j++)
	        {
	            System.out.print("*"+" ");
	       }
	       System.out.println();
	    }
	}
}