import java.util.Scanner ;
class OddEvenNumber
{
	public static void main (String [] args)
	{
		Scanner sc = new Scanner ( System.in ) ;
		System.out.println ( " Enter the Starting Number ");
		int StartNum = sc.nextInt ();
		System.out.println ( " Enter the Ending Number ");
		int EndNum = sc.nextInt ();
		int EvenNumSum = 0;
		int EvenCount = 0 ;
		int OddNumSum = 0 ;
		int OddCount = 0;
		int totalSum = 0;
		int totalCount = 0;
		
		
		for (int i = StartNum  ; StartNum <EndNum ; StartNum++ )
		{
			
			System.out.print( " Enter the Number to find ");
			int FindNum = sc.nextInt();
			totalSum = totalSum + FindNum;
			totalCount++;
			
			if ( FindNum % 2 == 0 )
			{
			System.out.println (FindNum + " is Even Number ");
			EvenCount++;
			EvenNumSum = EvenNumSum + FindNum;
			}
			else 
			{
			System.out.println (FindNum + " is Odd Number ");
			OddNumSum = OddNumSum + FindNum; 
			OddCount++;
			}
			
			

		




		
		}	

			System.out.println( " EvenNumSum :  " + EvenNumSum );
			System.out.println( " OddNumSum :  " + OddNumSum );
			System.out.println( " EvenCount :  " + EvenCount );
			System.out.println( " OddCount :  " + OddCount );
			System.out.println( " totalSum :  " + totalSum );
			System.out.println( " totalCount :  " + totalCount );
			
			
			
			
		












		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}