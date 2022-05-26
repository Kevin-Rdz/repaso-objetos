package uaslp.objetos.escuela;

import java.util.List;

public class EvaluadorDePromedios {

    public double evalua(List<Double> calificaciones){
        double lista = calificaciones.stream().reduce(0.0, Double::sum);

        return lista / calificaciones.size();
    }
}