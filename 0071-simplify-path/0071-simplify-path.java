class Solution {
    public String simplifyPath(String path) {
        Stack<String> stack=new Stack<>();
        String[] str=path.split("/");
        
        for(String st:str){
            if(st.equals("..")){
                if(!stack.isEmpty()) stack.pop();
            }
            else if(!st.equals("")&&!st.equals(".")){
                stack.push(st);
            }
        }
        return "/"+String.join("/",stack);
        
    }
}