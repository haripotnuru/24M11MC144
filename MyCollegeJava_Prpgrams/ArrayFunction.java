import java.util.Scanner;

class Array1DAnd2D
{
    private int s1;
    private int s2;
    Scanner scr=new Scanner(System.in);
    public int[] setS1(int s1) {
        this.s1 = s1;
        int ar[]= Array1DA();
        return ar;
    } 
    
    public int[][] setS2(int s1,int s2) {
        this.s1 = s1;
        this.s2 = s2;
       int ar1[][]= Array2DA();
       return ar1;
    }

    public int[] Array1DA()
    {
        int arr[]=new int[s1];
        System.out.println("Enter the 1D array elements");
        for(int i=0;i<s1;i++)
        {

            arr[i]=scr.nextInt();   
        }
        // for(int i=0;i<arr.length;i++)
        // {
        //     System.out.print(arr[i]+",");
        // }
        return arr;
    }
    public int[][] Array2DA()
    {
        int arr2d[][]=new int[s1][s2];
        System.out.println("Enter the 2D array elements");
        for(int i=0;i<s1;i++)
        {
            for(int j=0;j<s2;j++)
            {
            arr2d[i][j]=scr.nextInt();
            }   
        }
        // for(int i=0;i<arr2d.length;i++)
        // {
        //     for(int j=0;j<arr2d[i].length;j++)
        //     {
        //     //arr2d[i][j]=scr.nextInt();
        //     System.out.print(arr2d[i][j]+"  ");
        //     }  
        //     System.out.println(); 
        // }
        return arr2d;
    }

    
}
public class ArrayFunction {
    public static void main(String[] args) {
        Scanner scr1=new Scanner(System.in);
        Array1DAnd2D obj=new Array1DAnd2D();
        // System.out.println("Enter one D array or 2D array");

        // int op=scr1.nextInt();
        int D1arr[];
        int D2arr[][];
        int op;
        do {
            System.out.println("Enter 1 for 1D array or 2 for 2D array or 3 for Exit");
            op=scr1.nextInt();
            
            switch (op) {
                case 1:
                {
                  System.out.println("Enter the size of the array");
                  D1arr=obj.setS1(scr1.nextInt());
                  for(int i=0;i<D1arr.length;i++)
                  {
                      System.out.print(D1arr[i]+",");
                  }
                  System.out.println();
                    break;
                }
                 case 2:
                 {
                    System.out.println("Enter the Two sizes of the 2Darray");
                    D2arr=obj.setS2(scr1.nextInt(),scr1.nextInt());
                    for(int i=0;i<D2arr.length;i++)
                        {
                            for(int j=0;j<D2arr[i].length;j++)
                            {
                            //arr2d[i][j]=scr.nextInt();
                            System.out.print(D2arr[i][j]+"  ");
                            }  
                            System.out.println(); 
                        }
                    break;
                 }
                 case 3:System.out.println("Exiting...");
                 break;
                default:
                System.out.println("Enter proper value");
                    break;
           
        }
        
        } while (op!=3);
        
        scr1.close();
    }
}
