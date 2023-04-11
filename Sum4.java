import java.util.Scanner;
class  Sum4
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter m value");
		int m=sc.nextInt();
		System.out.println("enter n value");
		int n=sc.nextInt();
		int prodeven=1;
		int sumodd=0;
		for (int i=m;i<=n ;i++ )
		{
			if (i%2==0)
			{
			 prodeven=prodeven*i;
			}
			else 
			{
			 sumodd=sumodd+i;
			}
		}
			int sum=sumodd+prodeven;
			if (sum%5==0)
			{
				System.out.println("summation div by 5");
			}
				else
			{
					System.out.println("summation is not div by 5");
			}
		}
	}


