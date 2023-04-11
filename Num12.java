class  Num12
{
	public static void main(String[] args) 
	{
		
		int m=1;
	int n=1;
		int space=2;
		for (int i=1;i<=3;i++ )
		{
			for (int a=1;a<=space ;a++ )
			{
				System.out.print(" "+" ");
			}
			for (int b=1;b<=m ;b++ )
			{
				for (int k=1;k<=25 ;k++ )
				{
					n=k;
					boolean status=true;
					for (int l=2;l<n ; l++)
					{
						if (n%l==0)
						{
							status=false;
						}
					}
						if (status)
						{ 
							System.out.print(n+" ");
							
						}
					}
						n++;
						m=m+2;
						space--;
					}
				
				System.out.print();
					
		}
	}
			
}