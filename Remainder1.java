import java.util.Scanner;
class  Remainder1
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter divident value");
		int divident=sc.nextInt();
		System.out.println("enter divisor value");
		int divisor=sc.nextInt();
		while (divident>=divisor)
		{
			divident=divident-divisor;
		}
			System.out.println("remainder of an eqn :"+divident);
	}
}
