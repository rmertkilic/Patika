package vke;
import java.io.Closeable;
import java.util.Scanner;

import javax.swing.colorchooser.ColorSelectionModel;


public class VucutKitle {
	public static void main(String[]args) {
		
		//vücut kitle endeksi hesaplama
		//Kilo (kg) / Boy(m) * Boy(m)
		double kg, m;
		
		
		Scanner inp=new Scanner(System.in);
		System.out.println(" boy gir(cm): ");
		m=inp.nextDouble();
		System.out.println(" kilo gir(kg): ");
		kg=inp.nextDouble();
		//hesaplama
		double sonuc= kg/(m/100*m/100);
		System.out.println("sonucunuz: "+sonuc);
		inp.close();
		//obez misin acaba
		String obezlik=sonuc<35?"obez degilsin":"obezsin";
		System.out.print(obezlik);
	}
		
	


}
