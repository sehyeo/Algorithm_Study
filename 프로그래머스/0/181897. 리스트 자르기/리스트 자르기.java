import java.util.*;

class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        ArrayList<Integer> list = new ArrayList<>();
        if (n == 1) {
            for (int i = 0; i <= slicer[1]; i++) {
                list.add(num_list[i]);
            }
        } else if (n == 2) {
            for (int i = slicer[0]; i < num_list.length; i++) {
                list.add(num_list[i]);
            }
        } else if (n == 3) {
            for (int i = slicer[0]; i <= slicer[1]; i++) {
                list.add(num_list[i]);
            }
        } else {
            for (int i = slicer[0]; i <= slicer[1]; i += slicer[2]) {
                list.add(num_list[i]);
            }
        }
        
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}