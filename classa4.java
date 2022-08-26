class classa4
 {
    public static void main(String args[])
    {
        int a[][] = {{7,8,9},{8,5,6}};
        int b[][] = {{4,5,6},{7,8,9}};

        int c[][] = new int[2][3];

        for(int i=0;i<2;i++)

        for (int j=0;j<3;j++)
        {
            c[i][j]= a[i][j]-b[i][j];
            System.out.print(c[i][j]+"\t");
        }
        System.out.println();
    } 
}
