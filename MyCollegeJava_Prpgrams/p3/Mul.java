package p3;
import java.util.Scanner;
public class Mul{
  int m;
  public void mult()
  {
    System.out.println("Enter the first number");
    
    Scanner scr=new Scanner(System.in);
    int x=scr.nextInt();
    System.out.println("Enter second number");
    int y=scr.nextInt();
    m=x*y;
    System.out.println(x+""+y+"="+m);
    scr.close();
}
}
