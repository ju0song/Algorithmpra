package String;

import java.util.Scanner;

//문장속 단어
//한개의 문장이 주어지면 그 문장 속에서 가장 긴 단어를 출력하는 프로그램
//ex) it is time to study
//답: study
public class WordinSentence {
    public static void main(String[] args) {
        WordinSentence w = new WordinSentence();
        Scanner in = new Scanner(System.in);
        String input1 = in.nextLine();
        System.out.println(w.solution(input1));
        return;
    }

    public String solution(String input1) {
        String answer = "";
        int n=0;
        int pos;

        while ((pos=input1.indexOf(' ')) != -1) { //띄어쓰기를 발견하면 -1을 리턴
            String tmp = input1.substring(0, pos); //str.substring(0, 3) -> 문자열의 0번째부터 3번째 앞 문자까지 추출
            int len = input1.length();
            if (len > n) { //기존의 길이보다 더 많은 길이가 발견되면
                n = len; //최댓값이 발견되면
                answer = tmp; //단어를 교체
            }

            input1 = input1.substring(pos + 1);
        }
        if (input1.length() > n) answer = input1;

        return answer;
    }
}

//String[] s = str.split(" ") -> 문자열을 잘라서 배열로 변환
//str.indexOf(" ") -> 문자가 처음 발견되는 인덱스를 반환, 만약 찾지 못했을 경우 -1을 반환
//str.substring(3) -> 문자열의 3번째부터 마지막까지 문자 추출

