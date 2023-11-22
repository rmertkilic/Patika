package manav;
import java.util.Scanner;

public class Meyve {
	public static void main(String[]args) {
		double armut, elma, domates, muz, patlican;
		Scanner inp=new Scanner(System.in);
		System.out.println("sırasıyla armut elma muz domates patlican kilosunu gir.");
		armut=inp.nextDouble();
		System.out.println("armut: "+armut +"kg: "+armut*2.14);
		elma=inp.nextDouble();
		System.out.println("elma: "+elma +"kg: "+elma*3.67);
		domates=inp.nextDouble();
		System.out.println("domates: "+domates +"kg: "+domates*1.11);
		muz=inp.nextDouble();
		System.out.println("muz: "+muz +"kg: "+muz*0.95);
		patlican=inp.nextDouble();
		System.out.println("patlican: "+patlican +"kg: "+patlican*5);
		inp.close();
		
		double sonuc=armut*2.14+elma*3.67+domates*1.11+muz*0.95+patlican*5;
		System.out.println("toplam fiyat: "+sonuc);
		
		
	}
}
	
		
		
		