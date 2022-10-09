package Programmers;

import java.util.ArrayList;
import java.util.Arrays;

//입출력 예
//n	     return
//12345	[5,4,3,2,1]
public class ReverseNumber_MakeArray {
    public int[] solution(long n) {

        String str = String.valueOf(n);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.reverse();
        String[] sp =stringBuilder.toString().split("");
        int[] answer = new int[sp.length];
        for(int i=0;i<sp.length;i++) {
            answer[i] = Integer.parseInt(sp[i]);
        }
        answer.toString();
        return answer;
    }

    public static void main(String[] args) {
        ReverseNumber_MakeArray a = new ReverseNumber_MakeArray();
        System.out.println(a.solution(12345));
    }
}


//문자열로 바꾸기
