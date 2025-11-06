import java.util.Scanner;
public class StackArray {
  private int[] stackArray;
  private int maxSize;
  private int top=-1;
  public StackArray(int maxSize)
  {
    this.maxSize=maxSize;
    stackArray=new int[maxSize];
  }
  
  // public void createStack(int maxSixe)
  // {
  //   this.maxSixe=maxSixe;
  //   if(stackArray==null)
  //   {
  //     stackArray=new int[this.maxSixe];
  //   }
  //   else
  //   {
  //     System.out.println("stackArray already created\n");
  //   }
  // }
  public void pushValue(int value)
  {
    if(top==maxSize-1)
    {
      System.out.println("StackArray is over flow\n");
      return;
    }
    else
    {
      top++;
      stackArray[top]=value;
      System.out.println("The value inserted successfully");
    }
  }
  public void popValue()
  {
    if(top==-1)
    {
      System.out.println("The array is Underflow");
    }
    else{
      int delValue=stackArray[top];
      top--;
      System.out.println(delValue+" This value is deleted from stack");
    }
  }
  public int topValue()
  {
    // if(top==-1)
    // {
    //   System.out.println("The array is Underflow");
    //   return -1;
    // }
    // else
    // {
    //   return stackArray[top];
    // }
    return (top==-1)?-1:stackArray[top];
  }
  public static void main(String[] args) {
    Scanner scr=new Scanner(System.in);
    System.out.println("Welcome stack array concept");
    int maxSixe;
    System.out.println("Enter the max size of Stack Array:");
    maxSixe=scr.nextInt();
    StackArray stack=new StackArray(maxSixe);
    int button;
    do {
      System.out.println("Enter the options below");
      //System.out.println("1)Create Stack");
      System.out.println("1)Push element");
      System.out.println("2)Pop an element");
      System.out.println("3)Show the stack element");
      System.out.println("4)Exit\n-->");
      button=scr.nextInt();
      switch (button) {
        case 1:
        {
          System.out.println("Enter tha value to push:");
          stack.pushValue(scr.nextInt());
          break;
        }
        case 2:
        {
          stack.popValue();
          break;
        }
        case 3:
        {
          if(stack.top==-1)
          {
            System.out.println("No value in Stack");
          }
          else
          {
            System.out.println("The value on top of Stack "+stack.topValue());
          }
          break;
        }
        case 4:{System.out.println("Exiting..");break;}
        default:
        {
          System.out.println("Enter proper value\n");
          break;
        }
          
      }
    } while (button!=4);
    scr.close();
  }
}
