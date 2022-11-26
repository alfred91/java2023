package practica2;
import java.util.Random;
public class Ejercicio17 {

	public static void main(String[] args)
	
	{
		
		Random r1=new Random();
		int n1=r1.nextInt(49)+1;
		 
		Random r2=new Random();
		int n2=r2.nextInt(500)*2;
		
		Random r3=new Random();
		double n3=r3.nextDouble(10)+1;
		
		Random r4=new Random();
		int n4=r4.nextInt(100)-151;
		
		Random r5=new Random();
		int n5=r5.nextInt(200)-100;
		
		Random r6=new Random();
		int n6=r6.nextInt();
		
		int a=(int) ((Math.random() * ((5-5) + 1))+ 5);
		int b=(int) ((Math.random() * ((7-7) + 1))+ 7);
		int c=(int) ((Math.random() * ((33-33) + 1))+ 33);
		int d=(int) ((Math.random() * ((125-125) + 1))+ 125);
		int e=(int) ((Math.random() * ((77-77) + 1))+ 77);
		
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
		System.out.println(n4);
		System.out.println(n5);
		System.out.println(n6);
		System.out.println();
	}

}