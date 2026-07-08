class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> mm=new HashMap<>();
        HashMap<Character,Integer> rm=new HashMap<>();
        for (int i = 0; i < magazine.length(); i++) {
            char c = magazine.charAt(i);
            mm.put(c,mm.getOrDefault(c,0)+1);
         }
        for (int i = 0; i < ransomNote.length(); i++) {
            char c = ransomNote.charAt(i);
            rm.put(c,rm.getOrDefault(c,0)+1);
            if(!mm.containsKey(c)){
                return false;
            }
            else if(mm.get(c)<rm.get(c)){
                return false;
            }
        }
        return true;
    }
}