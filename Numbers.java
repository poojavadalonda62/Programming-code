import java.util.Scanner;
class  Numbers
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter m value");
		int m=sc.nextInt();
		System.out.println("enter n value");
		int n=sc.nextInt();
		int count=0;
		for(int i=n;i>=m;i--)
		{
			int temp=i;
			
			while(temp!=0)
			{
				int digit=temp%10;
				if(digit%3==0)
				{
					count++;
					break;
				}
				
				temp /= 10;
			}
		}
				System.out.println(count);
	}
}
			     

		
