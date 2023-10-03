package triangle;
import java.util.Scanner;


public class dikucgen {
	public static void main(String[]args) {
		double a,b,c;
		//dik ucgen ile işlemler yapalım
		//ucgenin dik kenari a tabanı b hipotenüs c olsun
		Scanner abc=new Scanner(System.in);
		System.out.println("a kenarini giriniz"); 
		a=abc.nextDouble();
		System.out.println("b kenarini giriniz"); 
		b=abc.nextDouble();
		c=Math.sqrt((a*a+b*b));
		System.out.println("hipotenus: "+c);
		System.out.println("cevre: "+(a+b+c));
		System.out.println("alan: "+(a*b)/2);
			
	}

}
