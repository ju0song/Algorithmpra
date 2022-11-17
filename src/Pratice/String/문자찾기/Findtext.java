package src.Pratice.String.문자찾기;

import java.util.Scanner;
//한 개의 문자열을 입력받고, 특정 문자를 입력받아 해당 특정문자가 입력받은 문자열에 몇 개 존재하는지 알아내는 프로그램을 작성하세요. 대소문자를 구분하지 않습니다.
//문자열의 길이는 100을 넘지 않습니다.
//▣ 입력설명
//첫 줄에 문자열이 주어지고, 두 번째 줄에 문자가 주어진다. 문자열은 영어 알파벳으로만 구성되어 있습니다.
//▣ 출력설명
//첫 줄에 해당 문자의 개수를 출력한다.
//▣ 입력예제 1 Computercooler c
//▣ 출력예제 1 2

public class Findtext {
     public static void main(String[] args) {
         Findtext findtext =new Findtext();
         Scanner a =new Scanner(System.in);
         String s = a.next();
         char c = a.next().charAt(0);
         System.out.println(findtext.solution(s,c));

     }
     public int solution(String s,char c){
         int answer =0;
         s=s.toUpperCase();//대문자로 다 만들어주는 함수
         c=Character.toUpperCase(c);
         //string의 길이 length
         for(int i=0;i<s.length();i++){
             if(s.charAt(i) == c)
             answer++;
         }
         return answer;
     }
 }