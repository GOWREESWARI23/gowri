import java.util.Scanner;
class Pnz
{
 public static void main(String args[])
 {
  int a;
  System.out.println("enter the value for a");
  Scanner in=new Scanner(System.in);
   a=in.nextint();
   if(a>0)
   {
    System.out.println("positive");
   }
   else if(a<=0)
   { 
    System.out.println("negative"); 
   else
   {
    System.out.println("zero");
    
   }
 }
}
