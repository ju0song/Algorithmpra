package src.Pratice.String;
//대소문자 변환
//대문자와 소문자가 같이 존재하는 문자열을 입력받아 대문자는 소문자로 소문자는 대문자로 변환하여 출력하는 프로그램을 작성하세요.
//        ▣ 입력설명
//        첫 줄에 문자열이 입력된다. 문자열의 길이는 100을 넘지 않습니다. 문자열은 영어 알파벳으로만 구성되어 있습니다.

//        ▣ 출력설명
//        첫 줄에 대문자는 소문자로, 소문자는 대문자로 변환된 문자열을 출력합니다.

//        ▣ 입력예제 1 StuDY
//        ▣ 출력예제 1 sTUdy


import java.util.ArrayList;
import java.util.Scanner;

public class ReverseWord {

    public ArrayList<String> solution(int n, String[] str) {
        ArrayList<String> answer = new ArrayList<>();
        for (String x : str) {
            String tmp = new StringBuilder(x).reverse().toString();
            answer.add(tmp);
        }
        return answer;
    }

    public static void main(String[] args){
        ReverseWord T = new ReverseWord();
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        String[] str=new String[n];
        for(int i=0; i<n; i++){
            str[i]=kb.next();
        }

        for(String x : T.solution(n, str)){
            System.out.println(x);
        }
    }
}
