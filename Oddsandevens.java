package oddsandevens;

import java.util.ArrayList;
import java.util.Scanner;

public class Oddsandevens {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		sc.close();
		ArrayList<Integer> even = new ArrayList();
		ArrayList<Integer> odds = new ArrayList();
		
		for(int i = 1; i<=number; i++) {
			
			if (i%2 == 0) {
				even.add(i);
			}
			else {
				odds.add(i);
			}
		}
		System.out.println("The even numbers are: " + even);
		System.out.println("The odds numbers are: " + odds);
	}

}
