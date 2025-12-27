class Palindromeone
{
 public static void main(String [] args)
 {
  int a = 1441;
  int b = a%10;
  int c = a/10;
  int d = c%10;
  int e = c/10;
  int f = e%10;
  int g = e/10;





  int h = (1000*b)+(100*d)+(10*f)+(1*g);
  boolean i = (h==a);

 System.out.println ("Result : "+i);
 }


}