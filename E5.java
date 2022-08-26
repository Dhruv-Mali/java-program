public class E5 {
    static void display() throws ArithmeticException
    {
        System.out.println("Inside function.");
        throw new ArithmeticException("demo");
    }
    public static void main(String[] args) {
        try
        {
            display();
        }
        catch(ArithmeticException a)
        {
            System.out.println("Exception caught."+a);
        }
    }
}
