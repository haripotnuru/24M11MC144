import java.util.Arrays;

class QueueArray{
    private int[] queue;
    private int rear=-1;
    private int front=-1;
    private int size=0;
    private int count=0;
    public QueueArray(int size)
    {
      this.size=size;
      queue=new int[size];
    }
    /////to enter a number to queue
    public void enQueue(int num)
    {
      if (count<size) 
      {
        if (rear==-1 && front==-1)
        {
          rear=0;
          front=0;
          queue[rear]=num;
          count++;
          
        }
        else if (rear==size-1) {
          rear=0;
          count++;
          queue[rear]=num;
          
        }
        else 
        {
          rear++;
          queue[rear]=num;
          count++;
        }
      }
      else
      {
        System.out.println("The queue is full");
      }
      System.out.println("the count of Queue : "+count);
    }
    //////to dequeue the element in queue
    public void deQueue()
    {
      if (count>0) 
      {
        int q=front;
        if (front==size-1) {
          front=0;
          count--;
        }
        else
        {
          front++;
          count--;
        }
        System.out.println("Your deleted number : "+queue[q]);
      }
      else
      {
        System.out.println("the count of Queue : "+count);
      }
    }
    /////Display////
    public void display()
    {
      if (count==0) 
      {
        System.out.println("the queue is empty");
      }
      else
      {
        int x=rear<front?rear:front;
      }
    }
}
public class CireclerQueue {
  public static void main(String[] args) {
    QueueArray obj=new QueueArray(5);
    obj.enQueue(10);
    obj.enQueue(14);
    obj.enQueue(16);
    obj.enQueue(19);
    obj.display();
  }
}
