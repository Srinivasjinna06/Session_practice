import java.util.*;
public class Armstrong
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
	      rev+=(rem*rem*rem);
	      temp/=10;
	  }
	  if(rev==num)
	  {
	     System.out.println("The number is Armstrong number");
	  }
	  else
	  {
	     System.out.println("The number is not  Armstrong number"); 
	  }
	}
}