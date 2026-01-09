import java.util.Scanner;

class FunctionsMarks
{
	
	   
	    
		
	    
	 
	
	
	
		int TOTAL ( int tamil ,  int english , int maths)
	    {
	    int total = tamil+english+maths;	
	    return total;	
	    }
	    float PERCENTAGE ( int tamil, int english, int maths)
	    {
	    float percentage = ( tamil +  english+ maths) / 3.0f ;	
	    return percentage;	
	    }
	    boolean RESULT ( int tamil, int english,int maths)
	    {
	    boolean result = (tamil +  english +  maths ) /3 >= 45 ;	
	    return result ;	
	    }
		char GRADE (int tamil, int english,int maths)
		{
			char grade ;
		 if (( tamil +  english+ maths) / 3 >= 75)
			 grade ='A' ;
        
			
		 else if (( tamil +  english+ maths) / 3 <= 75 && ( tamil +  english+ maths) / 3 >= 60 )	
			 grade ='B';
			
		
		 else if (( tamil +  english+ maths) / 3 >= 40 && ( tamil +  english+ maths) / 3 <= 59)
			 grade ='C';


			
		 else  	
			 grade ='D';
		
		 return grade ;
		}	
			
			
			
			
			
			
			
		
		
		
		
		
		
		
		
		
		public static void main (String [] args)
		{
			
		 Scanner sc = new Scanner (System.in);
		 System.out.println("ENTER THE FIRST SUBJECT MARK :");
		 int tamil = sc.nextInt ();
	     System.out.println("ENTER THE SECOND SUBJECT MARK :");
		 int english = sc.nextInt ();
		
	     System.out.println("ENTER THE THIRD SUBJECT MARK :");
		 int maths = sc.nextInt ();
		
		 int choices;	
		 do{
		 
			 
		  FunctionsMarks fcm = new FunctionsMarks ();
		  int totalres = fcm.TOTAL (tamil,english,maths);
		  float percentageres = fcm.PERCENTAGE(tamil,english,maths);
		  boolean resultres = fcm.RESULT(tamil,english,maths);
		  char graderes = fcm.GRADE(tamil,english,maths);
		  
		  
		  System.out.println ("1 for total");
		  System.out.println ("2 for percentage");
		  System.out.println ("3 for result");
		  System.out.println ("4 for grade");
		  System.out.println ("5 for exit");
		  System.out.println ("Enter ur choices");
	
		  choices = sc.nextInt();
		  
		  
		  
		  
		  
		  
		  switch (choices){
		
		  case 1 :
		  {
		  System.out.println ("TOTAL MARKS : "+ totalres);	
		  } break ;
		  
		  case 2 :
		  {
		  System.out.println ("PERCENTAGE : "+ percentageres + "%");	
		  }break;
		  
		  
		  case 3 :
		  {
		  System.out.println ("GRADE : "+ graderes);
		  } break;

		  case 4 :
		  {
		  System.out.println ("RESULT : "+ resultres);	
		  } break;
		  
		  
		   
		 } 

		 }while (choices!=5);
		 
		}





}

