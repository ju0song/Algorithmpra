package Programmers.소수찾기;

class Solution {
    public int solution(int n) {
        int answer = 0;
        int[] ch = new int[n + 1];
        for (int i = 2; i <= n; i++) {
            if (ch[i] == 0) {
                answer++; //소수라는 이야기니까 카운트해줌
                for (int j = i; j <= n; j = j + i) ch[j] = 1; //i의 배수를 제거하기

            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(10));
        System.out.println(solution.solution(5));
    }
}