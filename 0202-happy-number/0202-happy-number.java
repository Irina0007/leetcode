class Solution {
    public boolean isHappy(int n) {
        Set<Integer> set=new HashSet<>();
        while(!set.contains(n)){
            set.add(n);
            n=sum(n);
            if(n==1){
                return true;
            }

        }
        return false;
        
    }
    private int sum(int n){
        int output=0;
        while(n>0){
            int a=n%10;
            output=output+a*a;
            n=n/10;
        }
    return output;
    }
}