package practica2;
public class Ejercicio20 {

public static void main(String[] args) {

double a = 1, b = 1, d = 1;

var uno= 5*Math.pow(a, 2)*Math.pow(b, 3) + ( Math.sqrt(Math.pow(a, 2)+Math.pow(b, 2)));
var dos=Math.sqrt( 4 * a * Math.pow(b, 2)) + Math.pow((a+b), 2) ;
var tres= (Math.pow(a, 3)*b)/(2*a*Math.pow(b, 2))-Math.sqrt(12*Math.pow(d, 4));

System.out.println(uno);
System.out.println(dos);
System.out.println(tres);
	}
}