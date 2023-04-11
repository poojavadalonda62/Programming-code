import java.util.Scanner;
class  Quetient
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter divident");
		int divident=sc.nextInt();
		System.out.println("enter divisor");
		int divisor=sc.nextInt();
		int count=0;
		while(divident>=divisor)
		{
			divident=divident-divisor;
			count++;
		}
			System.out.println("Quetient of an eqn is:"+count);

	}
}
