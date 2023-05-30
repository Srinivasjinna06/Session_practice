import java.util.*;
public class Charpattern4
{
	public static void main(String[] args) 
	{
	  Scanner s=new Scanner(System.in);
	  System.out.println("Enter the Word: ");
	  String str=s.next();
	  for(int i=0;i<str.length();i++)
	  {
	      for( int j=0;j<=i;j++)
	      {
	          System.out.print(str.charAt(j));
	      }
	      System.out.println();
	  }
	  
   }
}