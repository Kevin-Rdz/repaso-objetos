package uaslp.objetos.figuras;

public class PoligonoRegular {
    private double lado;
    private double area;
    private int numeroDeLados;

    public PoligonoRegular(int numeroDeLados) {
        this.numeroDeLados=numeroDeLados;
    }

    public double getArea() {
        double perimetro;
        double apotema;
        perimetro=numeroDeLados*lado;
        apotema=(lado/2)/Math.tan(Math.toRadians((double)360/numeroDeLados)/2);
        area=perimetro*apotema/2;
        return area;
    }

    public PoligonoRegular(int numeroDeLados,double lado) {
        this.numeroDeLados=numeroDeLados;
        this.lado=lado;
    }

    public void setLado(double lado) {
        this.lado=lado;
    }

    public double getLado() {
        return lado;
    }
}
