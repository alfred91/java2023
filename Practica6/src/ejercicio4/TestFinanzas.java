package ejercicio4;

public class TestFinanzas {
	
	public static void main(String[] args) {

	Finanzas f1=new Finanzas("dolares", 100);
	Finanzas f2=new Finanzas("euros",15);
		
		System.out.print(f1+" : ");
		System.out.println(f1.finanzas());
		
		System.out.print(f2+" : ");
		System.out.println(f2.finanzas());
		
	}

}