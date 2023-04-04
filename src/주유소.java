import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class 주유소 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); // 첫 번째 줄 받고 - 도시의 개수

        StringTokenizer st = new StringTokenizer(br.readLine()); // 공백을 자르는 객체, 두 번째 줄 받고
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < n - 1; i++) { // 반복문 돌면서 하나씩 리스트에 저장 - 이게 두 번째 줄 - 도시간 거리
            list.add(Integer.parseInt(st.nextToken()));
        }

        st = new StringTokenizer(br.readLine()); // 세 번째 줄 읽음 - 리터 당 가격
        List<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list2.add(Integer.parseInt(st.nextToken())); //
        }



    }
}
