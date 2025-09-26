class Solution {
    public int[] solution(int[] num_list) {
        int arrLength = num_list.length;
        
        int[] answer = new int[arrLength + 1];
        int finalNum = num_list[arrLength - 1];
        int beforeNum = num_list[arrLength - 2];
        
        int last = 0;
        
        last = finalNum > beforeNum ? finalNum - beforeNum : 2 * finalNum;
        
        for (int i=0; i< arrLength; i++) {
            answer[i] = num_list[i];
        }
        answer[answer.length - 1] = last;
        
        return answer;
    }
}