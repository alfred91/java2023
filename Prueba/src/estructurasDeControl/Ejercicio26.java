package estructurasDeControl;
import java.util.Scanner;

public class Ejercicio26 {
public static void fecha() {
int day=0;
int month=0;
int year=0;
Scanner sc=new Scanner(System.in);

System.out.println("Dime el año: ");
 year=sc.nextInt();
 System.out.println("Dime el dia: ");
 day=sc.nextInt();
 System.out.println("Dime el mes: ");
 month=sc.nextInt();
 sc.close();
 
 if (day>=1&&day<=31&&month>=1&&month<=12&&year>1&&year<3000) {

  if(day==31 && month==12) 
  {
	day=1;
	month=0;
	year=year+1;
	}

  else if(day==30 & month==4||month==6||month==9||month==11) 
  {
	month=month+1;
	day=1;
  }
  if (day<30 && month<12&&month!=2)
	 {
		day=day+1;}
	 }
  if (day==29 && month==2);{
	day=1;
	month=month+1;
	}

System.out.println("Dia "+day);
System.out.println("Mes "+month);
System.out.println("Año "+year);
}
	public static void main(String[] args) {
fecha();
	}
}