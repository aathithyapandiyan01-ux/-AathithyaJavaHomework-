import java.util.Scanner ;
class MultiMarks
{
	public static void main (String [] args)
	{
		Scanner sc = new Scanner ( System.in ) ;
		System.out.print ("enter the row value");
		int row = sc.nextInt();
		System.out.print ("enter the cloumn value");
		int col = sc.nextInt();
		
		int a [][] = new int [row][col];
		for (int i = 0 ; i < a.length; i++)
		{
			for (int j = 0 ; j<a[i].length; j++)
			{
				System.out.print("enter" +i + j + "value");
				a[i][j]= sc.nextInt();
			}
		
			
		}	
			
		for (int i = 0 ; i<a.length; i++)
		{
			for (int j = 0 ; j<a[i].length;j++)
			{
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
			
			
			
			
			
			
			
			
			
			
			
			
			
					
			
			
			
			
			
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}