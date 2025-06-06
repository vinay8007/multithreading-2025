package extendsthreadclass;

public class SampleThread extends Thread{
    public SampleThread(){
        start();
    }

    @Override
    public void run() {
      try {
        System.out.println("part 1 printing the number in ascending order 1-10");
        for(int i =1; i<=10; i++){
            System.out.println("i value is : "+i);
            Thread.sleep(5);
        }
      } catch (Exception e){
          System.out.println("Exception occured: "+e.getMessage());
      }
    }
}
