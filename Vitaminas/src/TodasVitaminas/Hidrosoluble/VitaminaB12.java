package TodasVitaminas.Hidrosoluble;

import Vitaminas.Vitaminas;

public class VitaminaB12 extends Vitaminas {
    String enfermedadRelacionada;

    public VitaminaB12() {
        nombre = "Vitamina B12";
        clasificacion = "Hidrosoluble";
        enfermedadRelacionada = "Enfermedad sistemática combinada: anemia megaloblástica y " +
                "degeneración de los cordones medulares";
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
