import java.util.Scanner;
class  DivBy5or7
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter num");
		int n=sc.nextInt();
		if(n%5==0||n%7==0)
		{
			System.out.println("given num div by 7 or 5");
		}
		else
		{
			System.out.println("given num not div by 5 or 7");
	}

	}
}
