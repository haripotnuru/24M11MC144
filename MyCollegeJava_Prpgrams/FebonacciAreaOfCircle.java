import java.util.*;
class FebonacciForN
{
        int num1=0;
        int num2=1;
        // int result=0;
        int n;
        public void Febon(int n)
        {
            this.n=n;

            System.out.print("Febonacci Series untill "+n+" terms:");
        for(int i=1;i<=n;i++)
        {
            System.out.print(num1+",");
            int next=num1+num2;
            num1=num2;
            num2=next;
        }
    }
}
class AreaOfCircle
{
        double r;
       private double result1;
        public AreaOfCircle()
        {
            this.result1=0;
        }
         public double circleArea(double r)
         {
            this.r=r;
            this.result1=3.14*r*r;
            return result1;
         }
}
public class FebonacciAreaOfCircle {
    public static void main(String[] args) {
        Scanner scr=new Scanner(System.in);
        FebonacciForN obj=new FebonacciForN();
        System.out.println("\nEnter n value for Febonacci series");
        obj.Febon(scr.nextInt());
        AreaOfCircle obj1=new AreaOfCircle();
        System.out.println("\nEnter the radius");
        System.out.println(obj1.circleArea(scr.nextDouble()));
        scr.close();

    }
}
