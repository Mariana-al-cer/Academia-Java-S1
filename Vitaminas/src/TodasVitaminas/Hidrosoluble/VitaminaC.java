package TodasVitaminas.Hidrosoluble;

import Vitaminas.Vitaminas;

public class VitaminaC extends Vitaminas {
    public String enfermedadRelacionada;

    public VitaminaC () {
        nombre = "Vitamina C";
        clasificacion = "Hidrosoluble";
        enfermedadRelacionada = "Escorbuto";
    }

    public void mostrarEnfermedadRelacionada() {
        System.out.println("La deficiencia de " + nombre + " puede causar: " + enfermedadRelacionada);
    }

    @Override
    public void funcionVitamina() {
        System.out.println( "Funciones principales de la " + nombre + " : " +
                """
                Se encuentra involucrada en reacciones redox y
                en la hidorxilación de colágeno
                
                """);

    }

}
