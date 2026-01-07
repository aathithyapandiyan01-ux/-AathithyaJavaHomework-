import java .util.Scanner ;
class MultiKeyword
{
	public static void main (String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print ("enter the row value");
		int row = sc.nextInt();
        System.out.print ("enter the column value");
		int column = sc.nextInt();

		int a [][] = new int [row][column];
		
		for (int i = 0; i < a.length;i++)
		{
			for (int j = 0 ; j < a[i].length; j++)
			{
				
				System.out.print (" Enter " +i + j + "value");
				a[i][j]= sc.nextInt();
				
			}
			
			System.out.println ();
		}	
			
			
			
			
			
			
			
			
		for ( int i = 0 ; i < a.length; i++)
		{
			
			for ( int j = 0 ; j< a[i].length; j++)
			{
				
				System.out.print (a[i][j]+ " ");
				
			}
			System.out.println  ();
			
			
			
			
			
			
			
			
			
			
			
			
			
					
			
			
			
			
			
			
			
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}