package uygulama1;
import java.util.Scanner;

public class notOrt {
	public static void main(String[]args) {
		//degiskenler
		int mat, fizik, kimya, turkce, tarih, muzik;
		
		Scanner x= new Scanner(System.in);
		
			System.out.println("mat notunuzu girin: ");
			mat=x.nextInt();
			
			System.out.println("fizik notunuzu girin: ");
			fizik=x.nextInt();
			
			System.out.println("kimya notunuzu girin: ");
			kimya=x.nextInt();
			
			System.out.println("turkce notunuzu girin: ");
			turkce=x.nextInt();
			
			System.out.println("tarih notunuzu girin: ");
			tarih=x.nextInt();
			
			System.out.println("muzik notunuzu girin: ");
			muzik=x.nextInt();
			
		
		double not_ortalamasi=(mat+fizik+kimya+turkce+tarih+muzik)/6;
		System.out.println("not ortalamaniz: "+not_ortalamasi);
			
		
		//----- gecme kalma durumuu
		boolean gecti = not_ortalamasi >= 60;
		boolean kaldi = !gecti;

		int sinifDurumu = (gecti ? 1 : 0);

		String sonuc = (sinifDurumu == 1) ? "Sınıfı Geçti" : "Sınıfta Kaldı";
		System.out.println(sonuc);
			
			
		
		
		
	}

}
