class  Num3
{
	public static void main(String[] args) 
	{
		int m=1;
		int n=2;
		for (int i=1;i<=7 ;i++ )
		{
			for (int a=1;a<=m ;a++ )
			{
				System.out.print(n+++" ");
				n++;

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
