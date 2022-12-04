package estructurasDeControl;
public class Ejercicio7 {
	
public static boolean esImpar(int iNumero) {
	  if (iNumero%2!=0)
	    return true;
	  else
	    return false;
	}
    public static void main(String[] args) {
    	int contador = 0;
    	int incremento = 1;
    	while (contador !=100) {	
    		
    	  if (esImpar(incremento)) {
    	    System.out.println(incremento);
    	    contador++;
    	  }			
    	  incremento++;  
    	}
    	System.out.println("La suma de los 100 primeros numeros impares es: "+contador*incremento);
  }
}