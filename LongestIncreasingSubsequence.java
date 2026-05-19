public class LongestIncreasingSubsequence {
    public static void main(String[] args) {
        int[] arr = {0,1,3,2,3};

        sub(0,0,arr);
    }

    public static int sub(int id,int l,int[] arr)
    {  
        if(id==arr.length-1)
        {
           return l;
        }


        int notake = sub(id+1,l,arr);

        int take = 0;
        if(arr[id]>arr[id-1])
            take = sub(id+1,l+1,arr);

        return Math.max(take, notake);
    }
}
