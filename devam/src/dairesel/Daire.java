package dairesel;
import java.util.Scanner;

public class Daire {
	public static void main(String[]args) {
		
		/* Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.
				𝜋 sayısını = 3.14 alınız.
				Formül : (𝜋 * (r*r) * 𝛼) / 360 				  */
		Scanner inp=new Scanner(System.in);
		
		double pi=3.14;
		double r, a;
		System.out.println(" merkez açı ölçüsü gir: ");
		a=inp.nextDouble();
		System.out.println(" yarıçap gir: ");
		r=inp.nextDouble();
		double sonuc=(pi*(r*r)*a)/360;
		System.out.println("sonuc:" +sonuc)
		;
		
		
		
		
								
	}
																																					

}
