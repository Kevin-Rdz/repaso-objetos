package uaslp.objetos.escuela;

import java.util.List;

public class EvaluadorDePromedios {
    private double promedio;
    private double sum;
    public double evalua(List<Double> calificaciones){
        sum = calificaciones.stream().reduce(0.0, Double::sum);
        promedio = sum / calificaciones.size();
        return promedio;
    }
}
