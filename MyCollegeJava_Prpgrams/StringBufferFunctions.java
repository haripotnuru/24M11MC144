public class StringBufferFunctions {
  public static void main(String[] args) {
    StringBuffer sb=new StringBuffer("Hello");
    System.out.println("Original String:"+sb);
    StringBuffer sb1=sb.append(" Wor");
    System.out.println("This is appended string with Welcome:"+sb1);
    System.out.println("String length of original string:"+sb.length());//length is the original charactors length
    System.out.println("String capacity of Oroginal Stirng:"+sb.capacity());//It gives the extra 16 Charactors for the string
    StringBuffer sb2=new StringBuffer(sb1.insert(sb.length()," javaGuides"));
    StringBuffer sb3=new StringBuffer(sb2);
    System.out.println("Inserting the string to original string:"+sb2);
    System.out.println("Replacing the 0 index to 5 index in "+sb2+"is : "+sb2.replace(0, 5,"Hii"));
    System.out.println("String length of sb2:"+sb3.length()+"\nString length of sb2 After replace:"+sb2.length());
    StringBuffer sb4=new StringBuffer(sb3);
    System.out.println("String reverse for sb2:"+sb4.reverse());
  }
}