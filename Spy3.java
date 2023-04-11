class Spy3 
{
	public static void main(String[] args) 
	{
		for (int i=1;i<=100 ;i++ )
		{
			int temp=i;
			int rev=0;
			int sod=0;
			int pod=1;
			while (temp!=0)
			{
				int digit=temp%10;
				rev=rev*10+digit;
				sod=sod+digit;
				pod=pod*digit;
				temp=temp/10;
			}
			if (rev==i&&sod==pod)
			{
				System.out.println(i);
			}
		}
		
	}
}
