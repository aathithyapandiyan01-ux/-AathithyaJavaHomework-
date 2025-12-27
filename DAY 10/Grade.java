class Grade
{
 public static void main (String [] args)
 {
  char grade = 'B';
  switch(grade)
  {
    case 'A' :
           System.out.println("IT IS excellent");
           break;
    case 'B' :
           System.out.println("IT IS good");
           break;
    case 'C' :
           System.out.println("IT IS better");
           break;
    case 'D' :
           System.out.println("IT IS improve");
           break;   
    case 'E' :
           System.out.println("IT IS fail");
           break;
   
    default :
           System.out.println("Absent");
           break;
   }

  }

}