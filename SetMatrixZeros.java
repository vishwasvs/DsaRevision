public class SetMatrixZeros {
    public static void main(String[] args) {
        int[][] matrix = {{1,1,1},{1,0,1},{1,1,1}};

        int[][] res = sub(matrix);

        for(int i=0;i<res.length;i++)
        {
            for(int j=0;j<res.length;j++)
            {
                System.out.print(res[i][j]+" ");
            }
            System.out.println();
        }

    }

    // public static int[][] sub(int[][] matrix)
    // {
    //     int m =matrix.length;
    //     int n = matrix.length;


    //     for(int i=0;i<m;i++)
    //     {
    //         for(int j=0;j<n;j++)
    //         {
    //             if(matrix[i][j]==0)
    //             {
    //                 for(int k=0;k<n;k++)
    //                 {
    //                     matrix[i][k]=0;
    //                 }
    //                 for(int l=0;l<m;l++)
    //                 {
    //                     matrix[l][j]=0;
    //                 }
    //             }
    //             break;
    //         }
    //     }
    //     return matrix;

    // }
    
    public static int[][] sub(int[][] matrix)
    {
        int m = matrix.length;
        int n = matrix[0].length;

        boolean[] row = new boolean[m];
        boolean[] col = new boolean[n];

        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(matrix[i][j]==0)
                {
                    row[i]= true;
                    col[j] = true;
                }
            }
        }

        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(row[i]==true || col[j]==true)
                    matrix[i][j]=0;
            }
        }
         return matrix;
    }

}