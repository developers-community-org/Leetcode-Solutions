class Solution {
    public int partitionString(String s) {
        HashSet<Character> h=new HashSet<>();
        int res=1;
        for(char c:s.toCharArray()){
            if(!h.contains(c)){
                h.add(c);
            }
            else{
                res++;
                h.clear();
                h.add(c);
            }
        }
        return res;
    }
}
