import java.util.Scanner ;
class LoggingPermission3
{
	public static void main (String [] args)
	{
		Scanner sc = new Scanner (System.in);
		Scanner sc1 = new Scanner (System.in);
		
		System.out.print("ENTER THE LENGTH VALUE");
		int Length = sc.nextInt();
		
		String Username[] = new String [Length];
		
		String Password [] = new String [Length];
		
		int index = 0;
		
		int choices;
		
		
		
		
		do
		{
			
			
			
		 System.out.println("1 FOR REGISTRATION");
		 System.out.println("2 FOR LOG IN");
		 System.out.println("3 FOR EXIT");
		 System.out.println("ENTER UR CHOICES");
		 choices = sc.nextInt();
			
			
			
		 switch (choices)
		 {
			
			case 1 : 
			
			System.out.println("THIS IS THE REGISTRATION ");
			
			System.out.println("ENTER UR USERNAME");
			Username [ index ] = sc1.nextLine();
			
			System.out.println("ENTER UR PASSWORD");			
			Password [ index ] = sc1.nextLine();
			index++;
			
			break;
			
			case 2 :
			
			System.out.println("THIS IS THE VERIFICATION ");
			System.out.println("ENTER UR USERNAME ");
			String LogUsername = sc1.nextLine ();
			System.out.println("ENTER UR Password ");
			String LogPassword = sc1.nextLine ();
			
			
			for (int i = 0 ; i <= index+1 ; i ++)
			{
			  if (LogUsername.equals (Username[i]) &&  LogPassword.equals(Password[i])  )
			  {
				  System.out.println ("UR LOG IN SUCCESSFUL");
			  }
			  else 
			  {
			  System.out.println("UR LOG IN IS NOT SUCCESSFUL DUE TO INCORRECT USERNAME"); 
			  }
			} 
			
			
			case 3 :
			break ;
			
		 }	
		}while (choices<3);	
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}