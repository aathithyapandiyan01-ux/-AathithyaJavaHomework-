import java.util.Scanner;
class PrimeNumber
{
	public static void main (String [] args)
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Type the number ");
		int number = sc.nextInt();
		if ( number % number == 0 && number % 1 == 0 )
		{
			System.out.println("The given number is a prime number ");
		}
		else 
		{
		    System.out.println("The given number is not a prime number ");
		}
	}
}	