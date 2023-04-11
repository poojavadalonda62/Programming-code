class Fibonacci
{
	public static void main(String[] args) 
	{
		int n1=0;
		int n2=1;
		int n3=0;
		
		for(int i=1;i<=13;i++)
		{
			n3=n1+n2;

			if(n3==i)
			{
				n1=n2;
				n2=n3;
			}
			else
			{

		
		System.out.print(i+" ");
			}
		}
			
		
	}
}
