class  Num6
{
	public static void main(String[] args) 
	{
		int m=1;
		int n=1;
		for (int i=1;i<=7 ;i++ )
		{
			
			for (int b=1;b<=m;b++ )
			{
				System.out.print(n+" ");
				n=n+2;

			
			if (n>9)
				{
					n=1;
				}
			}
			
			
				if (i<=3)
				{
					m++;
	
				}
			
	
				else
				{
					m--;
				}
				

		System.out.println();
	}
			
	}
}

