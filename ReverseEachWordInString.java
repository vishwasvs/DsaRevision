public class ReverseEachWordInString {
    public static void main(String[] args) {
        String s = "rama is good";

        String res = sub(s);
        System.out.println(res);
    }

    public static String sub(String s)
    {
        String rev = "";
        s = s.trim();
        char[] arr = s.toCharArray();

        for(int i=0;i<arr.length;i++)
        {
            int f = i;
            while(i<arr.length && (arr[i]!= ' '))
            {
                i++;
            }

            for(int j=i-1;j>=f;j--)
            {
                rev = rev+arr[j];
            }
            if(i<arr.length)
                rev = rev+arr[i];
        }

    return rev;

    }
}
