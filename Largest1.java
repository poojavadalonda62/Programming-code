class  Largest1
{
	public static void main(String[] args) 
	{
		int n=123;
		int temp=n;
		int larges0;
		while (temp!=0)
		{
			int digit=temp%10;
			if (digit>largest)
			{
				largest=digit;
			}
			temp=temp/10;
		}
		System.out.println(largest);
	}
}
