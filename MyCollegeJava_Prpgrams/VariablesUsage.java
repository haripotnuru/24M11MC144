public class VariablesUsage {
    public static void main(String[] args) {
        int num=20;
        String message1= "Hello, Hari";
        System.out.println("num:"+num);
        System.out.println("Message:"+message1);
        if(num>10)
        {
            String result=num+" is greater then 10";
            System.out.println(result);
        }
        for(int i=0;i<3;i++)
        {
            String Iteration="Iteration";
            System.out.println(Iteration+" : "+i);
        }
    }
}
