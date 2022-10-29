package Programmers.같은숫자는싫어;

import java.util.Stack;

public class Solution {
    public int[] solution(int []arr) {        
        Stack<Integer> stack = new Stack<>();

        for (int n : arr) {
            if (stack.isEmpty() || stack.peek() != n) {
                stack.add(n);
            }
        }
        int[] answer = new int[stack.size()];
        int index = 0;
        for (int n : stack) {
            answer[index++] = n;
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int arr[] ={1,2,3,4,4,4};
        System.out.println(solution.solution(arr));
    }
}