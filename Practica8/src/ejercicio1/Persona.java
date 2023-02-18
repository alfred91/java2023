package ejercicio1;

import java.util.Objects;

public class Persona {
	
    private String nombre;
    private int edad;
    private String dni;
    private char sexo;
    private double peso;
    private double altura;

    // Constructor por defecto
    public Persona() {
        this.nombre = "Jose";
        this.edad = 30;
        this.dni = "123456789";
        this.sexo = 'H';
        this.peso = 100;
        this.altura = 200;
    }

    // Constructor con nombre, edad, dni, sexo y resto por defecto
    public Persona(String nombre, int edad, String dni, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
        this.sexo = sexo;
        this.peso = 0;
        this.altura = 0;
    }

    // Constructor con todos los miembros como parámetros
    public Persona(String nombre, int edad, String dni, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    // Constructor copia
    public Persona(Persona persona) {
        this.nombre = persona.nombre;
        this.edad = persona.edad;
        this.dni = persona.dni;
        this.sexo = persona.sexo;
        this.peso = persona.peso;
        this.altura = persona.altura;
    }

    // Métodos para obtener y establecer los valores de los miembros
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDni() {
        return dni;
    }

    // El DNI no se puede cambiar
    public void setDni(String dni) {
        this.dni = dni;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    // Método para calcular el índice de masa corporal (IMC)
    public int calcularIMC() {
        double imc = peso / (altura * altura);
        if (imc < 20) {
            return 1; // Peso ideal
        } else if (imc >= 20 && imc <= 25) {
            return 0; // Por debajo del peso ideal
        } else {
            return -1; // Sobrepeso
        }
    }

    // Método para comprobar si la persona es mayor de edad
    public boolean esMayorDeEdad() {
        return edad >= 18;
    }

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Persona [nombre=");
		builder.append(nombre);
		builder.append(", edad=");
		builder.append(edad);
		builder.append(", dni=");
		builder.append(dni);
		builder.append(", sexo=");
		builder.append(sexo);
		builder.append(", peso=");
		builder.append(peso);
		builder.append(", altura=");
		builder.append(altura);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public int hashCode() {
		return Objects.hash(dni);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		return Objects.equals(dni, other.dni);
	}
}