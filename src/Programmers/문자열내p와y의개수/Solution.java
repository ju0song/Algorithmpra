package Programmers.문자열내p와y의개수;

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int count =0;
        int count2 =0;
        String[] a = s.split("");
        for (String value : a) {
            if (value.equals("p") || value.equals("P")) {
                count++;
            } else if (value.equals("Y") || value.equals("y")) {
                count2++;
            }
        }
       if(count == count2){
           return answer;
       }else {
           return false;
       }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution("pPoooyY"));
        System.out.println(solution.solution("Pyy"));
    }
}