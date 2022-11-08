package src.Programmers.숫자문자열과영단어;

//https://school.programmers.co.kr/learn/courses/30/lessons/81301
//다음은 숫자의 일부 자릿수를 영단어로 바꾸는 예시입니다.
//1478 → "one4seveneight"
//234567 → "23four5six7"
//10203 → "1zerotwozero3"

class Solution {
    public int solution(String s) {
        int answer = 0;
        String[] arr ={"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String[] number = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        for(int i =0;i<10;i++){
            s = s.replace(arr[i],number[i]);
        }
        answer = Integer.parseInt(s);
        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution("23four5six7"));
    }
}





