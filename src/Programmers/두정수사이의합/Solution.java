package src.Programmers.두정수사이의합;

class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        if(a <b) {
            for (int A = a; A < b + 1; A++) {
                answer += A;
            }
        }else if(b<a){
            for (int B = b; B < a + 1; B++) {
                answer += B;
            }
        }else {
            answer +=a;
        }
        return answer;
    }

    public static void main(String[] args) {
       Solution solution = new Solution();
        System.out.println(solution.solution(3,5));
        System.out.println(solution.solution(5,3));
    }
}