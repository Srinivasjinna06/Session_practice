import java.util.*;

public class Pattern1
{
	public static void main(String[] args)
	{
	   Scanner s=new Scanner(System.in);
	    System.out.println("Enter the Number: ");
	    int num=s.nextInt();
	    for(int i=1;i<=num;i++)
	    {
	        for(int j=i;j<=num;j++)
	        {
	            System.out.print("*"+" ");
	       } 
	       System.out.println();
	    }
	}
}