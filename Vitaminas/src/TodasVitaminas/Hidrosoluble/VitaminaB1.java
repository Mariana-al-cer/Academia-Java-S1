package TodasVitaminas.Hidrosoluble;

import Vitaminas.Vitaminas;

public class VitaminaB1 extends Vitaminas {
    public String enfermedadRelacionada;

    public VitaminaB1 () {
        nombre = "Vitamina B1";
        clasificacion = "Hidrosoluble";
        enfermedadRelacionada = "Síndrome de Wernicke, síndrome de Korsakoff";
    }

    public void mostrarEnfermedadRelacionada() {
        System.out.println("La deficiencia de " + nombre + " puede causar: " + enfermedadRelacionada);
    }

    @Override
    public void funcionVitamina() {
        System.out.println( "Funciones principales de la " + nombre + " : " +
                """
                Descompone el azúcar en sangre
                Es coenzima en las reacciones de descarboxilación.
                
                """);

    }
}
