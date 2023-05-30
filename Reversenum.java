import java.util.*;
public class Reversenum
{
	public static void main(String[] args) 
	{
	  Scanner s=new Scanner(System.in);
	  System.out.println("Enter the Number: ");
	  int num=s.nextInt();
	  int temp=num;
	  int rev=0,rem;
	  while(temp>0)
	  {
	      rem=temp%10;
	      rev=rem+rev*10;
	      temp/=10;
	  }
	  System.out.println("The number is reversed "+rev);
	}
}