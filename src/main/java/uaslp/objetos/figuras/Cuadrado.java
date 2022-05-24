package uaslp.objetos.figuras;

public class Cuadrado {
    private double lado;
    private double area;

    public Cuadrado(double lado){
        this.lado = lado;
    }
    public Cuadrado() {
        lado=10;
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
}
