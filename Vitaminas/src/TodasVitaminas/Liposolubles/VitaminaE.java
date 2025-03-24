package TodasVitaminas.Liposolubles;

import Vitaminas.Vitaminas;

public class VitaminaE extends Vitaminas {
    String enfermedadRelacionada;

    public VitaminaE() {
        nombre = "Vitamina E";
        clasificacion = "Liposoluble";
        enfermedadRelacionada = "Anemia hemolítica leve y déficits neurológicos inespecíficos";
    }

    public void mostrarEnfermedadRelacionada() {
        System.out.println("La deficiencia de " + nombre + " puede causar: " + enfermedadRelacionada);
    }

    @Override
    public void funcionVitamina() {
        System.out.println( "Funciones principales de la " + nombre + " : " +
                """
                Antioxidante que elimina los radicales libres 
                
                """);
    }
}
