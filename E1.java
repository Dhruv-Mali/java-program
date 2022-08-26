public class E1 {
    public static void main(String[] args) {
    try
    {
        int arr[]={1,2,3};
        arr[4] = 3;
    }
    catch(ArithmeticException ae)
    {
        System.out.println("Divide by zero :" + ae);
    }
    catch(ArrayIndexOutOfBoundsException e)
    {
        System.out.println("Array index out of bound:" + e);
    }
}
}
 