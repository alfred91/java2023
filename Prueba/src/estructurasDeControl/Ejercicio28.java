package estructurasDeControl;

	// Java program to Sort a String Alphabetically
	// Using toCharArray() method
	// With using the sort() method
	 
	// Importing Arrays class from java.util package
	import java.util.Scanner;
	import java.util.Arrays;
	 
	// Main class
	public class Ejercicio28 {
	    // Method 1
	    // To sort a string alphabetically
	    public static String sortString(String inputString)
	    {
	        // Converting input string to character array
	        char tempArray[] = inputString.toCharArray();
	 
	        // Sorting temp array using
	        Arrays.sort(tempArray);
	 
	        // Returning new sorted string
	        return new String(tempArray);
	    }
	 

	    public static void main(String[] args)
	    {
	    	Scanner teclado=new Scanner(System.in);
	    	String nombre,apellido1,apellido2,nombre1,apellido11,apellido22;
	    	
	    	
	    	System.out.println("Introduce Nombre: ");
	    	nombre=teclado.nextLine();
	    	
	    	System.out.println("Introduce Apellido 1: ");
	    	apellido1=teclado.nextLine();
	    	
	    	System.out.println("Introduce Apellido 2: ");
	    	apellido2=teclado.nextLine();
	    	
	    	System.out.println("Introduce Nombre 2: ");
	    	nombre1=teclado.nextLine();
	    	
	    	System.out.println("Introduce Apellido 1: ");
	    	apellido11=teclado.nextLine();
	    	
	    	System.out.println("Introduce Apellido 2: ");
	    	apellido22=teclado.nextLine();
	       	teclado.close();
	       	
	       	 if (apellido1.compareToIgnoreCase(apellido11)<0)
	       			       	 		{
	       	System.out.println(nombre+" "+apellido1 +" "+apellido2);
	       	   System.out.println(nombre1+" "+apellido11+" "+apellido22);	
	    			      
	         } 
	       	  else { System.out.println(nombre1+" "+apellido11+" "+apellido22);
             System.out.println(nombre+" "+apellido1+" "+apellido2);    
      	 
	         }
	     if (apellido1.compareToIgnoreCase(apellido11)<=0 && apellido2.compareToIgnoreCase(apellido22)>0) {
	    	 System.out.println(nombre1+" "+apellido11+" "+apellido22);
             System.out.println(nombre+" "+apellido1+" "+apellido2);   
	     }
	    }}