class netchange
{
 public static void main ( String [] args )
 {
  int number = 100;
  double increase = (number*20) /100;
  double increasedvalue = number + increase;

  double decrease = (increasedvalue*20)/100;
  double decreasedvalue = increasedvalue - decrease;

  double netchange = number - decreasedvalue;

  System.out.println ("netchange :" + netchange);

 }

}