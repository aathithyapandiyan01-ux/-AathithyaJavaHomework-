import java.util.Scanner;
class EmployeeManagement 
{
	public static void main (String [] args)
	{
		Scanner sc = new Scanner (System.in);
		Scanner sc1 = new Scanner (System.in);
		System.out.println ("ENTER THE LENGTH :");
		int Length = sc.nextInt();
		String EmployeeName [] = new String [Length];
		int index = 0;
		
		
		int choices ;
		do 
		{
			System.out.println ("1 FOR ADD EMPLOYEE NAME");
			System.out.println ("2 FOR DISPLAY THE LIST OF ALL EMPLOYEES");
			System.out.println ("3 FOR EXIT");
			System.out.println ("CHOOSE THE OPTIONS");
			choices = sc.nextInt();
			
			switch (choices)
			{
				
			   case 1 : 
			
			   System.out.println ("ENTER THE EMPLOYEE NAME");
			   EmployeeName[index]=sc1.nextLine ();
			   index ++;
			   break;
				
			   case 2 :
			
			   for (int i = 0 ; i < index ; i++)
			   {
				
				System.out.print("List of the employees are :");
				System.out.println(EmployeeName[i]);
				
				
				
			   }				
				
				
		   	   case 3:  
			   break;
					
			}	
						
		}while (choices!=3);
		
		
	}	
		
		
		
		
		
}		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
