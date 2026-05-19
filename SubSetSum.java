public class SubSetSum {
    public static void main(String[] args) {
        int[] arr = {1,2,7,3};
        int target = 6;

        System.out.println(sub(arr.length-1,target,arr));
    }

    public static boolean sub(int id,int target,int[] arr)
    {
        if(target==0) return true;
        if(id == 0) return arr[0] == target;


        boolean nottake = sub(id-1,target,arr);

        boolean take = false;
        if(target>=arr[id])
        {
            take = sub(id-1,target-arr[id],arr);
        }
         

        return (nottake || take);
    }
}
