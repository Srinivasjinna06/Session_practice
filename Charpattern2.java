public class Charpattern2
{
	public static void main(String[] args) 
	{
	  char ch='A';
	  for(int i=1;i<=5;i++)
	  {
	      for(int j=i;j<=5;j++)
	      {
	          System.out.print(ch);
	          ch++;
	      }
	      System.out.println();
	  }
	}
}