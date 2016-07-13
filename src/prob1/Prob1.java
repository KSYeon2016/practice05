package prob1;

import java.util.Scanner;

public class Prob1 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner( System.in );
		
		System.out.print( "문자열을 입력하세요:" );
		String s = scanner.nextLine();
		
		// 문자열을 한 글자씩 늘려서 출력하는 코드
		int len = s.length();
		for(int i = 1; i <= len; i++){
			String result =s.substring(0, i);
			System.out.println(result.toUpperCase());
		}
		
		scanner.close();
	}
	
}
