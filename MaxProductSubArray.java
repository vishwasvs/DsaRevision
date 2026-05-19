public class MaxProductSubArray {
    public static void main(String[] args) {
        int[] nums = {4,5,0,3,1};

        int res = sub(4,1,nums);
        System.out.println(res);
    }

    public static int sub(int id,int prod,int[] nums)
    {
        int res = nums[0];
        int maxProd = nums[0];
        int minProd = nums[0];


         for (int i = 1; i < nums.length; i++) {
            int curr = nums[i];

            if (curr < 0) {
                int temp = maxProd;
                maxProd = minProd;
                minProd = temp;
            }

             maxProd = Math.max(curr, curr*maxProd);
             minProd = Math.min(minProd*curr, curr);

            res = Math.max(maxProd,res);
        }
        return res;
    }
}
