package kdv;
import java.util.Scanner;

public class kdvHesap {
	public static void main(String[]args) {
		System.out.println(" fiyat giriniz ");
		Scanner x= new Scanner(System.in);
		double fiyat= x.nextDouble();
		
		
		double kdv= (fiyat>=1000)? 0.08:0.18;
		double kdvtutari=(fiyat*kdv);
		double sonfiyat=(fiyat*kdv+fiyat);
		double saglama=(fiyat+kdvtutari);
		
		 	System.out.println("KDV'siz Fiyat: " + fiyat);
	        System.out.println("KDV Oranı %: " + (kdv* 100));
	        System.out.println("KDV Tutarı: " + kdvtutari);
	        System.out.println("KDV'li Fiyat: " + sonfiyat);
	        System.out.println(saglama);
		
		
	}

}
