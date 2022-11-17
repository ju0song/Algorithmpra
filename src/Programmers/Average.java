package src.Programmers;
//평균구하기
public class Average {
        public double solution(int[] arr) {
            double answer = 0;
            double sum =0;

            for(int i=0;i<arr.length;i++){
                sum += arr[i];
            }
            answer = sum/arr.length;
            return answer;
        }



    public static void main(String[] args) {
        Average average = new Average();
        int arr[] ={1,2,3,4};
        System.out.println(average.solution(arr));
    }
}
