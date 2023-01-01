package Programmers.짝지어제거하기;

import java.util.Stack;

class Solution
{
    public int solution(String s)
    {
        String[] sp = s.split("");
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < sp.length; i++) {
            if(stack.isEmpty()){
                stack.push(sp[i]);
            }else {
                if (stack.peek().equals(sp[i])) {
                    stack.pop();
                } else {
                    stack.push(sp[i]);
                }
            }
        }



        if(stack.isEmpty()) return 1;
        else return 0;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution("baabaa"));
        System.out.println(solution.solution("cdcd"));
    }
}