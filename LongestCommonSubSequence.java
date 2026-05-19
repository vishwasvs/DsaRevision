public class LongestCommonSubSequence {
    public static void main(String[] args) {
        String s1 = "acb";
        String s2 = "cdb";

        String res = sub(s1.length()-1,s2.length()-1,s1,s2);
        System.out.println(res);
        System.out.println(res.length());
    }

    public static String sub(int l,int r,String s1,String s2)
    {
        if(l<0 || r<0) return "";

        if(s1.charAt(l)==s2.charAt(r))
            return sub(l-1,r-1,s1,s2) + s1.charAt(l);

        String left = sub(l-1,r,s1,s2);
        String right = sub(l,r-1,s1,s2);

        return s1.length()>s2.length()?left:right;
    }
}