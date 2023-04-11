class  Pos1
{
	public static void main(String[] args) 
	{
		int pos=0;
		for (int i=1;i<=1000 ;i++ )
		{
			int temp=i;
			int rev=0;
			while (temp!=0)
			{
				int digit=temp%10;
				rev=rev*10+digit;
				temp=temp/10;
			}
				if (rev==i)
				{
				pos++;
				if (pos%2==0)
				{

               System.out.println(i);
			   break;
				}
				}	
		}
		
	}
}
