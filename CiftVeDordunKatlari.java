package Ders3;

import java.util.Scanner;

public class CiftVeDordunKatlari {

	public static void main(String[] args) {
		/*
		 * Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri 
		 * kabul eden ve girilen değerlerden çift ve 4'ün katları olan sayıları 
		 * toplayıp ekrana basan programı yazıyoruz.
		 */
		
		Scanner scan=new Scanner(System.in);	
		int sayi,total=0;
		
		do {
			System.out.println("Sayı giriniz: ");
			sayi=scan.nextInt();
			if (sayi%4==0) {
				total+=sayi;
				
			}
			
		} while (sayi%2==0);
		System.out.println("Toplam= "+total);
		
	}

}
