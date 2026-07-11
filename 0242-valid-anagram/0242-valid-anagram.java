class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> map=new HashMap<>();
        if(s.length()!=t.length()){
            return false;
        }
        else{
            for(int i=0;i<s.length();i++){
                char a=s.charAt(i);
                map.put(a,map.getOrDefault(a,0)+1);
            }
            for (int j=0;j<t.length();j++){
                char b=t.charAt(j);
                if(map.containsKey(b)&&map.get(b)>0){
                    map.put(b,map.get(b)-1);
                }
                else {
                    return false;
                }
            }
        }
        return true;
        
    }
}