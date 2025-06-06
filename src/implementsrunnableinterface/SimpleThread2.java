package implementsrunnableinterface;

public class SimpleThread2 implements Runnable{
    public SimpleThread2(){
        Thread thread2 = new Thread(this, "SimpleThread2");
        thread2.start();
    }
    @Override
    public void run() {
        try{
            System.out.println("part-2 printing the number in descending order 10-1");
            for(int j=10; j>=1; j--){
                System.out.println("j value is: "+j);
                Thread.sleep(5);
            }
        } catch (Exception e){
            System.out.println("some ecception occured: "+e.getMessage());
        }
    }
}
