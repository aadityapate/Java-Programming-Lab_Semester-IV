import java.util.Random;

class GenerateNumber implements Runnable 
{
    private Random random = new Random();
    private int num;

    public void run() 
    {
        try 
        {
            while (true) 
            {
                num = random.nextInt(10);
                System.out.println("Generated number: " + num);

                if (num % 2 == 0) 
                {
                    Thread t2 = new Thread(new ComputeSquare(num));
                    t2.start();
                    t2.join();
                } else 
                {
                    Thread t3 = new Thread(new ComputeCube(num));
                    t3.start();
                    t3.join();
                }

                Thread.sleep(1000);
            }
        } 
        catch (InterruptedException e) 
        {
            System.out.println("Thread interrupted");
        }
    }
}
class ComputeSquare implements Runnable 
{
    private int num;
    ComputeSquare(int num) 
    {
        this.num = num;
    }
    public void run() 
    {
        System.out.println("Square of " + num + ": " + num * num);
    }
}
class ComputeCube implements Runnable 
{
    private int num;

    ComputeCube(int num) 
    {
        this.num = num;
    }

    public void run() 
    {
        System.out.println("Cube of " + num + ": " + num * num * num);
    }
}
public class Module 
{
    public static void main(String[] args)
    {
        Thread t1 = new Thread(new GenerateNumber());
        t1.start();
    }
}
