import java.util.*;

public class TopologicalSort {
    public static void main(String[] args) {
        int V=6;
        ArrayList < ArrayList < Integer >> adj = new ArrayList < > ();

        for (int i = 0; i < 6; i++) {
            adj.add(new ArrayList < > ());
        }

        adj.get(5).add(2);
        adj.get(5).add(0);
        adj.get(4).add(0);
        adj.get(4).add(1);
        adj.get(3).add(1);
        adj.get(2).add(3);

        int[] vis = new int[V+1];
        Arrays.fill(vis,-1);
        int[] indegree = new int[V+1];

        for(int i=0;i<V;i++)
        {
            for(Integer it : adj.get(i))
            {
                indegree[it]++;
            }
        }
        List<Integer> res = new ArrayList<>();
       
        sub(6,adj,vis,indegree,res);
        System.out.println(res);
        
    }

    public static void sub(int V,ArrayList < ArrayList < Integer >> adj,int[] vis,int[] indegree,List<Integer> res)
    {
        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<V;i++)
        {
            if(indegree[i]==0)
                q.offer(i);
        }

       while(!q.isEmpty())
       {
            int node = q.poll();
            vis[node]=1;
            res.add(node);

            for(Integer it : adj.get(node))
            {   
                indegree[it]--;
                    
                if(indegree[it]==0)
                {
                    q.offer(it);
                }
            }

       }

    }
}
