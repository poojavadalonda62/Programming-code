import java.util.Scanner;
class Summation 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter m value");
		int m=sc.nextInt();
		System.out.println("enter n value");
		int n=sc.nextInt();
		int sum=0;
		for (int i=m;i<=n ;i++ )
		{
		sum=sum+i;
		}
		System.out.println("summation of num from m to n id:"+sum);
	}
}
