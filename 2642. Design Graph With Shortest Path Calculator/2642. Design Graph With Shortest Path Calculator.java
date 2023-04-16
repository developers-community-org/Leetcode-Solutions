class Graph {

    int n;
    List<int[]>[] adj;
    public Graph(int n, int[][] edges) {
        this.n=n;
        this.adj=new ArrayList[n];
        for(int i=0;i<n;i++)
            adj[i]=new ArrayList<>();
        for(int i=0;i<edges.length;i++){
            adj[edges[i][0]].add(new int[]{edges[i][1],edges[i][2]});
        }
    }
    
    public void addEdge(int[] edge) {
        adj[edge[0]].add(new int[]{edge[1],edge[2]});
    }
    
    public int shortestPath(int node1, int node2) {
        PriorityQueue<int[]> pq=new PriorityQueue<>((x,y) -> x[1]-y[1]);
        int d[]=new int[n];
        Arrays.fill(d,Integer.MAX_VALUE);
        d[node1]=0;
        pq.add(new int[] {node1,0});
        while(!pq.isEmpty()){
            int [] curr=pq.poll();
            int nd=curr[0];
            int c=curr[1];
            if(c>d[nd])
                continue;
            for(int adjl[]:adj[nd]){
                int nn=adjl[0];
                if(c+adjl[1]<d[nn]){
                    d[nn]=c+adjl[1];
                    pq.add(new int[] {nn,c+adjl[1]});
                }
            }
        }
        return d[node2]==Integer.MAX_VALUE ? -1 : d[node2];
    }
}

/**
 * Your Graph object will be instantiated and called as such:
 * Graph obj = new Graph(n, edges);
 * obj.addEdge(edge);
 * int param_2 = obj.shortestPath(node1,node2);
 */
