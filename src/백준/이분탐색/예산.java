package 백준.이분탐색;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 예산 {



    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int [] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int m = Integer.parseInt(br.readLine());

        Arrays.sort(arr);

        int sum = 0;
        int max = arr[0];
        // 원소의 합계와 최댓값 구함
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if(arr[i] > max) max = arr[i];
        }
        
        StringBuilder sb = new StringBuilder();
        if(sum > m){

        }else {
            sb.append(max);
        }
        System.out.println(sb);


    }
}
