import java .util.Scanner ;
class FunctionsBank
{
	
	float INITIALBALANCE (float initialbalance )
	{
	 
	return initialbalance ;	
	}
	
	float DEPOSIT (float initialbalance , float deposit )
	{
	return initialbalance + deposit ;
	}
	
	float WITHDRAW (float initialbalance , float deposit , float withdraw )
	{
	return(initialbalance + deposit) - withdraw ;
	}
	
	float FINALBALANCE (float initialbalance , float deposit , float withdraw )
	{
	return  (initialbalance + deposit) - withdraw ;	
	}
	
	
	
	public static void main (String [] args)
	{
		Scanner sc = new Scanner (System.in);
		Scanner sc1 = new Scanner (System.in);
		System.out.println ("ENTER THE INITIAL BALANCE AMOUNT");
		float initialbalance = sc.nextFloat();
		float deposit = 0 ;
		float withdraw = 0;
		
		
		

		
		
		int choice ;
		do
		{
			
			
			FunctionsBank fcb = new FunctionsBank ();
			
			
			
			
			System.out.println ("1 FOR KNOWING INITIALBALANCE");
			System.out.println ("2 FOR DEPOSIT");
			System.out.println ("3 FOR WITHDRAW");
			System.out.println ("4 FOR CHECK FINAL BALANCE");
			System.out.println ("5 FOR EXIT");
			System.out.println ("ENTER UR CHOICE");
			choice = sc1.nextInt(); 
			
			switch (choice)
			{
				
				case 1 :
				{
			        float initialbalanceresult=fcb.INITIALBALANCE(initialbalance);					
					System.out.println ("THE INITIAL BALANCE AMOUNT IS :"+initialbalanceresult ); break ;
					
				}
								
				case 2 :
				{   System.out.println ("ENTER THE DEPOSIT");
		            deposit = sc.nextFloat();
			        float depositresult =fcb.DEPOSIT(initialbalance , deposit);
					System.out.println ("THE  BALANCE AMOUNT AFTER THE DEPOSITION IS :"+depositresult ); break ;
					
				}
				
								
				case 3 :
				{   System.out.println ("ENTER THE WITHDRAWAL AMOUNT ");
		            withdraw = sc.nextFloat();
					if ( withdraw<=(initialbalance+deposit)  )
					{	
			        float balanceafterwithdrawresult=fcb.WITHDRAW( initialbalance ,deposit,withdraw);				    
					System.out.println ("THE BALANCE AMOUNT AFTER WITHDRAWAL IS :"+balanceafterwithdrawresult );
					}
					else
					{
					System.out.println ("INSUFFICIENT BALANCE " );
					}
				    break ;
				}
				
				
				
								
				case 4 :
				{
			        float Finalbalanceresult=fcb.FINALBALANCE(initialbalance, deposit ,withdraw);					
					System.out.println ("THE FINAL BALANCE AMOUNT IS :"+Finalbalanceresult ) ; break ;
					
				}
				
				
			}	
				
				
				
				
				
		}while(choice!=5); 		
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}