class  SmallestLargest1
{
	public static void main(String[] args) 
	{
		int m=1;
		int n=1000;
		for (int i=m;i<=n ;i++ )
		{
			int temp=i;
			int smallest=9;
			int largest=0;
			while (temp!=0)
			{
				int digit=temp%10;
				if (digit<smallest)
				{
					smallest=digit;
				}
			  if (digit>largest)
				{
					largest=digit;
				}
				temp=temp/10;
			}
			System.out.println("smallest digit of num"+i+"="+smallest);


		
		System.out.println("largest num digit of num"+i+"="+largest);
		}
	}
}
