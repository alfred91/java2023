package arraysYmatrices;
import java.util.Scanner;
public class Ejercicio5 {

		public static void main(String[] args) {
			Scanner sc= new Scanner(System.in);
			int a[], b[], c[];
			int i,j;
			a=new int[10];
			b=new int[10];
			// la tabla c tendrá que tener el doble de tamaño que a y b.
			c = new int [20];
			// leemos la tabla a
			System.out.println("Escribe la tabla A");
			for (i=0;i<10;i++){
			System.out.print("número: ");
			a[i]=sc.nextInt();
			}
			// leemos la tabla b

			System.out.println("Escribe la tabla B");
			for (i=0;i<10;i++){
			System.out.print("número: ");
			b[i]=sc.nextInt();		}
			// asignaremos los elementos de la tabla c
			// para las tablas a y b utilizaremos como índice i
			// y para la tabla c utilizaremos como índice j.
			j=0;
			for (i=0;i<10;i++){
			c[j]=a[i];
			j++;
			c[j]=b[i];
			j++;		
			}
			System.out.println("Tabla C: ");
			for (i=0;i<20;i++)
			System.out.print(c[i]+" ");
			System.out.println("");
			}
			}