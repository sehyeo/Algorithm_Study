class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = "";
        
        String temp = my_string.substring(s, e + 1);
        String reverse = "";
        for (int i = temp.length() - 1; i >= 0; i--) {
            reverse += temp.charAt(i);
        }
        answer = my_string.replace(temp, reverse);
        
        return answer;
    }
}