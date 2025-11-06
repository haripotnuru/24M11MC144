class Q {
  int num;
  boolean valueSet = false;

  // Producer puts data
  public synchronized void put(int num) {
      while (valueSet) {
          try {
              wait(); // Wait if a value is already set
          } catch (Exception e) {
              e.printStackTrace();
          }
      }
      System.out.println("Put: " + num); // Correctly placed after setting the value
      this.num = num;
      valueSet = true;
      notify(); // Notify consumer
  }

  // Consumer gets data
  public synchronized void get() {
      while (!valueSet) {
          try {
              wait(); // Wait if no value is set
          } catch (Exception e) {
              e.printStackTrace();
          }
      }
      System.out.println("Get: " + num); // Correctly placed after getting the value
      valueSet = false;
      notify(); // Notify producer
  }
}

class Producer implements Runnable {
  Q q;

  public Producer(Q q) {
      this.q = q;
      Thread t = new Thread(this, "Producer");
      t.start();
  }

  public void run() {
      int i = 0;
      while (true) {
          q.put(i++); // Incrementally put values
          try {
              Thread.sleep(1000); // Sleep for clarity in output
          } catch (Exception e) {
              e.printStackTrace();
          }
      }
  }
}

class Consumer implements Runnable {
  Q q;

  public Consumer(Q q) {
      this.q = q;
      Thread t = new Thread(this, "Consumer");
      t.start();
  }

  public void run() {
      while (true) {
          q.get(); // Consume values
          try {
              Thread.sleep(1000); // Sleep for clarity in output
          } catch (Exception e) {
              e.printStackTrace();
          }
      }
  }
}

public class InterThreadCommun1 {
  public static void main(String[] args) {
      Q q = new Q();
      new Producer(q); // Create producer thread
      new Consumer(q); // Create consumer thread
  }
}