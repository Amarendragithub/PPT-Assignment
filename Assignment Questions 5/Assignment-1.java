class Example1
{
    public static void main(String arg[])
    {
   
        int n = 3, m = 3;
        int array[]=new int[100];
     
        
        int grid[][] = {{1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9}};
     
       
        int i, j, k = 0;
        for (i = 0; i < n; i++)
        {
            for (j = 0; j < m; j++)
            {
                k = i * m + j;
                array[k] = grid[i][j];
                k++;
            }
        }
     
        
        for (i = 0; i < n; i++)
        {
            for (j = 0; j < m; j++)
                System.out.print((array[i * m + j])+" ");
            System.out.print("\n");
        }
     
    }
}