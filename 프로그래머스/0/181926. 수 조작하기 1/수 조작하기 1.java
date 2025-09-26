class Solution {
    public int solution(int n, String control) {
        int answer = n;
        String[] c = control.split("");
                
        for (int i=0; i<c.length; i++) {
            if (c[i].equals("w")) {
                answer += 1;
            } else if (c[i].equals("s")) {
                answer -= 1;
            } else if (c[i].equals("d")) {
                answer += 10;
            } else if (c[i].equals("a")) {
                answer -= 10;
            }
        }
        
        return answer;
    }
}