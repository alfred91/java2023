package empleado;

public class Empleado {
	
private String nombre;
private String apellidos;
private int edad;
private String email;
private double salarioMensualBruto;
private double irpf;
private double seguridadSocial;
private double salarioMensualNeto;
private String departamento;


public Empleado(String nombre, String apellidos, int edad, String email, double salarioMensualBruto, double irpf,
		double seguridadSocial, double salarioMensualNeto, String departamento) {
	
	super();
	this.nombre = nombre;
	this.apellidos = apellidos;
	this.edad = edad;
	this.email = email;
	this.salarioMensualBruto = salarioMensualBruto;
	this.setSalarioMensualNeto(salarioMensualNeto);
	this.irpf = irpf;
	this.seguridadSocial = seguridadSocial;
	this.departamento = departamento;
}



public String getNombre() {
	return nombre;
}


public void setNombre(String nombre) {
	this.nombre = nombre;
}



public String getApellidos() {
	return apellidos;
}


public void setApellidos(String apellidos) {
	this.apellidos = apellidos;
}


public int getEdad() {
	return edad;
}


public void setEdad(int edad) {
	this.edad = edad;
}


public String getEmail() {
	return email;
}


public void setEmail(String email) {
	this.email = email;
}


public double getSalarioMensualBruto() {
	return salarioMensualBruto;
}


public void setSalarioMensualBruto(double salarioMensualBruto) {
	this.salarioMensualBruto = salarioMensualBruto;
}



public double getIrpf() {
	return irpf;
}


public void setIrpf(double irpf) {
	this.irpf = irpf;
}


public double getSeguridadSocial() {
	return seguridadSocial;
}


public void setSeguridadSocial(double seguridadSocial) {
	this.seguridadSocial = seguridadSocial;
}

public double getSalarioMensualNeto() {
	return salarioMensualNeto;
}



public void setSalarioMensualNeto(double salarioMensualNeto) {
	this.salarioMensualNeto = salarioMensualNeto;
}


public String getDepartamento() {
	return departamento;
}


public void setDepartamento(String departamento) {
	this.departamento = departamento;
}


public Empleado() {
	
	super();
	this.nombre="NPC";
	this.apellidos="Default";
	this.edad=33;
	this.email="joselitoKiller@protonmail.com";
	this.salarioMensualBruto=2500;
	this.irpf=0.19;
	this.seguridadSocial=0.05;
	this.salarioMensualNeto=this.salarioMensualBruto-((this.salarioMensualBruto*this.irpf)-(this.salarioMensualBruto*this.seguridadSocial));
	this.departamento="Probador de camas";
	}



@Override
public String toString() {
	StringBuilder builder = new StringBuilder();
	builder.append("Empleado [nombre=");
	builder.append(nombre);
	builder.append(", apellidos=");
	builder.append(apellidos);
	builder.append(", edad=");
	builder.append(edad);
	builder.append(", email=");
	builder.append(email);
	builder.append(", salarioMensualBruto=");
	builder.append(salarioMensualBruto);
	builder.append(", irpf=");
	builder.append(irpf);
	builder.append(", seguridadSocial=");
	builder.append(seguridadSocial);
	builder.append(", salarioMensualNeto=");
	builder.append(salarioMensualNeto);
	builder.append(", departamento=");
	builder.append(departamento);

	builder.append("]");
	return builder.toString();
}


}