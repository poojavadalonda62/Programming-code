import java.util.Scanner;
class  Largest10
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a value");
		int a=sc.nextInt ();
		System.out.println("enter b value");
		int b=sc.nextInt();
		System.out.println("enter c value");
		int c=sc.nextInt();
		int largest=0;
		if (a>b)
		{
			System.out.println("a is largest");
		}
		else if (b>c)
		{
			System.out.println("b is largest");
		}
		else
		{
			System.out.println("c is largest");
		}
	}
}
