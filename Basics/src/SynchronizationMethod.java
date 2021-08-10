// Example that shows multiple threads
// can execute the same method but in
// synchronized way.
class SynchronizationMethod
{
  
    // if multiple threads(trains) trying to access
    // this synchronized method on the same Object
    // but only one thread will be able
    // to execute it at a time.
    synchronized public void getLine()
    {
        for (int i = 0; i < 3; i++)
        {
            System.out.println(i+5);
            try
            {
                Thread.sleep(400);
            }
            catch (Exception e)
            {
                System.out.println(e);
            }
        }
    }
}
  
class Train extends Thread
{
    // Reference variable of type Line.
	SynchronizationMethod line;
  
    Train(SynchronizationMethod line)
    {
        this.line = line;
    }
  
    @Override
    public void run()
    {
        line.getLine();
    }
}
  
class GFG
{
    public static void main(String[] args)
    {
    	SynchronizationMethod obj = new SynchronizationMethod();
  
        // we are creating two threads which share
        // same Object.
        Train train1 = new Train(obj);
        Train train2 = new Train(obj);
  
        // both threads start executing .
        train1.start();
        train2.start();
    }
}