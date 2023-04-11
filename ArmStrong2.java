class ArmStrong2 
{
	public static void main(String[] args) 
	{
		for (int i=1;i<=1000 ;i++ )
		{
			int temp1=i;
			int temp2=i;
			int count=0;
			while (temp1!=0)
			{
				int digit=temp1%10;
				count++;
				temp1=temp1/10;
			}
			int sum=0;
			while (temp2!=0)
			{
				int digit1=temp2%10;
				int prod=1;
				for (int j=1;j<=count ;j++ )
				{
					prod=prod*digit1;
				
				}
				sum=sum+prod;
				temp2=temp2/10;
			}
				if (sum==i)
				{
					System.out.println(i);

				}
		}
	}
}
