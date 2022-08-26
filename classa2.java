class classa2
{
    public static void main(String args[])
    {
        int a[][] = {{1,2,3},{3,4,5}};

        for(int i=0;i<2;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }
    }
}