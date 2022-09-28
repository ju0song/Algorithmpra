import java.util.Scanner;

public class WordInSentence2 {
        public String solution(String str){
            String answer="";
            int m=Integer.MIN_VALUE; //가장작은값 초기화
            String[] s = str.split(" "); //
            for(String x : s){
                int len=x.length();
                if(len>m){
                    m=len;
                    answer=x;
                }
            }
            return answer;
        }

        public static void main(String[] args){
            WordInSentence2 T = new WordInSentence2();
            Scanner kb = new Scanner(System.in);
            String str=kb.nextLine();
            System.out.print(T.solution(str));
        }
    }

