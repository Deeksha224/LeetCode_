// Last updated: 8/6/2025, 11:06:51 AM
class Solution {
    public String interpret(String command) {
        command = command.replace("()" , "o");
        command = command.replace("(al)", "al");
        return command;
    }
}