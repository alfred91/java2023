package Tema3;

import java.util.Arrays;

public class EjemploOrdenacion {

	public static void burbuja(int numeros[]) {
		int aux;
		for (int i=numeros.length;i>0;i--) {
			for (int j=0; j<i-1; j++) {
				if (numeros[j]>numeros[j+1]) {
					//INTERCAMBIAR
					aux=numeros[j+1];
					numeros[j+1]=numeros[j];
					numeros[j]=aux;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		//LOS ARRAYS SE PASAN AUTOMATICAMENTE POR REFERENCIA EN JAVA
		
		//DECLARACIÓN DEL ARRAY
		int nums[]=new int[20];
		
		//RELLENAR CON NUMALE
		for(int i=0; i<nums.length; i++) {
			nums[i]=(int) (Math.random()*100)+1;
		}
		
		//PINTAR ARRAY		
		for(int i=0;i<nums.length;i++) {
			System.out.print(nums[i]+", ");
		}
			
		//ORDENAR
		
		burbuja(nums);
		System.out.println();
		
		//PINTAR ARRAY
		for(int i=0;i<nums.length;i++) {
			System.out.print(nums[i]+", ");
		}
		Arrays.sort(nums);		
		System.out.println(nums);
	}

}