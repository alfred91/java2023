package ejercicios;

public class EsMayor {

	public static int mayor(int x, int y, int z) {
	int max=0;
	
	if(x > y && x > z)
			max =x;
	else if (z>y)
			max=z;
	else 	max =y;

	return	max;
	}
}