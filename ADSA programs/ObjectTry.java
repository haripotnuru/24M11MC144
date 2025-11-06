import java.util.ArrayList;
import java.util.List;


class A 
{
   ArrayList<Integer> obj=new ArrayList<Integer>();
   List<B> obj1=new ArrayList<B>();
   void show()
   {
    obj.add(10);
    obj.add(20);
    obj.add(30);
    obj.forEach(a->System.out.println(a));
   }
   void methodCallB()
   {
    obj1.add(new B());
    obj1.add(new B());
    obj1.add(new B());
   }
   void viewInA()
   {
    obj1.forEach(a->{a.view();
    System.out.println(a);});
    
   }
   void objects()
   {
    obj1.get(0).view();
   }
}
class B
{
  void view()
  {
    System.out.println("This is view method in B");
  }

}
public class ObjectTry {
  public static void main(String[] args) {
    A objA=new A();
   // objA.show();
    objA.methodCallB();
    //objA.viewInA();
    objA.objects();
  }
}
