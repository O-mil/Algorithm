import java.util.Scanner;

public class Main_2588 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		//풀이 1
		int A = in.nextInt();
		String B = in.next();
		
		System.out.println(B.charAt(0));
		System.out.println(B.charAt(0) - '0');
	
		System.out.println(B.charAt(0) - 0);
		System.out.println((B.charAt(0) - '0') - 0);
		
		System.out.println(A * (B.charAt(2) - '0'));
		System.out.println(A * (B.charAt(1) - '0'));
		System.out.println(A * (B.charAt(0) - '0'));
		System.out.println(A * Integer.parseInt(B));
		
		
		/*// 풀이 2
		int A = in.nextInt();
		int B = in.nextInt();
		
		System.out.println(A * (B % 10));
		System.out.println(A * (B % 100 / 10));
		System.out.println(A * (B / 100));
		System.out.println(A * B);
		*/
		
		
		in.close();
	}
}
