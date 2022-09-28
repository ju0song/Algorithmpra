import java.util.*;

public class Caseconversion {


    public static void main(String[] args) {
        Caseconversion caseconversion = new Caseconversion();
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        System.out.println(caseconversion.solution(a));
    }

    public String solution(String a) {
        StringBuilder answer = new StringBuilder();
        for (char x : a.toCharArray()) {//toCharArray 란 String문자열을 char형 배열로 바꿔주는 메소드
            if (Character.isLowerCase(x)) {//isLowerCase x가 소문자인지 확인
                answer.append(Character.toUpperCase(x));
            } else {
                answer.append(Character.isLowerCase(x));
            }

        }
        return answer.toString();
    }
}
            //이제 대문자로 바꾸기




