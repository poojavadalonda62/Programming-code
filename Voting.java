import java.util.Scanner;
class Voting 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter age");
		int age=sc.nextInt();
		if (age>=18)
		{
			System.out.println("they are eligible for voting");
		}
		 else if (age<=18)
		{
			System.out.println("they are not eligible for voting");
		}
	}
}
