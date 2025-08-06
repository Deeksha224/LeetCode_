// Last updated: 8/6/2025, 11:11:42 AM
class Solution {
    public String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
        String[] directory = path.split("/");
        for (String dir : directory){
            if (dir.equals(".") || dir.isEmpty()){
                continue;
            }
            else if (dir.equals("..")){
                if (!stack.isEmpty()){
                    stack.pop();
                }
            }
            else{
                stack.push(dir);
            }
        }
        return "/" + String.join("/",stack);
    }
}