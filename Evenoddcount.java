import java.util.*;

public class Evenoddcount
{
	public static void main(String[] args)
	{
	    Scanner s=new Scanner(System.in);
	    System.out.println("Enter the Number: ");
	    int num=s.nextInt();
	    int evensize=0;
	    int oddsize=0;
	    for(int i=1;i<=num;i++)
		 {
		 if(i%2==0)
		 {
		    evensize++;  
		 }
		 else
		 {
		     oddsize++;  
		 }
	}
	System.out.println("even count is "+evensize);
	System.out.println("odd count is "+oddsize);
	}
}