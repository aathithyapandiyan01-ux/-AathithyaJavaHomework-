import java.util.Scanner ;
class ArrayScanner
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner ( System.in );
		Scanner sc1 = new Scanner(System.in);
		System.out.println ( "Enter the length");
		int length = sc.nextInt();
		String Name [] = new String [length];
		
		for ( int i = 0 ; i < Name.length; i++)
		{
			System.out.println ("enter the"+i+"name");
			Name[i]=sc1.nextLine();
				
		}
		for (int i = 0 ; i< Name.length ; i++)
		{
		System.out.println (Name [i]);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}