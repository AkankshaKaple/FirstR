import java.util.Scanner;

public class NumberOfPermutations {
	public int NumberOfPermutations(String string, int number) {
		int fact = 1;
		int count = 0;
		for(int i=1; i <=number ; i++) {
			fact = i * fact;
		}
		char[] array = string.toCharArray();
		for(int j=0 ; j<array.length ; j++) {
			for(int k =0; k<array.length ; k++) {
				if(array[j] == array[k]) {
					count++;
				}

			}
			System.out.println("number of " + array[j] + " = " + count);

		}
		return fact;
		
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of strings : ");
		int number = scan.nextInt();
			System.out.println("Entre the string : ");
			String string = scan.next();
			NumberOfPermutations n = new NumberOfPermutations();
			n.NumberOfPermutations(string, number);

	}
}
