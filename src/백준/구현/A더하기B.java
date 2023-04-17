package 백준.구현;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class A더하기B {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        double []arr = new double[2];

        int answer = 0;
        for(int i=0; i<2; i++){
            arr[i] = Double.parseDouble(st.nextToken());

        }
        System.out.println(arr[0] / arr[1]);

    }
}
