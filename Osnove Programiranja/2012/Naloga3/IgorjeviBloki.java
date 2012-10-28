/*
Luka Pušić <luka@pusic.si>
FRI, 2012
Igorjevi Bloki
*/

import java.util.Scanner;

public class IgorjeviBloki{
	public static void main(String[] args){
		Scanner stdin = new Scanner(System.in);
		System.out.print("Vnesite prvo števko: ");
		int prva = stdin.nextInt();
		System.out.print("Vnesite drugo števko: ");
		int druga = stdin.nextInt();
		System.out.print("Vnesite tretjo števko: ");
		int tretja = stdin.nextInt(), visina, sirina;

		sirina = prva + druga + tretja + 2;
		//v naslednjih dveh vrsticah samo določin da je višina enaka največjemu št. v vnosu
		if(prva > druga){visina = prva;}else{visina = druga;}
		if(visina < tretja){visina = tretja;}

		for(int i = 0; i < visina; i++){
			for(int j = 0; j < sirina; j++){
				if(j < prva && i < prva){
					System.out.print(prva);
				}else if(j > prva && j < (sirina - tretja - 1) && i < druga){
					System.out.print(druga);
				}else if(j > (sirina - tretja - 1) && i < tretja){
					System.out.print(tretja);
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
