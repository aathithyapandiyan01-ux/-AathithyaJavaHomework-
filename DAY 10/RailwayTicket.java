class RailwayTicket
{
 public static void main (String [] args)
 {
  int num = 5;
  switch(num)
  {
    case 1 :
           System.out.println("General ticket is rs.200");
           break;
    case 2 :
           System.out.println("sleeper ticket is rs.400");
           break;
    case 3 :
           System.out.println("AC tier 2 ticket is rs.800");
           break;
    case 4 :
           System.out.println("AC tier 3 ticket is rs.1000");
           break;   
    case 5 :
           System.out.println("First class ticket is rs.1500");
           break;   
       default :
           System.out.println("invalid");
           break;
   }

  }

}