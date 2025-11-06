//To get the true or flase we use boolean datatype 
//boolean is not support 0,1 binary not support as true or false
public class BooleanDataType
{
    public static void main(String[] args) {

        boolean bn=2<3;
        System.out.println("bn=2<3==>"+bn);
        bn=!true;
        System.out.println("bn=!true==>"+bn);
       /// boolean bz=2<3?!true:true;//Ternary operator
       // System.out.println("2<3?!true:false using the not operator with ternary operator==>"+bz);
        bn=!!true;
        if(bn)
        {
            System.out.println(" The boolean variable is true"+true);
        }
        if(!bn)
        {
            System.out.println("Not executed");
        }
    }
   
    
}