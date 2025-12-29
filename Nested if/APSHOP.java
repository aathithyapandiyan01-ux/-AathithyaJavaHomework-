import java.util.Scanner;
class APSHOP
{
	public static void main ( String[] args )
	{
		Scanner sc = new Scanner(System.in);
		System.out.println ("Welcome to APSHOP");
		System.out.println ("Type 1 for kids section");
	    System.out.println ("Type 2 for Men section");
		System.out.println ("Type 3 for Ladies section");
	
		int section = sc.nextInt();
		if ( section==1)
		{
			System.out.println ("Welcome to kids section");
		    System.out.println ("1 . vesti suit");
 		 	System.out.println ("2 . coat suit");
		    System.out.println ("3 . banian suit");
		    System.out.println ("4 . normal suit");
			System.out.println ("5 . etho oru suit");
            
			int choice = sc.nextInt();
			if ( choice==1 )
			{
				System.out.println ("1 . vesti suit rs 300");
			}
			
			else if (choice==2)	
			{
				System.out.println ("2 . coat suit rs 500");
			}				
			
			else if (choice==3)
            {
				System.out.println ("3 . banian suit rs 500");
			}
			else if (choice==4)
			{
			    System.out.println ("4 . normal suit rs 1000");		
			}
			else if (choice==5)
			{
			    System.out.println ("5 . etho oru suit rs 1000");	
			}	
			else
			{
				System.out.println("your choice is not available");
			}	
			
		}	
			
			
		else if ( section==2)
		{
			System.out.println ("Welcome to men section");
		    System.out.println ("1 . vesti suit");
 		 	System.out.println ("2 . coat suit");
		    System.out.println ("3 . banian suit");
		    System.out.println ("4 . normal suit");
			int choice = sc.nextInt();
			if ( choice==1 )
			{
				System.out.println ("1 . vesti suit rs 400");
			}
			
			else if (choice==2)	
			{
				System.out.println ("2 . coat suit rs 700");
			}				
			
			else if (choice==3)
            {
				System.out.println ("3 . banian suit rs 800");
			}
			else if (choice==4)
			{
			    System.out.println ("4 . normal suit rs 1000");		
			}
		    else
			{
				System.out.println ("your choice is not available");
			}
			
		}	
		
		else if ( section==3)
		{
			System.out.println ("Welcome to ladies section");
		    System.out.println ("1 . kurti");
 		 	System.out.println ("2 . sarees");
		    System.out.println ("3 . chudithar");
		    System.out.println ("4 . silk sarees");
			int choice = sc.nextInt();
			if ( choice==1 )
			{
				System.out.println ("1 . kurti suit rs 400");
			}
			
			else if (choice==2)	
			{
				System.out.println ("2 .sarees rs 700");
			}				
			
			else if (choice==3)
            {
				System.out.println ("3 .chudithar rs 800");
			}
			else if (choice==4)
			{
			    System.out.println ("4 . silk sarees rs 1000");		
			}
		    else
			{
				System.out.println ("your choice is not available");
			}
			
		}	
		
		else
		{
			System.out.println ("your section is not available here , thanks for coming");
			
		}	
			
			
			
			
			
			
			
			
		
 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}