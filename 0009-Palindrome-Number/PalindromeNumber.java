class Solution {
    public boolean isPalindrome(int x) {
        int new_x=reverse(x);
        if(x<0){
            return false;
        }
        if(x==new_x){
            return true;
        }
        else{
            return false;
        }
        
       
        
        
    }
    static  int reverse(int x){
        int rev=0;

        while(x!=0){
            int digit=x%10;
            rev = rev *10 +digit;

            x/=10;

        }
        return rev;
    }
}
