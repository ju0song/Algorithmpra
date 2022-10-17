package Pratice.String;

import java.util.Scanner;

//문장속 단어
//한개의 문장이 주어지면 그 문장 속에서 가장 긴 단어를 출력하는 프로그램
//ex) it is time to study
//답: study
public class WordinSentence03 {
    public static void main(String[] args) {
        WordinSentence03 T = new WordinSentence03();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        System.out.print(T.solution(str));
    }

    public String solution(String str) {
        String answer = "";
        int m = Integer.MIN_VALUE;
        String[] s = str.split(" ");
        for (String x : s) {
            int len = x.length();
            if (len > m) {
                m = len;
                answer = x;
            }
        }
        return answer;
    }
}

