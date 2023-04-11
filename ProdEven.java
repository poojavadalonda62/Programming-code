import java.util.Scanner;
class  ProdEven
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter m value");
		int m=sc.nextInt();
		System.out.println("enter n value");
		int n=sc.nextInt();
		int prod=1;
		for (int i=m;i<=n ;i++ )
		{
			if (i%2==0)
			{
				prod=prod*i;
			}
		}
		System.out.println("prod of even num is:"+prod);
	}
}
