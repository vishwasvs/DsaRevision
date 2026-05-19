import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

public class bottom {
    public static void main(String[] args) {
         TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.left= new TreeNode(4);
        root.left.right = new TreeNode(5);

        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        System.out.println(sub(root));
    }

    public static List<Integer> sub(TreeNode root)
    {
        Map<Integer,Integer> map = new TreeMap<>();
        Queue<Object[]> q= new LinkedList<>();
        q.add(new Object[]{0,root});
        List<Integer> list = new ArrayList<>();
        if(root==null) return list;

        while(!q.isEmpty())
        {
            Object[] node = q.poll();
            int col = (int) node[0];
            TreeNode val = (TreeNode) node[1];

            if(map.containsKey(col))
            {
                map.put(col, val.data);
            }
            map.putIfAbsent(col, val.data);

            if(val.left!=null)
            {
                q.offer(new Object[]{col-1,val.left});
            }
            if(val.right!=null)
            {
                q.offer(new Object[]{col+1,val.right});
            }
        }

        for(int li : map.values())
        {
            list.add(li);
        }

    return list;
    }
}
