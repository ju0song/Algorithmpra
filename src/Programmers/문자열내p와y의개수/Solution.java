package Programmers.문자열내p와y의개수;

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int count =0;
        int count2 =0;
        String[] a = s.split("");
        for (int i = 0; i < a.length ; i++) {
            if(a[i].equals("p") || a[i].equals("P")){
                count++;
            }else if(a[i].equals("Y") || a[i].equals("y")){
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