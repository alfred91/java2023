package estructurasDeControl;
import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {
    	int numero=0;
    	
    	Scanner sc = new Scanner(System.in);
		System.out.println("Dime un numero");
		numero = Integer.parseInt(sc.nextLine());
		int dobles=(numero/2), triples=(numero/3);
		int i=0;
		
		System.out.println("Dobles "+dobles);
		for (i=0;i<=dobles;i++) {
			if(i!=0&&numero%i==0) {System.out.println(i);}
		}
			
		System.out.println("Triples "+triples);
		for (i=0;i<=triples;i++) {
			if(i!=0&&numero%i==0) {System.out.println(i);}
  }}
}