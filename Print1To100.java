import java.util.Scanner;
class Print1To100 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter m value");
		int m=sc.nextInt();
		System.out.println("enter n value");
		int n=sc.nextInt();
		for(int i=m;i<=n;i++)
		{
			System.out.println(i);
		}
	}
}
