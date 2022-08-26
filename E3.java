public class E3 {
    public static void main(String[] args) {
        int a[] = new int[2];
        try
        {
            System.out.println("Access Element Three :"+a[3]);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Exception Thrown :"+e);
        }
        finally
        {
            a[0]=10;
            System.out.println("first element is : "+a[0]);
            System.out.println("finally block will be executed everytime.");
        }
        System.out.println("We are out from all bolcks..");
    }
}
