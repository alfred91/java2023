package cursoJava;
import javax.swing.*;
public class Arrays_2 {

	public static void main(String[] args) {
		
		String [] paises=new String[8];
		
		for (int i=0;i<8;i++) {
			paises[i]=JOptionPane.showInputDialog("Introduce el pais: "+(i+1));
		}
		/*paises[0]="España";
		paises[1]="Argentina";
		paises[2]="Mexico";
		paises[3]="Colombia";
		paises[4]="Perú";
		paises[5]="Chile";
		paises[6]="Ecuador";
		paises[7]="Venezuela";*/
		
		//String[] paises= {"España","Argentina","Mexico","Colombia","Peru","Chile","Ecuador","Venezuela"};
		
		/*for (int i=0; i<paises.length;i++) {
			
			System.out.println("Pais "+ (i+1)+": "+paises[i]);
		}*/
		
		for(String cadena:paises) {
			
			System.out.println("Pais: "+cadena);
			
		}
	}

}