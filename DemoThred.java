)
class Demo extends Thread//Demo class extends Thread class
{
    public void run()//Defining method run()
    {
        System.out.println("Hello World!!!");//Printing Hello World
    }
}

public class DemoThread {

    public static void main(String[] args) {
        Demo d=new Demo();//Creating Thread d
        d.start();//Executing the thread
        System.out.println("Hello World from main Thread");
        System.out.println("21CE016:MAMTA");

    }


}
