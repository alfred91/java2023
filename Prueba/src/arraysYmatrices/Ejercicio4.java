package arraysYmatrices;
import java.util.Scanner;
public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int i, t[];
		t = new int[10];
		for (i=0;i<10;i++){
		System.out.print("Introduzca numero: ");
		
		t[i]=sc.nextInt();
		}
		System.out.println("El resultado es:");
		for (i=0;i<=4;i++){
		System.out.print (t[i]+" "); // mostramos el i-ésimo número por el principio
		System.out.print(t[9-i]+" "); // y el i-ésimo por el final
		}
		// como en cada vuelta de for se muestran dos números
		// para mostrarlos todos, solo necesitaremos la mitad de vueltas.

}}