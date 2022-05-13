package class02;

import java.util.Scanner;
import java.util.StringTokenizer;
public class boj1152 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		sc.close();
		
		StringTokenizer st = new StringTokenizer(input, " ");
		System.out.println(st.countTokens());
	}

}
