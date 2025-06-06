package beforemultithreading;

public class DemoClass {
    public static void main(String[] args){
        System.out.println("part 1 is printing the number in Ascending order 1 to 10");
        for(int i =1; i <=10; i++){
            System.out.println("i value is: "+i);
        }
        System.out.println("part 2 is printing the number in Descending order 10-1");
        for(int j =10; j>=1; j--){
            System.out.println("j value is : "+j);
        }
    }
}
