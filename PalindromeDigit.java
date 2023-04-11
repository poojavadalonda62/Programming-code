class PalindromeDigit 
{
	public static void main(String[] args) 
	{
		int n=121;
		int rev=0;
		int temp=n;
		while (n!=0)
		{
			int digit=n%10;
			rev=rev*10+digit;
			n=n/10;
		}
		if (rev==temp)
		{
			while (rev!=0)
			{
				int digit=rev%10;
				rev=rev/10;
		
		System.out.println(digit);
			}
		}
	}
}
