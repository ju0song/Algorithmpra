package Programmers.Ex;

import java.util.ArrayList;

//자연수 n이 매개변수로 주어집니다. n을 x로 나눈 나머지가 1이 되도록 하는 가장 작은 자연수 x를 return 하도록 solution 함수를 완성해주세요. 답이 항상 존재함은 증명될 수 있습니다.
//입출력 예 #1
//        10을 3으로 나눈 나머지가 1이고, 3보다 작은 자연수 중에서 문제의 조건을 만족하는 수가 없으므로, 3을 return 해야 합니다.
//        입출력 예 #2
//        12를 11로 나눈 나머지가 1이고, 11보다 작은 자연수 중에서 문제의 조건을 만족하는 수가 없으므로, 11을 return 해야 합니다.
    class Solution {
        public String solution(int n) {
            String answer = "";
            String su="수";
            String bak = "박";

            for(int i=1; i <= n; i++){
                if(i%2 == 1){
                    answer+=su;
                }else{
                    answer+=bak;
                }

            }
            return answer;
        }
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(3));
        System.out.println(solution.solution(4));
    }
}