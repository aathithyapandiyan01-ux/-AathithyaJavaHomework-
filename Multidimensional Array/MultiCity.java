import java.util.Scanner;
class MultiCity
{
	public static void main (String [] args)
	{
		Scanner sc = new Scanner  ( System.in );
		Scanner sc1 = new Scanner (System.in);
		System.out.print (" "+ "enter the row value");
		int row = sc.nextInt();
		System.out.print (" "+ "enter the column value");
		int col = sc.nextInt();
		
		String a [][]= new String [row][col];
		for (int i = 0 ; i < a.length ; i++)
		{
			for (int j = 0 ; j<a[i].length; j++)
			{
			System.out.println("Enter the "+ i + j + "city name" );
			a[i][j] = sc1.nextLine();
			}
			
				
		}
		
		
		for (int i = 0 ; i < a.length; i++)
		{
			for (int j = 0 ; j < a[i].length; j++)
			{
				System.out.print(a[i][j]+ " ");
			}
			
			System.out.println();
			
			
			
			
			
			
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}