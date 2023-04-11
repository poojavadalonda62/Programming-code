import java.util.Scanner;
class  UpperLower
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter charecter");
		int charecter=sc.next().charAt(0);
		if (charecter>='A'&&charecter<='Z')
		{
			System.out.println(charecter+" is a uppercase alphabet");
		}
		else if (charecter>='a'&&charecter<='z')
		{
			System.out.println(charecter+" is a lowercase alphabet");
	
		} 
		else
		{
			System.out.println(charecter+"is not an alphabet");
		}
	}
}
