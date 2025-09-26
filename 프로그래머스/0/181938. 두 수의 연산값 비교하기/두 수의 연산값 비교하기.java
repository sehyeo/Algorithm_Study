class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        int c = 2 * a * b;
        
        String ab = String.valueOf(a) + String.valueOf(b);
        String ba = String.valueOf(b) + String.valueOf(a);
        
        if (Integer.parseInt(ab) > Integer.parseInt(ba)) {
            if (Integer.parseInt(ab) > c) {
                answer = Integer.parseInt(ab);
            } else if (Integer.parseInt(ab) == c) {
                answer = Integer.parseInt(ab);
            } else {
                answer = c;
            }
        } else {
            if (Integer.parseInt(ab) > c) {
                answer = Integer.parseInt(ab);
            } else if (Integer.parseInt(ab) == c) {
                answer = Integer.parseInt(ab);
            } else {
                answer = c;
            }
        }
        
        return answer;
    }
}