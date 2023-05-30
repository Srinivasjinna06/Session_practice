import java.util.*;
public class Prime
{
	public static void main(String[] args) 
	{
	  Scanner s=new Scanner(System.in);
	  System.out.println("Enter the Number: ");
	  int num=s.nextInt();
	  int i=2;
	  int count=0;
	  while(i<num)
	  {
	      if(num%i==0)
	         count++;
	         break;
	  }
	  if(count==0)
	 {
	     System.out.println("It's a prime number");
	 }
	 else{
	     System.out.println("It's a not prime number");
	 }
}
}