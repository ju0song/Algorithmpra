package Programmers.문자열을정수로바꾸기;

class Solution {
  public int solution(String s) {

      int answer = Integer.parseInt(s);
      return answer;
  }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution("-1234"));
    }
}