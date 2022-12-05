package estructurasDeControl;
import java.util.Scanner;

public class Ejercicio12 {

public static void main(String[] args) {
String opcion;

do	{
System.out.print("Introduce numero del 1 al 5000 para convertirlo en romano: ");
Scanner sc = new Scanner(System.in);
int numero = sc.nextInt();

if (numero>1 && numero<5000){

int w = numero/1000;
int aux2= numero/100;
int x= aux2%10;
int aux = numero%100;
int y=aux/10;
int z=numero%10;

if (w>0 && w<4) {
for(int i=1;i<=w;i++){
System.out.print('M');
}
}else if (w==4){
System.out.print("IVm");
}else if(w==5){
System.out.print("Vm");
}

if (x>0 && x<4){
for(int i=1;i<=x;i++){
System.out.print("C");
}
}else if (x==4){
System.out.print("CD");
}else if (x>=5 && x<6){
System.out.print("D");
}else if(x>=6 && x<9){
System.out.print("D");
for(int i=6;i<=x;i++){
System.out.print("C");
}
}else if(x==9){
System.out.print("CM");
}

if (y>0 && y<4){
for(int i = 1;i<=y;i++){
System.out.print("X");
}
}else if(y==4){
System.out.print("XL");
}else if(y>=5 && y<9){
System.out.print("L");
for(int j=6; j<=y; j++){
System.out.print("X");
}
}else if(y==9){
System.out.print("XC");
}

if (z>0 && z<4){
for (int i=1;i<=z;i++){
System.out.print("I");
}
}else if (z==4){
System.out.print("IV");
}else if (z>=5 && z<9){
int tem= z%5;
System.out.print("V");
for(int i=1;i<=tem;i++){
System.out.print("I");
}
}else if (z==9){
System.out.print("IX");
}
}
System.out.println("\n Quiere ingresar otro numero? s/n");
opcion = sc.next();
	}
	while("s".equals(opcion));
	}
}