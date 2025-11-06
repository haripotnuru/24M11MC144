public class AssignmentOp {
    public static void main(String[] args) {
        int num=5;
        System.out.println("num+=3 : "+(num+=3));
        System.out.println("num-=4 : "+(num-=4));
        System.out.println("num*=2 : "+(num*=2));
        System.out.println("num/=3 : "+(num/=3));
        System.out.println("num%=3 : "+(num%=3));
        System.out.println("num&=0b1010 : "+(num &=0b1010));
        System.out.println("num|=0b1100 : "+(num|=0b1100));
        System.out.println("num^=0b1010 : "+(num^=0b1010));
        System.out.println("num<<=2 : "+(num<<=2));
        System.out.println("num>>=1 : "+(num>>=1));
        System.out.println("num>>>=1 : "+(num>>>=1));
    }
}
