class  Palindrome9
{
	public static void main(String[] args) 
	{
		int prod=1;
		for (int i=1;i<=1000 ;i++ )
		{
			int temp=i;
			int rev=0;
			while (temp!=0)
			{
				int digit=temp%10;
				rev=rev*10+digit;
				temp=temp/10;
			}
			if (rev==i)
			{
				while (rev!=0)
				{
					int digit1=rev%10;
					prod=prod*digit1;
					rev=rev/10;

				}
				if (prod<30)
				{
					System.out.println(i);
				}
			}
		}
		
	}
}
