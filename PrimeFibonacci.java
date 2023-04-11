class PrimeFibonacci 
{
	public static void main(String[] args) 
	{
		
		int n1=0;
		int n2=1;
		int n3=0;
		
		for(int i=3;i<=15;i++)
		{
			n3=n1+n2;
			
			n1=n2;
			n2=n3;
		
			if(n3>1)
			{
			boolean status=true;
			for(int j=2;j<n3;j++)
			{
				if(n3%j==0)
				{
					status=false;
				}
			}
			if(status)
			{
				System.out.println(n3+" ");
			}
			}
		}
		
	}
}

		

