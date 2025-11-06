import p1.*;
import p2.*;
import p3.*;
import java.util.*;
public class PackageExample3 {
  public static void main(String[] args) {
    int k;
    do
    {
      try{
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a value for:\n1)Add\n2)Substraction\n3)Multiplication\n4)Exit");
        k=scan.nextInt();
        System.out.println("Error:Exception in main value");
      }
      catch(E)
      {

      }
      finally
      {
          System.out.println("Executing remaining next ...");
      }
      switch (k) {
        case 1:
            {
              Add a=new Add();
              a.sum();
              break;
            }
        case 2:
        {
          Sub s=new Sub();
          s.dif();
          break;
        }
        case 3:
        {
          Mul m=new Mul();
          m.mult();
          break;
        }
        case 4:
        {
          System.out.println("Exiting...");
        }
        default:
        {
          System.out.println("Enter only 1 or 2 or 3 values");
          System.out.println("4 for exit");
        }
          break;
      }
     // scan.close();
    }
    while(k!=4);
    
  }
}
