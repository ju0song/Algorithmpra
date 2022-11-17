package src.Backjoon;

import java.util.ArrayList;
import java.util.Scanner;



//I am happy today                ->I ma yppah yadot
//We want to win the first prize  ->eW tnaw ot niw eht tsrif ezirp
//i am iron man                   -> i ma nori nam

public class Backjoon9093 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        ArrayList<String> list = new ArrayList<>();
        list.add(a);
        ArrayList<String> answer = new ArrayList<>();
        for (String value : list) {
            String[] str = value.split(" "); // 공백을 기준으로 단어를 자른다
            StringBuilder revStr = new StringBuilder();
            for (String s : str) {
                revStr.append(new StringBuilder(s).reverse() + " "); // 뒤집어서 붙인다
            }
            answer.add(revStr.toString().trim()); // 앞뒤공백제거
        }

        for(String s : answer) {
            System.out.println(s); // 출력
        }


    }
}
