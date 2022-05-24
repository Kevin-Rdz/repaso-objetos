package uaslp.objetos.figuras;

public class PoligonoRegular implements Figura {
    private double lado;
    private double area;
    private int numeroDeLados;
    private static final String name = "Poligono Regular";

    public PoligonoRegular(int numeroDeLados) {
        if(numeroDeLados < 5){
            throw new NumeroInvalidoDeLados("Número de lados válido a partir de 5");
        }else{
            this.numeroDeLados = numeroDeLados;
        }
    }

    public double getArea() {
        double perimetro;
        double apotema;
        perimetro = numeroDeLados*lado;
        apotema = (lado/2)/Math.tan(Math.toRadians((double)360/numeroDeLados)/2);
        area = perimetro*apotema/2;
        return area;
    }

    public PoligonoRegular(int numeroDeLados,double lado) {
        if(numeroDeLados < 5){
            throw new NumeroInvalidoDeLados("Número de lados válido a partir de 5");
        }else{
            this.numeroDeLados = numeroDeLados;
            this.lado=lado;
        }
    }

    public void setLado(double lado) {
        this.lado=lado;
    }

    public double getLado() {
        return lado;
    }

    public String getName(){
        return name;
    }

}
