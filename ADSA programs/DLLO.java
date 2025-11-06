import java.util.Scanner;
class DLLOperations
{
  class Node
  {
    int data;
    Node pre,next;
    Node(int d)
    {
      data=d;
      pre=next=null;
    }
  }
  public Node first,last;
  public void insertFirst(int data)
  {
    Node newnode=new Node(data);
    if(first==null)
    {
      first=last=newnode;
      return;
    }
    newnode.next=first;
    first.pre=newnode;
    first=newnode;
  }
  public void insertPosition(int data,int position)
  {
    if(position==0) {
      insertFirst(data);
      return;
    }
    Node newnode=new Node(data);
    Node temp=first;
    for(int i=0;temp!=null&&i<position-1;i++)
    {
      temp=temp.next;
    }
    if (temp==null) {
      return;
    }
    newnode.next=temp.next;
    if(temp.next!=null)
    {
      temp.next.pre=newnode;
    }
    temp.next=newnode;
    newnode.pre=temp;
    if(newnode.next==null)
    {
      last=newnode;
    }
  }
  public void insertLast(int data)
  {
    Node newnode=new Node(data);
    if (first==null) {
      first=last=null;
      return;
    }
    last.next=newnode;
    newnode.pre=last;
    last=newnode;
  }
  public void displayDLL()
  {
    if(first==null)
    {
      System.out.println("List is empty");
      return;
    }
    Node temp=first;
    while (true) {
      if(temp==null)
      {
        return;
      }
      System.out.println(temp.data);
      temp=temp.next;
    }
  }
}
public class DLLO
{
  public static void main(String[] args) {
    Scanner scr=new Scanner(System.in);
    DLLOperations obj=new DLLOperations();
    obj.insertFirst(10);
    obj.insertFirst(11);
    obj.insertFirst(14);
    obj.insertFirst(17);
    obj.displayDLL();
    System.out.println("This is Double Linked List Opereations");
    int button,value,position;
    do {
      System.out.println("Chooise the Options Below");
      System.out.println("1)Insert First");
      System.out.println("2)Insert Last Position");
      System.out.println("3)Insert At Position");
      System.out.println("4)Display");
      System.out.println("5)Exit");
      button=scr.nextInt();
      switch (button) {
        case 1:
          {
            System.out.println("Enter value");
            value=scr.nextInt();
          obj.insertFirst(value);
          break;
          }
        case 2:
        {
          System.out.println("Enter value");
          value=scr.nextInt();
          obj.insertLast(value);
          break;
        }
        case 3:
        {
          System.out.println("Enter posotion and value");
        }
        default:
          break;
      }
    } while (button!=5);
  }
}