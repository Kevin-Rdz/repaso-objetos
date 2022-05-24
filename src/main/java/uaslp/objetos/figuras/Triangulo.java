package uaslp.objetos.figuras;

public class Triangulo implements Figura{
    private double base;
    private double area;
    private double altura;
    private String name;
    private String description;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
        this.description = "Cualquier triangulo";
        this.name = "Triangulo";
    }

    public Triangulo(){
        base=10;
        altura=3;
        this.description = "Cualquier triangulo";
    }

    public void setAltura(double altura) {
        this.altura=altura;
    }

    public void setBase(double base) {
        this.base=base;
    }

    public double getArea() {
        area=(base*altura)/2;
        return area;
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    public String getDescription(){
        return description;
    }

    public String getName(){
        return name;
    }
}
