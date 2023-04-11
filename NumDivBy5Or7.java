import java.util.Scanner;
class  NumDivBy5Or7
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		if(num%5==0||num%7==0)
		{
			System.out.println("given num is div by 7 or 5");
		}
		else
		{
			System.out.println("given num not div by 7 or 5");
		}
	}
}
