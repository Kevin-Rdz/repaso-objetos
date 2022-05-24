package uaslp.objetos.figuras;

public class Cuadrado implements Figura {
    private double lado;
    private double area;
    private static final String name = "Cuadrado";

    public Cuadrado(double lado){
        this.lado = lado;
    }
    public Cuadrado() {
    }

    public double getArea(){
        if(lado <= 0){
            throw new LadoNoProvistoException();
        }
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
