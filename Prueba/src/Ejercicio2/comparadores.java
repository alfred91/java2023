package Ejercicio2;

public class comparadores {

	public static void main(String[] args) {
	
int a=4, b=4,x=2,y=5;
boolean res;

System.out.println(a == b);
System.out.println(a != b);
System.out.println(a <= b);
 
if (a !=b) {
	System.out.println("No son iguales a y b");
	} else {
	System.out.println("Si son iguales a y b");
	}

res= (x>y && x>=y);
res= (x<y && x<=y);
res= (x<y || x!=y);
System.out.println(res);
	}

}
