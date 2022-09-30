class Demo1 implements Runnable//Demo1 class implements Runnable Interface
{
    public void run()//Defining method run()
    {
        System.out.println("Hello World using Runnable Interface");//Printing Hello World
    }

}

public class DemoThread1
{
    public static void main(String[] args) {
        Thread obj=new Thread(new Demo1());//Creating Thread obj
        obj.start();//Executing the Thread
        System.out.println("Hello World from main Thread");
        System.out.println("21CE016:MAMTA ");

    }
}

