import java.util.*;

class Solution {
    public int[] solution(int start, int end_num) {
        List<Integer> result = new ArrayList<>();
        for(int i=start; i>=end_num; i--){
            result.add(i);
        }
        return result.stream()
                .mapToInt(i -> i)
                .toArray();
    }
}