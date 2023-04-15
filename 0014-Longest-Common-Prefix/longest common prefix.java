class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder();
        int l= strs[0].length();
        int strLength = strs.length;
        
        for(int i=0; i < l ; i++)
        {
             char c = strs[0].charAt(i);
             for(int j=0; j < strLength ; j++)
             {
                if( ((strs[j].length()) < i+1) || c != strs[j].charAt(i))
                {
                    return sb.toString();
                }
             }
            sb.append(c);
        }

        return sb.toString();
    }
}
