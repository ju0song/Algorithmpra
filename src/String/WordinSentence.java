package String;

import java.util.Scanner;

//문장속 단어
//한개의 문장이 주어지면 그 문장 속에서 가장 긴 단어를 출력하는 프로그램
//ex) it is time to study
//답: study
public class WordinSentence {
    public static void main(String[] args) {
        WordinSentence w =new WordinSentence();
        Scanner in = new Scanner(System.in);
        String input1 = in.nextLine();
        System.out.println(w.solution(input1));
        return;
    }

    public String solution(String input1) {
       String answer = "";
       int n=Integer.MAX_VALUE;
       String[] str =input1.split( " ");//문자를 띄어쓰기마다 나누어줌
       for(String x : str){
//           System.out.println(x);
           int len =x.length(); //각각의 단어의 길이가 len에 들어감
           if(len>n){
               n=len;
               answer=x;
           }
       }

        return answer;
    }
}