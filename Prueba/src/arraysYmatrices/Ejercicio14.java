package arraysYmatrices;
import java.util.Arrays;
import java.util.Scanner;
public class Ejercicio14{
    
    public static void main(String[] args) {//Creamos los arrays multidimensionales
        int tabla1[][]=new int [2][3];
        int tabla2[][]=new int [2][3];
        int sumamatrices[][]=new int [tabla1.length][tabla1[0].length];
        int numero[][]=new int[2][3];
      
        //Rellenamos los dos primeros arrays
        rellenarArrays(tabla1, 1, 200);
        rellenarArrays(tabla2, 1, 200);
 
        //Sumamos los arrays
        SumaMatrices(tabla1, tabla2, sumamatrices);
 
        //Mostramos los arrays
        System.out.println("Array 1 ");
        imprimirTabla(tabla1);
 
        System.out.println("Array 2");
        imprimirTabla(tabla2);
 
        System.out.println("La media es:  ");
        imprimirTabla(sumamatrices);
        System.out.println("La media total es: "+media(sumamatrices));
        
        System.out.println("El mayor es:  "+mayor(tabla1));
        System.out.println("El mayor del 2:  "+mayor(tabla2));
        
        
    }
    public static void rellenarArrays(int tabla[][], int a, int b){
    	
    	Scanner sc = new Scanner(System.in);
        for(int i=0;i<tabla.length;i++){
            for(int j=0;j<tabla[0].length;j++){
            	System.out.println("Introduce un numero: ");
                int numero=sc.nextInt();          
                tabla[i][j]=numero;
            }
        }
    }
    public static void imprimirTabla (int tabla[][]){
        for (int i=0;i<tabla.length;i++){
            for (int j=0;j<tabla[0].length;j++){
                System.out.print(tabla[i][j]+ " ");
            }
            System.out.println("");
        }
         
    }
    public static int mayor (int tabla[][]){
    	int mayor=0;
        for (int i=0;i<tabla.length;i++){
            for (int j=0;j<tabla[0].length;j++){
                if (j>mayor){
                	j=mayor;
                }
            }
            System.out.println("");
        } return mayor;
              
    }
    public static double media(int tabla[][]) {
    	 
        double suma = 0, media;
 
        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[0].length; j++) {
                suma += tabla[i][j];
            }
        }
        media = suma / (tabla.length * tabla.length);
        return media;
 
    }
    public static int[][] SumaMatrices (int tabla1[][], int tabla2[][], int sumamatrices[][]){
 
        for (int i=0;i<sumamatrices.length;i++){
            for (int j=0;j<sumamatrices[0].length;j++){
                sumamatrices[i][j]=(tabla1[i][j]+tabla2[i][j])/2;
            }
            System.out.println("");
        }
        return sumamatrices;
    }
}