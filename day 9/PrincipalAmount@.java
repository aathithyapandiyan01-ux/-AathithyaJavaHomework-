class PrincipalAmount
{
 public static void main ( String [] args )
 {
 int PrincipalAmount = 25000;
 int RatesOfInterestPerAnnum = 7;
 int Time = 4;
 int Interest =(PrincipalAmount*RatesOfInterestPerAnnum*Time)/100;

 int total = Interest +PrincipalAmount;

 System.out.println (" Simple Interest : " + Interest);
 System.out.println (" total  : " + total);


 }

}