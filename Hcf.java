import java.util.*;
public class Hcf
{
	public static void main(String[] args) 
	{
	  Scanner s=new Scanner(System.in);
	  System.out.println("Enter the Number: ");
	  int num1=s.nextInt();
	  System.out.println("Enter the Number: ");
	  int num2=s.nextInt();	  
	  int i=1;
	  int hcf=0;
	  while(i<=num1 && i<=num2)
	  {
	      if(num1%i==0||num2%i==0)
	         hcf=i;
	         i++;
	  }
	  System.out.println("The HCF of "+num1+" and "+num2+" is: "+hcf);
	 
}
}
