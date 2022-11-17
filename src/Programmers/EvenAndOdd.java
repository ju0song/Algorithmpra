package src.Programmers;

public class EvenAndOdd {
        public String solution(int num) {
            String answer ;
            if(num%2 == 0) {
                answer ="Even";
            }else{
                answer ="Odd";
            }
            return answer;
        }

    public static void main(String[] args) {
       EvenAndOdd evenAndOdd = new EvenAndOdd();
        System.out.println(evenAndOdd.solution(22));

    }


}
