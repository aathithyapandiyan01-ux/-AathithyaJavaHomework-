class TRAFFICSIGNAL
{
 public static void main (String [] args)
 {
  String color ="RED";
  switch(color)
  {
    case "RED" :
           System.out.println("IT IS STOP");
           break;
    case "GREEN" :
           System.out.println("IT IS GO");
           break;
    case "YELLOW" :
           System.out.println("IT IS READY");
           break;   
    default :
           System.out.println(    "invalid");
           break;
   }

  }

}