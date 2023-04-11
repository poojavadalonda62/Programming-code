class Num9 
{
	public static void main(String[] args) 
	{
		int space=2;
		int m=1;
        int n=1;
		for (int i=1;i<=3;i++ )
		{
          for (int a=1;a<=space;a++)
			{
				System.out.print(" "+" ");
			}
			for (int b=1;b<=m;b++)
			{
				System.out.print(n+++" ");
			}
				space--;
				m=m+2;
		System.out.println();
		}
	}
}
