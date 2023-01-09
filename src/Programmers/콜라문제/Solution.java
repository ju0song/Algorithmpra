package Programmers.콜라문제;

class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        while (n >= a) {
            int aa = (n / a) * b;
            int sa = n % a;

            answer += (n / a) * b;
            n = aa + sa;
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(2,1,20));
    }
    }
