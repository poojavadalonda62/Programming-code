import java.util.Scanner;
class SmallestLargest 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter num");
		int n=sc.nextInt();
		int smallest=9;
		int largest=0;
		while (n!=0)
		{
			int digit=n%10;
			if (digit<smallest)
			{
				smallest=digit;
			}
			if (digit>largest)
			{
				largest=digit;
			}
			n=n/10;

		}

		System.out.println(smallest);
		System.out.println(largest);
	}
}
