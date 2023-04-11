class Pattern21 
{
	public static void main(String[] args) 
	{
		char ch='a';
		int m=1;
		for(int i=1;i<=7;i++)
		{
			for(int a=1;a<=m;a++) 
			{
				System.out.print(ch+++" ");
				
			}
			if(i<=3)
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
