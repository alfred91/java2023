package enemigo;

public class Aplicacion {

	public static void main(String[] args) {
Enemigo e1=new Enemigo("Boko","Cerdo",100);
Enemigo e2=new Enemigo("Izalfos","Lagarto",120);

for(int i=1;i<7; i++)
{
	e1.subirNivel();
}
for(int i=0;i<3; i++)
{
	e2.subirNivel();
}
e1.recibirdano(400);
e2.recibirdano(150);

System.out.println(e1);
System.out.println(e2);
	}

}