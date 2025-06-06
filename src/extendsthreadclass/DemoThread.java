package extendsthreadclass;

public class DemoThread extends Thread {
    public DemoThread(){
        start(); // it will start the thread
    }

    @Override
    public void run() {
      try {

          System.out.println("part 2 printing the number in descending order 10-1");
          for (int j = 10; j >= 1; j--) {
              System.out.println("j value is: " + j);
              Thread.sleep(5);
          }
      } catch(Exception e){
          System.out.println("exception occurred: "+e.getMessage());
      }
    }
}
