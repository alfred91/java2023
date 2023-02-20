package ejercicio1;

import java.util.Objects;
import java.util.Scanner;

public class Persona {
    private String nombre;
    private int edad;
    private String dni;
    private char sexo;
    private double peso;
    private double altura;

    public Persona() {
        this.nombre = "";
        this.edad = 0;
        this.dni = "";
        this.sexo = 'H';
        this.peso = 0.0;
        this.altura = 0.0;
    }

    public Persona(String nombre, int edad, String dni, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
        this.sexo = sexo;
        this.peso = 0.0;
        this.altura = 0.0;
    }

    public Persona(String nombre, int edad, String dni, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public Persona(Persona persona) {
        this.nombre = persona.nombre;
        this.edad = persona.edad;
        this.dni = persona.dni;
        this.sexo = persona.sexo;
        this.peso = persona.peso;
        this.altura = persona.altura;
    }

    public int calcularIMC() {
        double imc = this.peso / (this.altura * this.altura);
        if (imc < 20) {
            return 1;
        } else if (imc >= 20 && imc <= 25) {
            return 0;
        } else {
            return -1;
        }
    }

    public boolean esMayordeEdad() {
        return this.edad >= 18;
    }

    public String toString() {
        return "Nombre: " + this.nombre + "\n" +
                "Edad: " + this.edad + "\n" +
                "DNI: " + this.dni + "\n" +
                "Sexo: " + this.sexo + "\n" +
                "Peso: " + this.peso + "\n" +
                "Altura: " + this.altura;
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("DNI: " + dni);
        System.out.println("Sexo: " + sexo);
        System.out.println("Peso: " + peso);
        System.out.println("Altura: " + altura);
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
	public int hashCode() {
		return Objects.hash(altura, edad, nombre, peso, sexo);
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
		return Double.doubleToLongBits(altura) == Double.doubleToLongBits(other.altura) && edad == other.edad
				&& Objects.equals(nombre, other.nombre)
				&& Double.doubleToLongBits(peso) == Double.doubleToLongBits(other.peso) && sexo == other.sexo;
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

    public boolean equals(Persona persona) {
        return this.dni.equals(persona.dni);
    }
}