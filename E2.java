public class E2 {
    public static void main(String[] args) {
    try
    {
        int arr[] = {0,1,2,3};
        try {
            arr[4] = arr[3]/arr[1];
        }
        catch(ArithmeticException e)
        {
            System.out.println("Dividing by zero :" +e);
        }
    }
    catch(ArrayIndexOutOfBoundsException e )
    {
        System.out.println("Array out of bounds : "+e);
    }

    System.out.println("out of try..catch bolock. ");
    System.out.println("habibi come to parul.");
    }
}
