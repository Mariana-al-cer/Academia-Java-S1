package TodasVitaminas.Hidrosoluble;

import Vitaminas.Vitaminas;

public class VitaminaB5 extends Vitaminas {
    String enfermedadRelacionada;

    public VitaminaB5() {
        nombre = "Vitamina B5";
        clasificacion = "Hidrosoluble";
        enfermedadRelacionada = "Fatiga y dermatitis";
    }

    public void mostrarEnfermedadRelacionada() {
        System.out.println("La deficiencia de " + nombre + " puede causar: " + enfermedadRelacionada);
    }

    @Override
    public void funcionVitamina() {
        System.out.println( "Funciones principales de la " + nombre + " : " +
                """
                Ayuda al organismo a producir energía, 
                Incorporado en la coenzima A.
                
                """);
    }
}
