public class Pascal {
    public static void main(String[] args) 
    {
        int r= 4;
        int c=2;

        int res = sub(r,c);
        System.out.println(res);
    }

    public static int sub(int r,int c)
    {
        int[][] p = new int[r+1][r+1];

        for(int i=1;i<=r;i++)
        {
            for(int j=1;j<=i;j++)
            {
                if(j==0 || j==i)
                {
                    p[i][j]=1;
                }
               else {
                    p[i][j] = p[i-1][j-1] + p[i-1][j];
                }
            }
        }

       return p[r][c];
    }
}
