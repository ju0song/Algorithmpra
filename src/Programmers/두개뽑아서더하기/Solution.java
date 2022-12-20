package Programmers.두개뽑아서더하기;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Solution {
    public int[] solution(int[] numbers) {
        int sum ;
        List<Integer> list = new ArrayList<Integer>();
        for(int i=0; i<numbers.length; i++) {
            for(int j=i+1; j<numbers.length; j++) {
                if(!list.contains(sum=numbers[i]+numbers[j]))
                    list.add(sum);
            }
        }
        Collections.sort(list);
        int[] answer = new int [list.size()];
        for(int i=0; i<list.size(); i++)
            answer[i]=list.get(i);
        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr = {2, 1, 3, 4, 1};
        System.out.println(Arrays.toString(solution.solution(arr)));
    }
}
