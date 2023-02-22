package ana;

public class Persona1 {
private int edad;
private boolean error;
 public Persona1( int edad, boolean error) {
	 this.edad=edad;
	 this.error=true;
	}
 public boolean Me() {
	 
if (edad>=18)
{error=false; return true;}
	else
	if (edad>=0 && edad<18){
		error=false; return false;	}
 else  return error;
 }
}