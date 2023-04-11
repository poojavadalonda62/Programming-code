class Palindrome7 
{
	public static void main(String[] args) 
	{
		int pos=1;
		for (int i=1;i<=100 ;i++ )
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
				System.out.println(i+"="+pos++);
			}
		}
	}
}
