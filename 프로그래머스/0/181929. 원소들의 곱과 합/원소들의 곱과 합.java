class Solution {
    public int solution(int[] num_list) {
        int a = 1;
        int sum = 0;
        int m = 1;
        
        for (int i=0; i<num_list.length; i++) {
            a *= num_list[i];
            sum += num_list[i];
        }
        m = sum * sum;
        return (a < m) ? 1 : 0;
    }
}