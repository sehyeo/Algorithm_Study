import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        Arrays.fill(answer, -1);
        
        for (int index=0; index < queries.length; index++) {
            int[] query = queries[index];
            
            int s = query[0];
            int e = query[1];
            int k = query[2];
            
            for (int i=s; i<=e; i++) {
                if (k < arr[i]) {
                    if (answer[index] == -1) {
                        answer[index] = arr[i];
                } else {
                    answer[index] = Math.min(answer[index], arr[i]);
                }
                }
            }
        }
    
        return answer;
    }
}