import java.util.Scanner;
class  SumEVenOdd
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter m value");
		int m=sc.nextInt();
		System.out.println("enter n value");
		int n=sc.nextInt();
		int sumeven=0;
		int sumodd=0;
		for (int i=m;i<=n;i++ )
		{
			if (i%2==0)
			{
				sumeven=sumeven+i;
			}
			else
			{
				sumodd=sumodd+i;
			}
			System.out.println("sum of even:"+sumeven);
			System.out.println("sum of odd:"+sumodd);
			
		}
	}
}
