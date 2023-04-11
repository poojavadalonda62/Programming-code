class SumOfPalindrome 
{
	public static void main(String[] args) 
	{ 
		int sum=0;
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
					int digit=rev%10;
					if (digit%2==0)
					{
						sum=sum+i;
						break;
					}
					rev=rev/10;
				}

			}
		}
		System.out.println("sum of palindrome which has even digit in it:"+sum);
	}
		
}

