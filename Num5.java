class  Num5
{
	public static void main(String[] args) 
	{
		int m=1;
		char ch='a';
		int space=3;
		for (int i=1;i<=7 ;i++ )
		{
		
		for (int a=1;a<=space ;a++ )
			{
			System.out.print(" "+" ");
			}
			for (int b=1;b<=m ;b++ )
			{
				System.out.print(ch+" ");
			ch++;
			if (i<=3)
			{
				space--;
				m++;
			
			}
			else
			{
				space++;
				m--;
			}

	
		
		System.out.println();
		}
	}
	}

	

