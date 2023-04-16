class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int res[]=new int[2];
        int max=0;
        for(int i=0;i<mat.length;i++){
            int c=0;
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]==1)
                    c++;
            }
            if(max<c){
                max=c;
                res[0]=i;
                res[1]=max;
            }
        }
        return res;
    }
}
