package Backjoon.제로;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        int answer = 0;
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(bf.readLine());
//        System.out.println(bf);
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < a; i++) {
            int b = Integer.parseInt(bf.readLine());
            if (b == 0) {
                stack.pop();
            } else {
                stack.push(b);
            }
        }
            while (stack.isEmpty()) {
                answer += stack.pop();
            }
        System.out.println(answer);
        }
    }

