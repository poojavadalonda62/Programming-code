import java.util.Scanner;
class Spy1
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter num");
		int n=sc.nextInt();
		int sod=0;
		int pod=1;
		while (n!=0)
		{
			int digit=n%10;
			sod=sod+digit;
			pod=pod*digit;
			n=n/10;
		
		}
		if (sod==pod)
		{
			System.out.println("the given num is spy");
		}
		else
		{
			System.out.println("given num is not a spy");
		}
	}
}
