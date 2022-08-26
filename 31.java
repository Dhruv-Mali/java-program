class Person
{
    int id;
    String name;
    Person(int id,String name)
    {
        this.id=id;
        this.name=name;
    }
}
class emp extends Person
{
    int salary;
    emp(int id,String name,int salary)
    {
        super(id,name);
        this.salary = salary;
    }
    void display()
    {
        System.out.println(id+ " name " +salary);
    }
}
class p31
{
    public static void main(String args[])
    {
        emp e1 = new emp(1,"abc",3500000);
        e1.display();
    }
}
