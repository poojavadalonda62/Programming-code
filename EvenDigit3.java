import java.util.Scanner;
class  EvenDigit3
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter m num");
		int m=sc.nextInt();
		System.out.println("enter n num");
		int n=sc.nextInt();
		for (int i=m;i<=n ;i++ )
		{
			int temp=i;
			while (temp!=0)
			{
				int digit=temp%10;
				if (digit%2==0)
				{
		System.out.println(i);
		break;
				}
				temp=temp/10;

			}
		}
	}
}
