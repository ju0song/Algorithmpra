package src.Backjoon.백준2546;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        double sum = 0;
        double[] scores = new double[n];
        for(int i = 0; i < n; i++){
            scores[i] = scan.nextInt();
            sum += scores[i];
        }
        scan.close();
        Arrays.sort(scores);
        System.out.println(sum/scores[n-1]*100/n);
    }
}