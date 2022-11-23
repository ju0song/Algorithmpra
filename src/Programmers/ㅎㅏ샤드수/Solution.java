package Algorithmpra.Programmers.ㅎㅏ샤드수;

class Solution {
    public boolean solution(int x) {
        int n = x;
        int result = 0;

        while(n > 10){
            result += n % 10;
            n /= 10;
        }
        result += n;
        return x % result == 0;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(10));
    }
}