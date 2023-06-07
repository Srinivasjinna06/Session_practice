import java.util.*;
public class Prime
{
	public static void main(String[] args) 
	{
	  Scanner s=new Scanner(System.in);
	  System.out.println("Enter the Number: ");
	  int num=s.nextInt();
	  int count=0;
	if(num==0 || num==1)
        {
           System.out.println(num+" It's not a prime number");
        }
      else
        {
          for(int i=2;i<num;i++)
           {
	      if(num%i==0)
	         count++;
           } 
	   if(count==0)
	     {
	       System.out.println(num+" It's a prime number");
	     }
           else
             {
	       System.out.println(num+" It's a not prime number");
	     }
        }
    }
}
