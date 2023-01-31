// import java.io.BufferedWriter;
// import java.io.OutputStreamWriter;
// import java.io.IOException;


public class Main_2557 {

	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer();
		sb.append("Hello World!");
		
		System.out.println(sb);
		
		
		/* 문제풀이3
		StringBuilder sb = new StringBuilder();
		sb.append("Hello World!");
		
		System.out.println(sb);
		*/
		
		
		
		/* 문제풀이 2 (main() 옆에 throws IOException 추가해야 함)
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		bw.write("Hello World!");
		bw.flush();
		bw.close();
		*/
		
		
		
		//문제풀이 1
		//System.out.print("Hello World!"); 		// 1번
		//System.out.println("Hello World!"); 	// 2번
		//System.out.printf("Hello World!"); 		// 3번
		//System.out.printf("%s", "Hello World!");// 4번
	}
}