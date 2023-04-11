class PerfectNum1 
{
	public static void main(String[] args) 
	{
		int m=1;
		int n=100;
		int count=0;
		for (int i=m;i<=n ;i++ )
		{
			int sof=0;
			for (int j=1;j<i ;j++ )
			{
				if (i%j==0)
				{
					sof=sof+j;
				}
			}
			if (sof==i)
			{
				count++;
				System.out.println(i);
			}
		}
		System.out.println("count of perfect num from 1 to 100:"+count);
	}
}
