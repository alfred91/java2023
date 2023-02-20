package ejercicio4;

public class TestLibreria {
    public static void main(String[] args) {
        Libreria libreria = new Libreria();

        Libro libro1 = new Libro("1234567890", "El Quijote", "Miguel de Cervantes", 1000);
        libreria.adquirir(libro1, 10.0);
        libreria.vender(libro1, 20.0);

        Libro libro2 = new Libro("0987654321", "Cien años de soledad", "Jose el tonto", 1400);
        libreria.adquirir(libro2, 11.0);
        libreria.vender(libro2, 21.0);
        
        Libro libro3 = new Libro("0987654321", "Cien años de soledad", "Jose el tonto", 1500);
        libreria.adquirir(libro2, 11.0);
        libreria.vender(libro2, 21.0);
        
        Libro libro4 = new Libro("0987654321", "Cien años de soledad", "Jose el tonto", 1600);
        libreria.adquirir(libro2, 11.0);
        libreria.vender(libro2, 21.0);
        
        Libro libro5 = new Libro("0987654321", "Cien años de soledad", "Jose el tonto", 1700);
        libreria.adquirir(libro2, 11.0);
        libreria.vender(libro2, 21.0);
        
        Libro libro6 = new Libro("0987654321", "Cien años de soledad", "Jose el tonto", 1100);
        libreria.adquirir(libro2, 11.0);
        libreria.vender(libro2, 21.0);
        
        Libro libro7 = new Libro("0987654321", "Cien años de soledad", "Jose el tonto", 1200);
        libreria.adquirir(libro2, 11.0);
        libreria.vender(libro2, 21.0);
        
        Libro libro8 = new Libro("0987654321", "Cien años de soledad", "Jose el tonto", 1300);
        libreria.adquirir(libro2, 11.0);
        libreria.vender(libro2, 21.0);
        
        Libro libro9 = new Libro("0987654321", "Cien años de soledad", "Jose el tonto", 1800);
        libreria.adquirir(libro2, 11.0);
        libreria.vender(libro2, 21.0);
        
        Libro libro10 = new Libro("0987654321", "Cien años de soledad", "Jose el tonto", 1050);
        libreria.adquirir(libro2, 11.0);
        libreria.vender(libro2, 21.0);
    }
}