package ana;

public class Tresbooleanos {
public static int metodo(boolean a, boolean b, boolean c) {
	int ret=0;
	if (a && b) {
		ret=1;
	}
	else if (c) {
		ret=2;
	}
	return ret;
	}
}