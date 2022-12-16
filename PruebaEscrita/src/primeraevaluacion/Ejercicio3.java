package primeraevaluacion;
import java.util.Arrays;
public class Ejercicio3 {

	public static void main(String[] args) {
		 //creo el array
        int num[]=new int[100];

        //relleno todo el array con 20
        Arrays.fill(num, 100);
         
        //Relleno desde la posicion 3 hasta el final
        Arrays.fill(num, 100, num.length, -1);
         
        //Muestro el array
        for(int i=0;i<num.length;i++){
            System.out.print(num[i]+" ");
        }
        int num2[]=Arrays.copyOfRange(num, 1, 100);
        Arrays.sort(num);
         
        //Muestro el array
        for(int i=0;i<num.length;i++){
            System.out.println("SORT: "+num[i]+" ");
        }
        //Muestro el array
        for(int i=0;i<num2.length;i++){
            System.out.print("Copy of: "+num2[i]+" ");
        }
         
    }
     
}