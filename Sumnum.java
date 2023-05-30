import java.util.*;
public class Sumnum
{
	public static void main(String[] args) 
	{
	  Scanner s=new Scanner(System.in);
	  System.out.println("Enter the Number: ");
	  int num=s.nextInt();
	  int sum=0,i=0;
	  while(i<=num)
	  {
	      sum+=i;
	       i++;
	  }
	  System.out.println("the sum of n numbers is : "+sum);
}
}
