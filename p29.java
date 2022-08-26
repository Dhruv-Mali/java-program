abstract class p29
{
    abstract void run();   
}
class bike extends p29
{
    void run()
    {
        System.out.println("bike is running...");
    }

    public static void main(String args[])
    {
       bike b = new bike();
       b. run();
    }

}