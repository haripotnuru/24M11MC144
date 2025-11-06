class Student
{
  void fee()
  {
    System.out.println("Student Fee=2000");
  }
}
class Student_Name extends Student
{
  void name()
  {
    System.out.println("Student Name=Hari");
    super.fee();
   // this.fee();
  }
  void fee()
  {
    System.out.println("Student Fee=20000");
  }
  
}
public class SingleInheritance {
  public static void main(String[] args) {
    Student_Name student1= new Student_Name();
    student1.name();
    student1.fee();
  }
}
