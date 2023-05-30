import java.util.*;

public class Fabonociseries
{
	public static void main(String[] args)
	{
	   Scanner s=new Scanner(System.in);
	    System.out.println("Enter the Number: ");
	    int num=s.nextInt();
	    int n1=0,n2=1,n3;
	    for(int i=1;i<=num;++i)
	    {
	      System.out.println("The Fabonoci series of "+num+" is : "+n1+" , ");
	      n3=n1+n2;
	      n1=n2;
	      n2=n3;
	      
	    }
	   
	}
}