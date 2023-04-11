import java.util.Scanner;
class  Sum1
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first num");
		int m=sc.nextInt();
		System.out.println("enter last num");
		int n=sc.nextInt();
		int sum=0;
		int prod=1;
		for (int i=m;i<=n;i++ )
		{
			sum=sum+i;
			prod=prod*i;
		
		}
		if (sum%2==0)
		{
			System.out.println("summation is even:"+sum);

		}
		else
		{
			System.out.println("summation is odd:"+sum);
		}
		if (prod%10==0)
		{
			System.out.println("prod is div by 10");
		}
		else
		{
			System.out.println("prod is not div by 10");
		}
	}
}
