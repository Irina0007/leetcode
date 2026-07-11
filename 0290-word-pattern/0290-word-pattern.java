class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words=s.split(" ");
        HashMap<String,Character> a=new HashMap<>();
        HashMap<Character,String> b=new HashMap<>();

        if(words.length!=pattern.length()){
            return false;
        }
        else{
            for(int i=0;i<words.length;i++){
                String c=words[i];
                char d=pattern.charAt(i);
                if (a.containsKey(c)&&a.get(c)!=d){
                    return false;
                }
                else if(b.containsKey(d)&&!b.get(d).equals(c)){
                    return false;
                }
                a.put(c,d);
                b.put(d,c);

            }
        }
        return true;

    }
}