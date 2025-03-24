package TodasVitaminas.Liposolubles;

import Vitaminas.Vitaminas;

public class VitaminaA extends Vitaminas {
    String enfermedadRelacionada;

    public VitaminaA() {
        nombre = "Vitamina A";
        clasificacion = "Liposoluble";
        enfermedadRelacionada = """
                Ceguera nocturna, xeroftalmia, ceguera. 
                Metaplasia escamosa. 
                Vulnerabilidad a las infecciones, sobre todo al sarampión.""";
    }

    public void mostrarEnfermedadRelacionada() {
        System.out.println("La deficiencia de " + nombre + " puede causar: " + enfermedadRelacionada);
    }

    @Override
    public void funcionVitamina() {
        System.out.println( "Funciones principales de la " + nombre + " : " +
                """
                Un componente de los pigmentos visuales.
                Mantenimiento de epitelios especializados. 
                Mantenimiento de resistencia a la infección.
                
                """);
    }
}
