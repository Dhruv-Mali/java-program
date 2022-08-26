class large
{
    public static void main(String args[])
    {
       int a=10,b=20,c=30;

        System.out.println("first number is :"+a);
        System.out.println("second number is :"+b);
        System.out.println("third number is :"+c);

        if(a>b && a>c){
        System.out.print("a is the largest with value "+a);
        }
        else if(b>a && b>c)
        {    
        System.out.println("b is the largest with value "+b);
        }
        else{
        System.out.println("c is the largest with value "+c);
        }
    }
}
