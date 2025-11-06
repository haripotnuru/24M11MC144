import java.text.DecimalFormat;
import java.util.*;
 class Arthematic
 {
    //Addition method to add numbers
    void Addition(int num1,int num2)
    {
        System.out.print("Addition of that two numbers : ");
        System.out.println(num1+num2);
    }
    //Substraction of two numbers
    void Substraction(int num1,int num2)
    {
        System.out.print("Substraction of that two numbers : ");
        System.out.println(num1-num2);
    }
    //Multipilication of two numbers 
    void Multiplication(int num1,int num2 )
    {
        System.out.print("Multiplication of that two numbers : ");
        System.out.println(num1*num2);
    }
    // Division of two numbers 
    void Divion(int num1,int num2)
    {
        double Num1=(double)num1;
        double Num2=(double)num2;
        //creating the object to the DecimalFromat class to create custom assigning of decimal value 
        DecimalFormat df=new DecimalFormat("#.00");
        System.out.println("Division of that two numbers : "+df.format(Num1/Num2));// calling the Format method by using of object 
       // System.out.print(Num1/Num2);
    }
    void Remider(int num1,int num2)
    {
        System.out.print("Reminder of that two numbers : ");
        System.out.println(num1/num2);
    }
 }
public class ArthematicOprators1 {
    public static void main(String[] args) {
        //Creating the path to access the user input by creating the object to the scanner class
        Scanner scr=new Scanner(System.in);//A
        //creating object to the Arthematic class
        Arthematic obj=new Arthematic();
        int number1;
        int number2;
         // asking to values from the user to do the arthmatic operation with that values
        System.out.println("Enter two values to do athematic operstions");
        number1=scr.nextInt();
        number2=scr.nextInt();
        scr.close();//closing the scanner object
        //calling the methods in Arthematic class throgh the objects
        obj.Addition(number1, number2);
        obj.Substraction(number1,number2);
        obj.Multiplication(number1,number2);
        obj.Divion(number1, number2);
        obj.Remider(number1, number2);

    }
}

