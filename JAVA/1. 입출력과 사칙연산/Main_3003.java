import java.util.Scanner;

public class Main_3003 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		/*
		int K = 1;
		int Q = 1;
		int R = 2;
		int B = 2;
		int Kn = 2;
		int P = 8;
		
		K = K - in.nextInt();
		Q = Q - in.nextInt();
		R = R - in.nextInt();
		B = B - in.nextInt();
		Kn = Kn - in.nextInt();
		P = P - in.nextInt();
		
		System.out.print(K + " ");
		System.out.print(Q + " ");
		System.out.print(R + " ");
		System.out.print(B + " ");
		System.out.print(Kn + " ");
		System.out.print(P + " ");
		*/
		
		int A = in.nextInt();
		int B = in.nextInt();
		int C = in.nextInt();
		int D = in.nextInt();
		int E = in.nextInt();
		int F = in.nextInt();
		
		if (A == 1) {
			System.out.print("0 ");
		} else {
			A = 1 - A;
			System.out.print(A + " ");
		}
		
		if (B == 1) {
			System.out.print("0 ");
		} else {
			B = 1 - B;
			System.out.print(B + " ");
		}
		
		if (C == 2) {
			System.out.print("0 ");
		} else {
			A = 2 - C;
			System.out.print(C + " ");
		}
		
		if (D == 2) {
			System.out.print("0 ");
		} else {
			D = 2 - D;
			System.out.print(D + " ");
		}
		
		if (E == 2) {
			System.out.print("0 ");
		} else {
			E = 2 - E;
			System.out.print(E + " ");
		}
		
		if (F == 8) {
			System.out.print("0 ");
		} else {
			F = 8 - F;
			System.out.print(F + " ");
		}
		in.close();
		
		
	}

}
