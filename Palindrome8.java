class Palindrome8 
{
	public static void main(String[] args) 
	{
		for (int i=1;i<=1000 ;i++)
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
					int digit=rev%10;
				if (digit==2)
				{
					System.out.println(digit);
				}
				}
			}
		}
		
	}
}
