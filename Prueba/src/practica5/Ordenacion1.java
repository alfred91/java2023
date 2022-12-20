package practica5;

public class Ordenacion1 {
	
    public static void ordenacionBurbuja (int lista[]){
        int cuentaintercambios=0; //Variable que cuenta los intercambios que hacemos
        for (boolean ordenado=false;!ordenado;){ //hasta que no haya mas intercambios no sales
                for (int i=0;i<lista.length-1;i++){ if (lista[i]>lista[i+1]){
                        //intercambio
                        int variableauxiliar=lista[i];
                        lista[i]=lista[i+1];
                        lista[i+1]=variableauxiliar;
                        //indico que ha habido un intercambio mas
                        cuentaintercambios++;
                    }
                }
                //Si no hay intercambios, el array esta ordenado
                if (cuentaintercambios==0){
                    ordenado=true;
                }
                cuentaintercambios=0; //Reinicio la variable
        }}
		 public static void numAle(int vector[], int ini, int fin) {
			 int i;
			 for (i=0;i<vector.length;i++) {
			 int num=(int)(Math.random()*(max-min)+min);
			 }
		 }
	    public static void main(String[] args) {
	         
	        //array a ordenar
	        int numeros[]= new int[50];
	  	        
	        //llamada funcion
	        ordenacionBurbuja(numeros);
	         
	        //mostrar el contenido
	        for(int i=0;i<numeros.length;i++){
	            System.out.println(numeros[i]);
	        }
	         
	    }}	    