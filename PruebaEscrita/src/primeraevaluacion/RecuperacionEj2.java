package primeraevaluacion;

public class RecuperacionEj2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String palabras = "no entiondo nada";
	
		
		StringBuffer quitavocal = new StringBuffer();
	for(int i=0; i<palabras.length();i++) {
		if ((palabras.charAt(i) != 'o')) {
			quitavocal.append(palabras.charAt(i));
		}
		
	}
		
	System.out.println(quitavocal);
	}

	
}