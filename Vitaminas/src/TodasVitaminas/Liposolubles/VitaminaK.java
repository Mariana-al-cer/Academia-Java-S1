package TodasVitaminas.Liposolubles;
import Vitaminas.Vitaminas;

public class VitaminaK extends Vitaminas {
    String enfermedadRelacionada;

    public VitaminaK() {
        nombre = "Vitamina K";
        clasificacion = "Liposoluble";
        enfermedadRelacionada = "Diátesis hemorrágica";
    }

    public void mostrarEnfermedadRelacionada() {
        System.out.println("La deficiencia de " + nombre + " puede causar: " + enfermedadRelacionada);
    }

    @Override
    public void funcionVitamina() {
        System.out.println( "Funciones principales de la " + nombre + " : " +
                """
                Actúa como cofactor en la carboxilación hepática de procoagulantes
                
                """);
    }
}
