import java.util.Scanner;
public class PrimeNumber1ToN
{
	public static void main(String arg[])	
	{
	int i,count;
               System.out.print("");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
               System.out.print("");
	for(int j=2;j<=n;j++)
	{
	count=0;
	for(i=1;i<=j;i++)
	{
	   if(j%i==0)
	   {
	        count++;        
	   }
	}
	if(count==2)
	       System.out.print(j+" ");     
	}
	}
}