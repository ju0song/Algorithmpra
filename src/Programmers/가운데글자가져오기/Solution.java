package Programmers.가운데글자가져오기;

class Solution {
    public String solution(String s) {
        int a = s.length();
        String answer = "";

        if(a % 2 != 0){
            a/=2;
            answer = s.substring(a, a+1);
        }else{
            a/=2;
            answer = s.substring(a-1, a+1);;
        }
        return answer;
    }



    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution("abcde"));
    }
}