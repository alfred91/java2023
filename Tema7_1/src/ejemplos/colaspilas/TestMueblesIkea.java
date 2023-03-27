package ejemplos.colaspilas;

public class TestMueblesIkea {

	public static void main(String[] args) {
		
		MueblesIkea muebles = new MueblesIkea(1);
		muebles.nuevo(new Mueble("Seflong","00033341","1000"));
		muebles.nuevo(new Mueble("Perska","00033342","2000"));
		
		System.out.println(muebles);
		System.out.println(muebles.verLoDeArriba());
		
		muebles.nuevo(new Mueble("Nordik","00033343","2000"));
		muebles.eliminar();
		System.out.println(muebles);

	}

}
