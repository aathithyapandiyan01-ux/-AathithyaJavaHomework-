class RailwayTicketB
{
 public static void main (String [] args)
 {
  int num = 7;
  switch(num)
  {
    case 1 -> System.out.println("General ticket is rs.200");
    case 2 -> System.out.println("sleeper ticket is rs.400");
           
    case 3 -> System.out.println("AC tier 2 ticket is rs.800");
           
    case 4 -> System.out.println("AC tier 3 ticket is rs.1000");
           
    case 5 -> System.out.println("First class ticket is rs.1500");
             
       default ->
           System.out.println("invalid");
   }

  }

}