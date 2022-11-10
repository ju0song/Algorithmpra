package src.Programmers.내림차순으로배치하기;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

class Solution {
    public long solution(long n) {

        String[] str =String.valueOf(n).split("");
        Arrays.sort(str);
        StringBuilder stringBuilder = new StringBuilder();
        for (String s : str) {
            stringBuilder.append(s);
        }
        stringBuilder.reverse();
        long answer =Long.parseLong(stringBuilder.toString());

        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(118372));
    }
}