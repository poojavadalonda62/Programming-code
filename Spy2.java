class  Spy2
{
	public static void main(String[] args) 
	{
		for (int i=1;i<=1000 ;i++ )
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
System.out.println(i);
			}
		}
		
	}
}
