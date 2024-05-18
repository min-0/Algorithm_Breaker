import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public String Solution(int[] encodedArr) {
        StringBuilder answer = new StringBuilder();
        int[] toBit = new int[24];
        int countBit = 0;

        for (int i = 0; i < encodedArr.length; i++) { // 한 문자 씩 반복
            for (int j = 5; j >= 0; j--, countBit++) { // 숫자 2진수로 변환하여 toBit[] 배열에 저장
                toBit[countBit % 24] = (encodedArr[i] >> j) & 0x1;
            }

            if (countBit == 24) { // toBit 배열 꽉 차면 문자화한다. (6자리 2진수 4개가 아스키코드 숫자 3개로 디코딩된다.)
                for (int m = 0; m < 24; m += 8) {
                    int dec = 0;
                    for (int k = 0; k < 8; k++) {
                        dec = (dec << 1) | toBit[m + k];
                    }
                    answer.append((char) dec);
                }
                countBit = 0;
            }
        }

        // 남아있는 비트를 처리한다 (패딩이 있을 때).
        if (countBit > 0) {
            for (int m = 0; m < countBit; m += 8) {
                int dec = 0;
                for (int k = 0; k < 8 && (m + k) < countBit; k++) {
                    dec = (dec << 1) | toBit[m + k];
                }
                answer.append((char) dec);
            }
        }

        return answer.toString();
    }

    public static void main(String[] args) throws IOException {
        Solution m = new Solution();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String Base64 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/";
        int testCase = Integer.parseInt(br.readLine());

        for (int i = 0; i < testCase; i++) {
            String Encoding = br.readLine();
            ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(Encoding.split("")));
            int[] encodedArr = new int[arrayList.size()];
            for (int k = 0; k < Encoding.length(); k++) {
                encodedArr[k] = Base64.indexOf(arrayList.get(k));
            }
            System.out.println("#" + (i + 1) + " " + m.Solution(encodedArr));
        }
    }
}