	import java.util.Scanner;

	public class Table
	{
	    public static void main(String[] args)
	    {
	        Scanner console = new Scanner(System.in);
	        int num;
	        
	        System.out.print("Enter any positive integer: ");
	        num = console.nextInt();
	                
	        System.out.println("Multiplication Table of " + num);
	        int cont = 0;
	        int num2 = 0;
			 while ( cont <= 10) {
				 System.out.println(num + " por "+ cont+ " = " + num2);
				 cont++;
				 num2=(cont*num);
				 }//while
			 console.close();
			}//main

		}//whileDemo

	       //TODO implement While loop to get print result
