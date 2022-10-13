package Pratice.String;

import java.util.Scanner;

//dsds1dfd5ds3d21se12sd13d58f84e36 ->153211213898436
//answer =0으로 초가화 x >=
public class NumberExtraction {
    public String solution(String s) {
        String answer="";
        for (char x : s.toCharArray()) {
            if(Character.isDigit(x)){
                answer +=x;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        NumberExtraction NumberExtraction = new NumberExtraction();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(NumberExtraction.solution(str));

    }


}
