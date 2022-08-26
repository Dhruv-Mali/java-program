public class E4 {
    static void demo()
    {
        try
        {
            throw new ArithmeticException("demo");
        }
        catch(ArithmeticException a)
        {
            System.out.println("Exception Caught.");
        }
    }
    public static void main(String[] args){
        demo();
    }
}
