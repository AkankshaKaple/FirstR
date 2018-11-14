 import java.io.*;
class Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int n = Integer.parseInt(args[0]);
		

			if(n > 31) {
				System.out.println("ENter valu less than 32");
			} else {
				int temp = 1;
				for(int i = 1; i <= n ; i++) {
					temp = temp * 2;
					}
				System.out.println(n + "th power of 2 is " + temp );
			}
	}












}
