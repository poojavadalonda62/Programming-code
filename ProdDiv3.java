import java.util.Scanner;
class  ProdDiv3
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter m value");
		int m=sc.nextInt();
		System.out.println("enter n value");
		int n=sc.nextInt();
		int prod=1;
		for (int i=m;i<=n ; i++)
		{
			if (i%3==0)
			{
				prod=prod*i;
				System.out.println(i);
			}
		}
		System.out.println("prod of div by 3 is:"+prod);
	}
}
