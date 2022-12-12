package Programmers.핸드폰번호가리기;

class Solution {
    public String solution(String phone_number) {
        char[] chararry = phone_number.toCharArray();
        System.out.println(phone_number);
        for (int i = 0; i < chararry.length; i++) {
            if (chararry.length - 4 > i) {
                chararry[i] = '*';
            }
        }
        String answer = String.valueOf(chararry);
        return answer;
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution("01033334444"));
        System.out.println(solution.solution("01025971903"));

    }
}