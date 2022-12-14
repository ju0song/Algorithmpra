package Programmers.JadenCase문자열만들기;

import java.util.Locale;

class Solution {
    public String solution(String s) {
        String answer = "";
        String[] sp = s.toLowerCase().split(" ");
        StringBuffer sb = new StringBuffer();
        for (String s1 : sp) {
          String ss =s1;
         sb.append(ss.substring(0, 1).toUpperCase(Locale.ROOT));
         sb.append(ss.substring(1, ss.length()).toLowerCase());
         sb.append(" ");
        }
        answer += sb;
        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution("3people unFollowed me"));
    }
}