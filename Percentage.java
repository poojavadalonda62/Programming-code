import java.util.Scanner;
class Percentage 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter obtained marks");
		int marks=sc.nextInt();
		System.out.println("enter total marks");
		double totalmarks=sc.nextDouble();
		double percentage=(marks%totalmarks)*100;
		System.out.println("your percentage:"+ percentage+"%");



	}
}
