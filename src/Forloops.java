import java.util.Scanner;

public class Forloops {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Escribe el numero : ");
		int num = in.nextInt();
		for ( int cont = 0 ; cont < 100; cont+=2) {
			if(cont == num) {
				continue;
				}
			System.out.println(cont);
		}
	}
}
