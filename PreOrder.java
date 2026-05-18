import java.util.*;

public class PreOrder {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(4);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(2);

        List<Integer> list = new ArrayList<>();
        List<Integer> res = sub(root,list);
        System.out.println(res);
    }

    public static List<Integer> sub(TreeNode root,List<Integer> list)
    {
        if(root==null) return list;

        list.add(root.data);
        sub(root.left,list);
        sub(root.right,list);

        return list;
    }
}
