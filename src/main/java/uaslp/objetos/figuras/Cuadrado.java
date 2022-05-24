package uaslp.objetos.figuras;

public class Cuadrado implements Figura {
    private double lado;
    private double area;
    private static final String name = "Cuadrado";

    public Cuadrado(double lado){
        this.lado = lado;
    }
    public Cuadrado() {
        lado = 10;
    }

    public double getArea(){
        area = lado * lado;
        return area;
    }
    public double getLado(){
        return lado;
    }
    void setLado(double lado){
        this.lado = lado;
    }

    public String getName(){
        return name;
    }
}
