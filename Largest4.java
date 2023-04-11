class Largest4 
{
	public static void main(String[] args) 
	{
		for (int i=1;i<=1000 ;i++ )
		{
			int temp=i;
			int largest=0;
			while (temp!=0)
			{
				int digit=temp%10;
				if (digit>largest&&digit%2!=0)
				{
					largest=digit;
				}
				temp=temp/10;
				
			}
		
		System.out.println(i+"="+largest);
		}
	}
}
