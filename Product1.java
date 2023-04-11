class  Product1
{
	public static void main(String[] args) 
	{
		int prod=1;
		for (int i=1;i<=10 ;i++ )
		{
			int temp=i;
			int rev=0;
			while (temp!=0)
			{
				int digit=temp%10;
				rev=rev*10+digit;
				temp=temp/10;
			}
			if (rev==i&&i%2!=0)
			{
				prod=prod*i;
			}
		}
		System.out.println(prod);
	}
}
