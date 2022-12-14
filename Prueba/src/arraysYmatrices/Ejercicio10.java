package arraysYmatrices;
import java.util.Scanner;
public class Ejercicio10 {

public static void main(String[] args) {
Scanner sc= new Scanner(System.in);

int n[]= {0,1,2,3,4,5,6,7,8,9,};
int pos;
System.out.println();
System.out.println("Direccion a eliminar: ");
pos=sc.nextInt();
for (int i=pos; i<9;i++) {
	n[i]=n[i+1];
}
System.out.println("El orden de las posiciones: ");
for(int i=0;i<9;i++) {
	System.out.println(i+" "+n[i]);
}
	}
}