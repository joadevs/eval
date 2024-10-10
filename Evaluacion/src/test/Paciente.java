package test;

public class Paciente {
    private String nombre;
    private String apellido;
    private float estatura;
    private float peso;

    public Paciente(String nombre, String apellido, float estatura, float peso) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.estatura = estatura;
        this.peso = peso;
    }

    public String traerNombreCompleto() {
        return nombre + " " + apellido;
    }

    public float getEstatura() {
        return estatura;
    }

    public void setEstatura(float estatura) {
        this.estatura = estatura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }
}
