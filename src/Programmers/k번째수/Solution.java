package src.Programmers.k번째수;

class Solution {
    public long solution(long n) {
        long answer;
        if (Math.sqrt(n) % 1 == 0) {
            answer = (long) (Math.pow(Math.sqrt(n) + 1, 2));
        } else {
            answer = -1;
        }
        return answer;
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(121));
    }
}