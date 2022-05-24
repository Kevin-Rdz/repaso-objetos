package uaslp.objetos.escuela;

import java.time.LocalDate;
import java.util.SplittableRandom;

public class Alumno {
    private String name;
    private String claveDeCarrera;
    private String clave;
    private int anioDeIngreso;
    private LocalDate fechaNacimiento;

    public Alumno nombre( String name ){
        this.name = name;
        return this;
    }
    public Alumno clave(String clave){
        this.clave = clave;
        return this;
    }
    public Alumno claveDeCarrera(String claveDeCarrera){
        this.claveDeCarrera=claveDeCarrera;
        return this;
    }

    public static Alumno builder(){
        return new Alumno();
    }

    public String getNombre() {
        return name;
    }

    public String getClave() {
        return clave;
    }

    public String getClaveDeCarrera() {
        return claveDeCarrera;
    }

    public int getAnioDeIngreso() {
        return anioDeIngreso;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public Alumno anioDeIngreso(int anioDeIngreso){
        this.anioDeIngreso=anioDeIngreso;
        return this;
    }

    public Alumno build(){
        return this;
    }

    public Alumno fechaNacimiento(LocalDate fechaNacimiento){
        this.fechaNacimiento=fechaNacimiento;
        return this;
    }

}


