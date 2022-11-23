package Programmers;
//  콜라츠 추측
//1-1. 입력된 수가 짝수라면 2로 나눕니다.
//1-2. 입력된 수가 홀수라면 3을 곱하고 1을 더합니다.
//2. 결과로 나온 수에 같은 작업을 1이 될 때까지 반복합니다.
//3.작업을 500번 반복할 때까지 1이 되지 않는다면 –1을 반환합니다
//예를 들어, 주어진 수가 6이라면 6 → 3 → 10 → 5 → 16 → 8 → 4 → 2 → 1 이 되어 총 8번 만에 1이 됩니다.

public class ColatzGuess {
    public int solution(int num) {
        int answer = 0;
        int a = num;
        while(a !=1 && answer != 500) {
            if (a % 2 == 0) {
                a += a / 2;
            } else if (a % 2 == 1) {
                a = a * 3 + 1;
            }
            answer++;
        }

        return answer;
    }

    public static void main(String[] args) {
        ColatzGuess colatzGuess = new ColatzGuess();
        System.out.println(colatzGuess.solution(6));
    }
}
