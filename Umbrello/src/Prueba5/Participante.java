package Prueba5;

public class Participante {
    private String nombre;
    private String nif;
    private String telefono;
    private String email;
    private int edad;
    private String numeroTarjeta;
    private String nick;
    private String password;
    private double saldo;
    private boolean aceptaPolitica;

    public Participante(String nombre, String nif, String telefono, String email, int edad, String numeroTarjeta, String nick, String password) {
        this.nombre = nombre;
        this.nif = nif;
        this.telefono = telefono;
        this.email = email;
        this.edad = edad;
        this.numeroTarjeta = numeroTarjeta;
        this.nick = nick;
        this.password = password;
        this.saldo = 0;
        this.aceptaPolitica = false;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNif() {
        return nif;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getEmail() {
        return email;
    }

    public int getEdad() {
        return edad;
    }

    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public String getNick() {
        return nick;
    }

    public String getPassword() {
        return password;
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean isAceptaPolitica() {
        return aceptaPolitica;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setAceptaPolitica(boolean aceptaPolitica) {
        this.aceptaPolitica = aceptaPolitica;
    }
}