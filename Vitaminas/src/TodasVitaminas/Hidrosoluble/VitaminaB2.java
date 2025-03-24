package TodasVitaminas.Hidrosoluble;

import Vitaminas.Vitaminas;

public class VitaminaB2 extends Vitaminas {
    public String enfermedadRelacionada;

    public VitaminaB2 () {
        nombre = "Vitamina B2";
        clasificacion = "Hidrosoluble";
        enfermedadRelacionada = "Dermatitis, vascularización corneal";
    }

    public void mostrarEnfermedadRelacionada() {
        System.out.println("La deficiencia de " + nombre + " puede causar: " + enfermedadRelacionada);
    }

    @Override
    public void funcionVitamina() {
        System.out.println( "Funciones principales de la " + nombre + " : " +
                """
                Ayuda a las células a crecer, desarrollarse y metabolizar 
                cofactores de numerosas enzimas en el metabolismo intermedio
                
                """);

    }
}
