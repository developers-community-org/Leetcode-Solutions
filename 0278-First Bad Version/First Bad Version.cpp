// The API isBadVersion is defined for you.
// bool isBadVersion(int version);

class Solution {
public:
    int firstBadVersion(int n) {
        int i = n/2;
        int z,answer;
        if(isBadVersion(i) == true){
            z = i-1;
            answer = i;
            while(isBadVersion(z)){
                answer = z;
                z = z - 1;
            }
            
        }
        else{
            for(int k = i+1;k<=n;k++){
                if(isBadVersion(k) == true){
                    answer = k;
                    break;
                }
            }
            
            
            
        }
        
        
        
        return answer;
    }
};
