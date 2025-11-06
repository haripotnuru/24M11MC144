public class StringFunctions {

  public static void main(String[] args) {
    String name="   Hello World!";
   // String name3="   Hello World!   ";
    String name2="Welcome   ";
    System.out.println("The length of the string name="+name.length());
    System.out.println("Concatinate string with string:"+name.concat(name2));
    System.out.println("to print Charactor at a position by using charAt method // Char At position 3:"+name.charAt(3));
    int i1=name.indexOf('o');
    String s2=name.toUpperCase();
    String s3=name.substring(4, 10);
    System.out.println("index of 'a'="+i1+"\nTo upper case of name="+s2+
    "\nSubstring of String name="+s3);
    int s4=name.indexOf("World");
    System.out.println("Index of string ="+s4);
    String s5=name.substring(4, 10);
    Boolean b1=s3.equals(s5);
    System.out.println("Printing the equals method for :"+b1);
    StringBuffer name5=new StringBuffer("Hello");
    System.out.println(name5);
    System.out.println(name5.insert(5," World!"));
    System.out.println(name5);
    System.out.println(name2==name5.toString());
    String s6=name.trim();
    System.out.println(s6);
    System.out.println(name2+ " replacing the charactor of W to M:"+name2.replace("Welcome", "Morning"));
    System.out.println(name2);
    System.out.println("lower case of:"+name.toLowerCase());
  }
}