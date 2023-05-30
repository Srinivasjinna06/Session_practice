import java.util.*;
public class Numpattern2
{
	public static void main(String[] args) 
	{
	  Scanner s=new Scanner(System.in);
	  System.out.println("Enter the Number: ");
	  int num=s.nextInt();
	  for(int i=1;i<=num;i++)
	  {
	      for(int j=1;j<=i;j++)
	      {
	          System.out.print(j);
	      }
	      System.out.println();
	  }
	  
}
}