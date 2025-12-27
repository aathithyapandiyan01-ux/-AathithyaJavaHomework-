class Palindrome
{
 public static void main(String [] args)
 {
  int a = 171;
  int b = a%10;
  int c = a/10;
  int d = c%10;
  int e = c/10;
  int f = (100*b)+(10*d)+(1*e);
  boolean g = (f==a);

 System.out.println ("Result : "+g);
 }


}