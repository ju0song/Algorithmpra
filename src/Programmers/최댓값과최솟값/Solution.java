package Programmers.최댓값과최솟값;

class Solution {
    public String solution(String s) {
        String answer;
        String[] arr = s.split(" ");
        int[] nums = new int[arr.length];
        for(int i=0; i<arr.length; i++) nums[i] = Integer.parseInt(arr[i]);
        int min = nums[0];
        int max = nums[0];
        for (int num : nums) {
            if (min > num) {
                min = num;
            }
            if (max < num) {
                max = num;
            }
        }
        answer = min +" "+ max;
        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution("1 2 3 4"));
    }
}