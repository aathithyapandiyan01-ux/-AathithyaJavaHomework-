import java.util.Scanner ;
class StudentsName
{
	public static void main (String [] args)
	{
		Scanner sc = new Scanner (System.in);
		Scanner sc1 = new Scanner (System.in);
		
		System.out.println ("Enter the length value");
		int length = sc.nextInt ();
		String Name [] = new String [length];
		int index = 0;
		
		int choices ;
		do 
		{
			
			System.out.println ("1 FOR ADD THE NAMES ");
			System.out.println ("2 FOR SEE THE LIST");
			System.out.println ("3 FOR EXIT ");
			System.out.println ("ENTER THE CHOICES ");
			choices = sc.nextInt();
			
			
			
			
			
			
			
			
			
			switch (choices)
			{
				
				case 1 :
				System.out.println ("ENTER THE NAME OF THE" + (index + 1)+ "STUDENT ");
				Name [index] = sc1.nextLine();
				index++;
				break ;
				
				case 2 :
				for (int i = 0 ; i <Name.length ; i++)
				{
					if (Name[i]!= null )
					System.out.println (Name[i]);
				}
				break;
				
				case 3 : break;
				
			}	
				
		}while (choices!=3);		
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				

			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}