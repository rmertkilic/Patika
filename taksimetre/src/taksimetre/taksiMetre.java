package taksimetre;
import java.util.Scanner;

public class taksiMetre {
	public static void main (String[]args) {
		
		double km;
		double perkm=2.20, total=10;
		
		System.out.println("mesafe gir km: ");	
		Scanner mesafe= new Scanner(System.in);
		km=mesafe.nextDouble();
		total+=perkm*km;
	total=(total<20)?20:total;
		System.out.println(total);
		
		
		
		
	}

}
