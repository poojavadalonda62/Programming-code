import java.util.Scanner;
class Alphabet2
{
public static void main(String[] args) 
	{
	Scanner sc=new Scanner(System.in);
		System.out.println("enter first lower case alphabet");
		char ch1=sc.next().charAt(0);
		System.out.println("enter last lower case alphabet");
		char ch2=sc.next().charAt(0);
		int position=1;
		int ascii=97;
			for (char ch=ch1;ch<=ch2 ;ch++ )
			{
			System.out.println(ch+"="+ position++ +"="+ascii++);
			}
	}
}
