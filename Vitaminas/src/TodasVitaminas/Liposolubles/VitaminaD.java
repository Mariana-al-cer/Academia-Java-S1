package TodasVitaminas.Liposolubles;

import Vitaminas.Vitaminas;

public class VitaminaD extends Vitaminas {
    String enfermedadRelacionada;

    public VitaminaD() {
        nombre = "Vitamina D";
        clasificacion = "Liposoluble";
        enfermedadRelacionada = """
                Raquitismo en los niños. 
                Osteomalacia en los adultos.""";
    }

    public void mostrarEnfermedadRelacionada() {
        System.out.println("La deficiencia de " + nombre + " puede causar: " + enfermedadRelacionada);
    }

    @Override
    public void funcionVitamina() {
        System.out.println( "Funciones principales de la " + nombre + " : " +
                """
                Facilita la absorción intestinal de calcio y fósforo, 
                así como la mineralización del hueso.
                
                """);
    }
}
