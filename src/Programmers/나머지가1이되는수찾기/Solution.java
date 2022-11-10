package src.Programmers.나머지가1이되는수찾기;
//입출력 예 #1
//10을 3으로 나눈 나머지가 1이고, 3보다 작은 자연수 중에서 문제의 조건을 만족하는 수가 없으므로, 3을 return 해야 합니다.
//입출력 예 #2
//12를 11로 나눈 나머지가 1이고, 11보다 작은 자연수 중에서 문제의 조건을 만족하는 수가 없으므로, 11을 return 해야 합니다.
class Solution {
    public int solution(int n) {
        int answer = 0;

        for (int i=2; i<n; i++){
            if(n%i == 1){
                answer = i;
                break;
            }
        }
        return answer;
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(10));
        System.out.println(solution.solution(12));
    }
}