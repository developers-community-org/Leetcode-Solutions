class Solution {
    public int findValidSplit(int[] nums) {
        List<List<Integer>> ls=new ArrayList<>();//Used to store all the prime factors of each array element
        HashMap<Integer,Integer> h=new HashMap<>();//Used to store all the prime factors along with its last occurance
        for(int i=0;i<nums.length;i++){
            ls.add(new ArrayList<>());
            storeprime(ls.get(i),h,nums[i],i);
        }
        int last=0;
        for(int i=0;i<nums.length-1;i++){
            for(int j:ls.get(i)){
                last=Math.max(last,h.get(j));//Calculating the last occurance of that particular prime factor
            }
            if(i==last)
                return i;
        }
        return -1;
    }
    public void storeprime(List<Integer> ls,HashMap<Integer,Integer> h,int n,int index){//This function finds and stores the prime factors
        for(int i=2;i*i<=n;i++){
            while(n%i==0){
                h.put(i,index);
                ls.add(i);
                n/=i;
            }
        }
        if(n>1){
            ls.add(n);
            h.put(n,index);
        }
    }
}
