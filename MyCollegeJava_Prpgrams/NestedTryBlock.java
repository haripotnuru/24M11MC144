//Nested try 
public class NestedTryBlock {
  public static void main(String[] args) {
    //outer try block
    try{
      //inner try block 
      try{
        
        System.out.println("Going to devide by zero");
        int a=100/0;
      }
      //Catch block for inner try block 1
      catch(ArithmeticException e)
      {
        System.out.println(e);
      }
      //inner try block 2
      try
      {
        int a[]=new int[5];
        //Assigning the value of out of array bounds
        a[5]=4;
      }
      catch(ArrayIndexOutOfBoundsException e)
      {
        System.out.println(e);
      }
      }
      catch(Exception r)
      {

      }
      System.out.println("Other statement");
      
  }
}
