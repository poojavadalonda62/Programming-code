class  Largest7
{
	public static void main(String[] args) 
	{
		int sum=0;
		for (int i=1;i<=1000 ;i++ )
		{
			int temp=i;
			int largest=0;
			while (temp!=0)
			{
				int digit=temp%10;
				if (digit>largest)
				{
					largest=digit;
				}
				temp=temp/10;
			}
			sum=sum+largest;
		}
			System.out.println("the summation of num 1 to 1000 is:"+sum);
	}
}
