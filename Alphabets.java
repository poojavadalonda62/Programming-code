import java.util.Scanner;
class Alphabets
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter m value");
		int m=sc.next().charAt(0);
		System.out.println("enter n value");
		int n=sc.next().charAt(0);
		for (int i=m;i<=n;i++ )
		{
			System.out.println(i);
		}
	}
}
