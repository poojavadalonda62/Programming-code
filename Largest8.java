class  Largest8
{
	public static void main(String[] args) 
	{
		int m=1;
		int n=1000;
		int sum=0;
		for (int i=m;i<=n ;i++ )
		{
			int largest=0;
			int temp=i;
			while (temp!=0)
			{
				int digit=temp%10;
				if (digit>largest)
				{
					largest=digit;

				}
				temp=temp/10;
				sum=sum+largest;
			}
		

		System.out.println(largest);
		}
	}
}
