package Programmers.과일장수;
import java.util.Arrays;

class Solution {
    public int solution(int k, int m, int[] score) {
        Arrays.sort(score);
        int box = score.length % m;
        int answer = 0;
        for(int i = box; i < score.length; i = i + m) {
            answer += score[i] * m;
        }
        return answer;
    }
    public static void main(String[] args) {
        Solution so = new Solution();
        int[] sc1 = {1, 2, 3, 1, 2, 3, 1};
        int[] sc2 = {4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2};
        System.out.println(so.solution(3, 4, sc1));
        System.out.println(so.solution(4, 3, sc2));
    }
}