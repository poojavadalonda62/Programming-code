import java.util.Scanner;
class  ProdEvenOdd
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first num");
		int m=sc.nextInt();
		System.out.println("enter last num");
		int n=sc.nextInt();
		int prodeven=1;
		int prododd=1;
		for (int i=m;i<=n ;i++ )
		{
			if (i%2==0)
			{
			prodeven=prodeven*i;
			}
			else
			{
				prododd=prododd*i;
			}

		}
		System.out.println("prod even:"+prodeven);
		System.out.println("prod odd:"+prododd);
	}
}
