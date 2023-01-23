package cursoJava;

public class Arrays_3 {

	public static void main(String[] args) {
	
		int[] matriz_random=new int[150];
		
		for (int i=0;i<matriz_random.length;i++) {
			
			matriz_random[i]=(int)Math.round(Math.random()*150);
		}
for(int i=0;i<matriz_random.length;i++) {
	
	System.out.print(matriz_random[i]+" ");
}
	}

}