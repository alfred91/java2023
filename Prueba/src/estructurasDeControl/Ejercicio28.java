package estructurasDeControl;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Ejercicio28 {

	public static void main(String[] args) {
		 List<String> list = new ArrayList<>();
		 
		 scanner sc=new Scanner(System.in);
		 System.out.println("Introduce el nombre");
		 String name = input.nextLine();
	        list.add(nombre1);
	        list.add("US");
	        list.add("China");
	        list.add("Russia");
	        list.add("Australia");
	        System.out.println(list); 
	        list.sort(String::compareToIgnoreCase);
	        System.out.println("-----------Sorted List------------");
	        System.out.println(list);        
	}

}