class SpyNum 
{
	public static void main(String[] args) 
	{
		int m=1;
		int n=1000;
		for (int i=m;i<=n ; i++)
		{
			int temp=i;
			int sod=0;
			int pod=1;
			while (temp!=0)
			{
				int digit=temp%10;
				sod=sod+digit;
				pod=pod*digit;
				temp=temp/10;
			}
			if (sod==pod)
			{
			int temp1=i;
			int largest=0;
			while (temp1!=0)
			{
				int digit=temp1%10;
				if (digit>largest)
				{
					largest=digit;
				}
				temp1=temp1/10;
			}
			
			System.out.println(i+"="+largest);
			}
		}
	}
}
