import java.util.Scanner;

public class Forloops {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Escribe tu Nombre : ");
		String name = in.next();
	    for (int i = 0; i < name.length(); i++) {
	    System.out.println(name.charAt(i));
	    in.close();
		}//for
	}//main
}//class

