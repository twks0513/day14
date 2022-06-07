package day14;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int x,y,result=0;
		
		System.out.println("¼ö ÀÔ·Â");
		try {
		x = scan.nextInt();
		y = scan.nextInt();
			result = x/y;			
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(result);

	}

}
