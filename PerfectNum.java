class  PerfectNum
{
	public static void main(String[] args) 
	{
		int count=0;
		for (int i=1;i<=1000 ;i++ )
		{
			int sof=0;
			for (int j=1;j<i ;j++ )
			{
			if (i%j==0)
			{
				sof=sof+i;

			}
			}
		
		if (sof==i)
		{
			count++;
			System.out.println(i);

		}
			
		}
		System.out.println("count of num from m to n is:"+count);
		
	}
}
