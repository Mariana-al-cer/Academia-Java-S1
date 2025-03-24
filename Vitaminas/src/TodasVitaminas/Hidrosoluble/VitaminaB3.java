package TodasVitaminas.Hidrosoluble;
import Vitaminas.Vitaminas;

public class VitaminaB3 extends Vitaminas {
    public String enfermedadRelacionada;

    public VitaminaB3() {
        nombre = "Vitamina B3";
        clasificacion = "Hidrosoluble";
        enfermedadRelacionada = "Demencia, dermatitis, diarrea.";
    }

    public void mostrarEnfermedadRelacionada() {
        System.out.println("La deficiencia de " + nombre + " puede causar: " + enfermedadRelacionada);
    }

    @Override
    public void funcionVitamina() {
        System.out.println( "Funciones principales de la " + nombre + " : " +
                """
                Participa en diversas reacciones de oxidación-reducción
                
                """);

    }
}
