import java.util.Scanner;

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
