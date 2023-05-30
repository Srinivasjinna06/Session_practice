import java.util.*;
public class Countnum
{
	public static void main(String[] args) 
	{
	  Scanner s=new Scanner(System.in);
	  System.out.println("Enter the Number: ");
	  int num=s.nextInt();
	  int count=0;
	  while(num>0)
	  {
	      num/=10;
	      count++;
	   
	  }
	  System.out.println("the number of digits in number are: "+count);
}
}