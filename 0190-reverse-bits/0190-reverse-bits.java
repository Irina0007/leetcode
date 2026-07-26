class Solution {
    public int reverseBits(int n) {
        int res=0;
        for(int i=0;i<32;i++){
            int a= (n>>i)&1;
            res+=a<<(31-i);
        }
        return res;
        
    }
}