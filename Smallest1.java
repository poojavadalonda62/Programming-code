class  Smallest1
{
	public static void main(String[] args) 
	{
		int prod=1;
		for (int i=1;i<=10 ;i++ )
		{
			prod=prod*i;
			int temp=prod;
			while (temp!=0)
			{
				int digit=temp/10;
				if (digit<smallest)
				{
					smallest=digit;
				}
				temp=temp/10;
			}
		
		}
		System.out.println(smallest);
		System.out.println(prod);
		}
	
}
