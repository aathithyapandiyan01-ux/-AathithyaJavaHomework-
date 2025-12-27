class Interest5yearsAfter
{
 public static void main ( String [] args )
 {
 int PrincipalAmount = 50000;
 int RatesOfInterestPerAnnum = 6;
 int Time = 5;
 int SimpInterest =(PrincipalAmount*RatesOfInterestPerAnnum*Time)/100;
 int total = PrincipalAmount + SimpInterest;

 System.out.println (" Simple Interest : " + SimpInterest);

 System.out.println ("total : " + total);
 }

}