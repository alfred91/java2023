package practica5;
import java.util.Scanner;
public class Ejercicio5 {

	    public static void main(String[] args) {
	    	
	    	Scanner sc=new Scanner(System.in);
	    	System.out.println("Introduce una cadena: ");
	        String str = sc.nextLine();
	        
	        int vcont = 0, ccont = 0;
	        int scont=0;

	        //converting all the chars to lowercase
	        str = str.toLowerCase();
	        for(int i = 0; i < str.length(); i++) { char ch = str.charAt(i); if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
	        { vcont++; }else if((ch >= 'a' && ch <= 'z')) {    	
	                ccont++;
	            }
	        else if(ch==' ') {scont++;}
	        }
	        
	        System.out.println("Numero de Vocales: " + vcont);
	        System.out.println("Numero de Consonantes: " + ccont);  
	        System.out.println("Numero de Espacios: " + scont);  
	  }	
}