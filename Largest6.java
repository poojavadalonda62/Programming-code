class Largest6 
{
	public static void main(String[] args) 
	{
		for (int i=1;i<=100 ;i++ )
		{
			int temp=i;
			int sod=0;
			int pod=1;
			int largest=0;
			while (temp!=0)
			{
				int digit=temp%10;
				sod=sod+digit;
				pod=pod*digit;
				temp=temp/10;
			if (sod==pod)
				{
				int temp1=i;
				while (temp1!=0)
				{
					int digit1=temp1%10;
					if (digit1>largest)
					{
						largest=digit1;
					}
					temp1=temp1/10;
				}
				}
			
				System.out.println(i+"="+largest);
			}
			
			
		}
	}
}
			
				
