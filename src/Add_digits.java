public class Add_digits {
        public int solution(int n) {

            String str=String.valueOf(n);
            String[] array = str.split("");
            int answer = 0;

            for(int i=0;i<array.length;i++) {
                answer += Integer.parseInt(array[i]);
            }

            return answer;
        }

    public static void main(String[] args) {
        Add_digits add_digits = new Add_digits();
        System.out.println(add_digits.solution(128));
    }
    }

