import java.util.*;
public class Numpattern3
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
	  for(int k=num-1;k>=1;k--)
	  {
	      for( int l=1;l<=k;l++)
	      {
	          System.out.print(l);
	          }
	      System.out.println();
	  }
	  
}
}