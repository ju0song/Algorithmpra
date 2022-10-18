package Backjoon.Backjoon8595;

import java.io.*;
import java.math.BigDecimal;
import java.util.*;

//https://www.acmicpc.net/problem/8595
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        ArrayList<Integer> set = new ArrayList<>();
        for (char c : a.toCharArray()) {
            if(Character.isDigit(c)){
               set.add(c -'0');
            }
        }
        int sum=0;
        for (Integer integer : set) {
            sum += integer;
        }
        System.out.println(sum);



    }
















    }


