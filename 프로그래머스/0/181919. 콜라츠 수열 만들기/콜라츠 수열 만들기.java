import java.util.*;

class Solution {
    public List solution(int n) {
        List<Integer> answer = new ArrayList<Integer>();
        answer.add(n);
        
        while (n != 1) {
            if (n % 2 == 0) {
                n /= 2;
                answer.add(n);
            } else {
                n = n * 3 + 1;
                answer.add(n);
            }
        }
        
        return answer;
    }
}