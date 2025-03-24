package TodasVitaminas.Hidrosoluble;

import Vitaminas.Vitaminas;

public class VitaminaB7 extends Vitaminas {
    String enfermedadRelacionada;

    public VitaminaB7() {
        nombre = "Vitamina B7";
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
                Ayuda al organismo a metabolizar las proteínas, los hidratos de carbono y 
                las grasas; también contribuye a la producción de queratina, que 
                fortalece el cabello, la piel y las uñas. 
                Cofactor en las reacciones de carboxilación.
                
                """);
    }
}
