import java.util.*;
public class Charpattern3
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
	  for (int k=str.length()-1;k>=0;k--)
	  {
	      for(int l=0;l<k;l++)
	      {
	          System.out.print(str.charAt(l));
	      }
	      System.out.println();
	  }
}
}