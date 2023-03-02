package ejercicio1;

public class Aplicacion {
	
    public static void main(String[] args) {
        Comercial comercial1 = new Comercial("Gines", 35, 1500, 300);
        Comercial comercial2 = new Comercial("Alfonso", 25, 1200, 150);
        Repartidor repartidor1 = new Repartidor("Rodrigo", 20, 900, "zona 1");
        Repartidor repartidor2 = new Repartidor("Ana", 28, 1100, "zona 3");
        
        System.out.println(comercial1);
        System.out.println(comercial2);
        System.out.println(repartidor1);
        System.out.println(repartidor2);
        
        if (comercial1.plus()) {
            System.out.println("A " + comercial1.getNombre() + " se ha aplicado el plus");
        }
        if (comercial2.plus()) {
            System.out.println("A " + comercial2.getNombre() + " se ha aplicado el plus");
        }
        if (repartidor1.plus()) {
            System.out.println("A " + repartidor1.getNombre() + " se ha aplicado el plus");
        }
        if (repartidor2.plus()) {
            System.out.println("A " + repartidor2.getNombre() + " se ha aplicado el plus");
        }
        
        System.out.println(comercial1);
        System.out.println(comercial2);
        System.out.println(repartidor1);
        System.out.println(repartidor2);
    }
}