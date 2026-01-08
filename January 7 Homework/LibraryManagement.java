import java.util.Scanner ;
class LibraryManagement
{
	public static void main (String[] args)
	{
		
		
	 Scanner sc = new Scanner (System.in);	
	 Scanner sc1 = new Scanner (System.in);
	 System.out.println ("ENTER THE LENGTH VALUE :");
	 int Length = sc.nextInt();
	 String Books [] = new String [Length];
	 int BookID [] = new int [Length];
	 int SearchByID ;
	 int index =0;
	 int choices ;
	
	 do
	 {
		
		
		System.out.println ("1 FOR ADDING BOOKS AND ID");
		System.out.println ("2 FOR DISPLAYING ALL THE BOOKS");
		System.out.println ("3 FOR SEARCH THE BOOKS");
		System.out.println ("4 FOR EXIT");
		choices = sc.nextInt();
		
		switch(choices)
		{
			case 1 :
		    System.out.println ("ENTER THE BOOK NAME AND ITS ID TO BE ADDED");
		    System.out.println ("ENTER THE BOOK NAME ");
			Books [index] = sc1.nextLine();
		    System.out.println ("ENTER THE BOOK ID ");			
			BookID [index]= sc.nextInt();
			index++;
			break;
			
			case 2 :
			
			for (int i = 0 ; i < index ; i ++)
			{
				System.out.println("THE BOOK LISTS ARE : ");
				
				System.out.println(BookID[i]+ "   :   " +Books[i]);
			}
			break;
			
			case 3 :
				System.out.println("ENTER THE BOOK ID TO SEARCH");
				SearchByID = sc.nextInt();
				
				for ( int i = 0; i<index ; i++)
				{
					if (SearchByID == BookID[i])
					System.out.println("THE BOOK IS " +Books[i]);
				
					
				}
			
			
			case 4 :
			break;
		
		}
	 }while (choices!=4);
		
	}	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
   
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
   			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
    
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
