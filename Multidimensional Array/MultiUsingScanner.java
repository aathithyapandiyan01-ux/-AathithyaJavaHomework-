import java.util.Scanner ;
class MultiUsingScanner
{
	public static void main (String [] args)
	{
		Scanner sc = new Scanner(System.in);
		Scanner sc1 = new Scanner(System.in);	
		System.out.print("enter the row value");
		int row = sc.nextInt() ;
		System.out.print("enter the column value");		
		int col = sc.nextInt() ;
		
		char a [][] = new char [row][col];
		for (int i = 0 ; i < a.length ; i++)
		{
			for (int j = 0 ; j<a[i].length; j++)
			{
				System.out.print("enter the value of" + i + j);
				a[i][j] = sc1.next().charAt(0);
			}
				
		}

		
		for (int i = 0 ; i< a.length ; i++ )
		{
			for (int j = 0 ; j<a[i].length ; j++)
			{
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
			
			
			
			
			
			
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}