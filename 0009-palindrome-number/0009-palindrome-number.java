class Solution {
    public boolean isPalindrome(int x) {
        String a=String.valueOf(x);
        String reverse=new StringBuilder(a).reverse().toString();
        if(reverse.equals(a)){
            return true;
        }
        else{
            return false;
        }
    }
}