package Pratice.String;

import java.util.Scanner;
//숫자만 추출
//dsds1dfd5ds3d21se12sd13d58f84e36 ->153211213898436
public class NumberExtraction {
    public String solution(String s) {
        StringBuilder answer= new StringBuilder();
        for (char x : s.toCharArray()) {
            if(Character.isDigit(x)){
                answer.append(x);
            }
        }
        return answer.toString();
    }

    public static void main(String[] args) {
        NumberExtraction NumberExtraction = new NumberExtraction();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(NumberExtraction.solution(str));

    }


}
