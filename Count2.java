class  Count2
{
	public static void main(String[] args) 
	{
		int count=0;
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
			if (rev==i&&i%2==0)
			{
			count++;
			}
		}
		System.out.println("count of even palindrome:"+count);
	}
}
