import java.util.Scanner;
class Spotify
{
	public static void main ( String[] args )
	{
		Scanner sc = new Scanner(System.in);
		System.out.println ("Welcome to Spotify");
		System.out.println ("Type 1 for Ilayaraja songs");
	    System.out.println ("Type 2 for AR Rahman songs");
	   	System.out.println ("Type 3 for Harish Jayaraj songs");
	   	System.out.println ("Type 4 for Anirudh songs");
	   	System.out.println ("Type 5 for U1 songs");
	    System.out.print ("Select ur fav Music Director:");
		int MusicDirectors = sc.nextInt();
		if ( MusicDirectors==1)
		{
			System.out.println ("Welcome to Ilayaraja songs");
		    System.out.println ("1 . Melody");
 		 	System.out.println ("2 . Kuthu");
		    System.out.println ("3 .Sad");
		    System.out.print ("Select your playlist :");			
			int songs = sc.nextInt();
			if ( songs==1 )
			{
			    System.out.println ("U have selected Melody");
				System.out.println ("1 . Oru kili uruguthu");
				System.out.println ("2 .Kuzhaloodhum Kannanuku");
				System.out.println ("3 .Ennai thottu");
				System.out.println ("4 . Raja Raja Cholan");
				
			}
			
			else if (songs==2)	
			{
				System.out.println ("1 .Ooru vittu Ooruvanthu");
				System.out.println ("2 .Nooru varusham");
				System.out.println ("3 .Aasai nooruvagai");
				System.out.println ("4 .Aasai athigam vachu");
			}				
			
			else if (songs==3)
            {
                System.out.println ("1 . Kanne kalaimane");
				System.out.println ("2 .Then Pandi Cheemaiyile");
				System.out.println ("3 .Paadi parantha kili");
				System.out.println ("4 .Nilave vaa");
			
			}	
			else
			{
				System.out.println("your selection  is not available");
			}	
			
		}	
			
			
		else if( MusicDirectors==2)
		{
			System.out.println ("Welcome to AR Rahman songs");
		    System.out.println ("1 . Melody");
 		 	System.out.println ("2 . Kuthu");
		    System.out.println ("3 .Motivational ");
            System.out.print ("Select your playlist :");
		  
			int songs = sc.nextInt();
			if ( songs==1 )
			{
				System.out.println ("1 . Netru ilatha Maatram");
				System.out.println ("2 .Enna Solla Pogirai");
				System.out.println ("3 Ennavale Adi Ennavale");
				System.out.println ("4 . Malargale Malargale");
				
			}
			
			else if (songs==2)	
			{
				System.out.println ("1 .Thaiya Thaiya");
				System.out.println ("2 Mukkala Mukkapila");
				System.out.println ("3 urvashi Uravashi");
				System.out.println ("4 Aathichudi");
			}				
			
			else if (songs==3)
            {
                System.out.println ("1 .vande Maatram");
				System.out.println ("2 .oruvan oruvan muthalali");
				System.out.println ("3 Shakthi kudu");
				System.out.println ("4 .Kappal yeri poyachu");	
            }
				
			else 
            {
				System.out.println ("your selection is not available");
		
			}				
			
		}	
		
		
		else if( MusicDirectors==3)
		{
			System.out.println ("Welcome to Harish jayaraj songs");
		    System.out.println ("1 . Melody");
 		 	System.out.println ("2 . Kuthu");
		    System.out.println ("3 .Sad");
            System.out.print ("Select your playlist :");
		  
			int songs = sc.nextInt();
			if ( songs==1 )
			{
				System.out.println ("1 .Unnale");
				System.out.println ("2 Annul Mele");
				System.out.println ("3 Yedho Ondru");
				System.out.println ("4 .Vaseegara");
				System.out.println ("5 Paartha Muthalnaale");

			}
			
			else if (songs==2)	
			{
				System.out.println ("1 .Thirunelveli alwada");
				System.out.println ("2 Aaradi Kaathe");
				System.out.println ("3 Soda bottle");
				System.out.println ("4 Aruva meesa");
			}				
			
			else if (songs==3)
            {
                System.out.println ("1 .Venmathiye");
				System.out.println ("2 .Oh maname");
				System.out.println ("3 Yamma Yamma");
				System.out.println ("4 .Othaiyile");
			}	
			else
			{
				System.out.println("your selection  is not available");
			}	
		}	
        
        else if( MusicDirectors==4)
		{
			System.out.println ("Welcome to Anirudh songs");
		    System.out.println ("1 . Melody");
 		 	System.out.println ("2 . Kuthu");
		    System.out.println ("3 .Sad");
			System.out.println ("4 .Motivational ");
            System.out.print ("Select your playlist :");
		  
			int songs = sc.nextInt();
			if ( songs==1 )
			{
				System.out.println ("1 .Neeyum Naanum Anbe");
				System.out.println ("2 .Velicha Poovey");
				System.out.println ("3 Po indru Neeyaga");
				System.out.println ("4 .Nee paartha viligal");
				
			}
			
			else if (songs==2)	
			{
				System.out.println ("1 .Vaathi raid");
				System.out.println ("2  Naa ready");
				System.out.println ("3 Badass");
				System.out.println ("4 Vandha edam");
			}				
			
			else if (songs==3)
            {
                System.out.println ("1 .porkanda singam");
				System.out.println ("2  kanave kanave");
				System.out.println ("3 kanaana kanne");
				System.out.println ("4 Jodi nilavu");
			}
			else if (songs == 4)
            {  
                System.out.println ("Velai Ila Patathaari");
                System.out.println ("Boomi ena suthuthe");
				System.out.println ("Ethir neechal");
				System.out.println ("Surviva");				
			}	
			else 
            {
				System.out.println ("your selection is not available");
		
			}
			
        }


        else if( MusicDirectors==5)
		{
			System.out.println ("Welcome to u1 songs");
		    System.out.println ("1 . Melody");
 		 	System.out.println ("2 . Kuthu");
		    System.out.println ("3 .Sad");
			System.out.println ("4 .Motivational ");
            System.out.print ("Select your playlist :");
			int songs = sc.nextInt();
			if ( songs==1 )
			{
				System.out.println ("1 .Aathadi manasutha");
				System.out.println ("2 Chinna sirusu");
				System.out.println ("3 Iyyayayoo");
				System.out.println ("4 .venmegam");
				
			}
			
			else if (songs==2)	
			{
				System.out.println ("1 Machi open the bottle");
				System.out.println ("2  saroja samanikalo");
				System.out.println ("3 No money No honey");
				System.out.println ("4 Vilaiyaadu Mankatha");
			}				
			
			else if (songs==3)
            {
                System.out.println ("1 .Kadhal Valarthe");
				System.out.println ("2  Yetho ondru");
				System.out.println ("3 Pogahe");
				System.out.println ("4 Ninaithu Ninaithu");
			}
			else if (songs == 4)
            {  
                System.out.println ("dhirthu nill");
                System.out.println ("Oru naalil");
				System.out.println ("Nimirnthu nil");
				System.out.println ("Ungalukule mirugam");				
			}	
			else 
            {
				System.out.println ("your selection is not available");
		
			}				
        }


		else
		{
			System.out.println ("your section is not available here , thanks for your time at spotify");
			
		}	
			
			
			
		
			
			
			
			
		
 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}