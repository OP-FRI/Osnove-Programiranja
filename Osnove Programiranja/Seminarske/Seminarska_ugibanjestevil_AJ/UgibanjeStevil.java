/*
* Author: Adrian Jarc
*/

import java.util.Scanner;

public class UgibanjeStevil{

	static int n, ug, p;
	static double st = Math.random();
	static Scanner sc = new Scanner(System.in);
	
	
	public static void main(String[] args){
		System.out.print ("Koliko števk naj ima število? ");
		n = sc.nextInt();
		while (st<0.0){
			st = Math.random();
		}
		Ugibanje();
	}
	
	public static void Ugibanje(){
		for (int i=0;i<n;i++){
			st *= 10;
		}
		int st1 = (int)st;
		int ug1;		
		while (ug != st1){
			System.out.print("Ugibajte: ");
			ug = sc.nextInt();
			if (ug < 0){
				System.out.print("Izbral sem stevilo: " +st1);
				break;
			} else {
				ug1 = ug;
				for (int i=1;i<=n;i++){
					for (int j=n;j>i;j--){
						ug1 = ug1/10;
						st1= st1/10;
					}
					if (st1%10>ug1%10){
						System.out.println(i + ". števka je premajhna.");
					}
					else if (st1%10<ug1%10){
						System.out.println(i + ". števka je prevelika.");
					}
					st1=(int)st;
					ug1=ug;
				}
				p++;
			}
		}
		if(ug>0){
			System.out.println("Èestitke! Potrebovali ste " + p + " poskusov");
		}
	}
}