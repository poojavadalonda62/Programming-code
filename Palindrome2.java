import java.util.Scanner;
class  Palindrome2
{
	public static void main(String[] args) 
	{
	 Scanner sc=new Scanner(System.in);
	 System.out.println("enter num");
	int n=sc.nextInt();
	int rev=0;
	int temp=n;
	while (temp!=0)
	{
		int digit=temp%10;
		rev=rev*10+digit;
		temp=temp/10;
	}
	System.out.println("reversing order of the num:"+rev);
	if (temp==rev)
	{
		System.out.println("the given num is palindrome");
	}
	}
	


}
