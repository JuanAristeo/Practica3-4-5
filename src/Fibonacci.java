
public class Fibonacci {

	public static void main(String[] args) {
		int cont=0;
		int variable1= 1;
		int variable2=1;

		do {
	 
			System.out.println(variable1+" " + " " + cont);
			
			cont=variable1+variable2;
			variable1=variable2;
			variable2=cont;
			

		} while(cont < 100);

	}//main

}
