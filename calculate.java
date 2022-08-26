class demo
{
    void Area(int l)
    {
        System.out.println("area of square is :" + 1*1);
    }
    void area(int l,int b)
    {
        System.out.println("area of rectangle is :" + 1*b);
    }
    void area(double r)
    {
        System.out.println("area of circle is :" +3.14*r*r);
    }
}

class calculate
{
    public static void main(String args[])
    {
        demo d1 = new demo();
        demo d2 = new demo();
        demo d3 = new demo();

        d1.area(10);
        d2.area(12,15);
        d3.area(14.5);
    }

     
}
