package p2;
import java.util.*;
public class Sub{
  int s;
  public void dif()
  {
    System.out.println("Enter the first number");
    Scanner scr=new Scanner(System.in);
    int x=scr.nextInt();
    System.out.println("Enter second number");
    int y=scr.nextInt();
    s=x-y;
    System.out.println("sum="+s);
    scr.close();
  }
}
