class Solution {
    public String solution(String my_string, int[][] queries) {
        char[] arr = my_string.toCharArray();
        
        for (int[] query: queries) {
            int s = query[0];
            int e = query[1];
            
            while (s < e) {
                char tmp = arr[s];
                arr[s] = arr[e];
                arr[e] = tmp;
                
                s++;
                e--;
            }
        }
        
        return new String(arr);
    }
}