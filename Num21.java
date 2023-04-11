class  Num21
{
	public static void main(String[] args) 
	{
		
		int m=1;
        int space=2;
		char ch='a';

		for (int i=1;i<=5 ;i++)
		{
			
			for (int a=1;a<=space ;a++ )
			{
				System.out.print(" "+" ");
			}
			for (int b=1;b<=m ;b++ )
			{
				System.out.print(ch+++" ");
				
			}

		
			if (i<=2)
			{
				space--;
				m=m+2;
			}
			else
			{
				space++;
			m=m-2;
			}

		
		System.out.println();
		}
	}
}
