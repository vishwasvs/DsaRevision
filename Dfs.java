import java.util.*;


public class Dfs {
    public static void main(String[] args) {
         int V = 8;

         ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for(int i=0;i<=V;i++)
        {
             adj.add(new ArrayList<>());
        }

        adj.get(1).add(2);
        adj.get(1).add(3);
        
        adj.get(2).add(1);
        adj.get(2).add(4);
        adj.get(2).add(5);

        adj.get(3).add(1);
        adj.get(3).add(6);
        adj.get(3).add(7);

        adj.get(4).add(2);
        adj.get(5).add(2);
        adj.get(6).add(3);
        adj.get(7).add(3);

        int[] vis = new int[V+1];
        Arrays.fill(vis, -1);
        List<Integer> res = new ArrayList<>();

        sub(1,V,adj,vis,res);

        System.out.print(res);
    }

    public static void sub(int node,int V,ArrayList<ArrayList<Integer>> adj,int[] vis,List<Integer> res)
    {
        vis[node]=1;
        res.add(node);

        for(int i : adj.get(node))
        {
            if(vis[i]==-1)
            {
                sub(i,V,adj,vis,res);
            }
        }
    
    }
}
