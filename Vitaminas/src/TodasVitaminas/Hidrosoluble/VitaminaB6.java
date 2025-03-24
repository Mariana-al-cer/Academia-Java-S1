package TodasVitaminas.Hidrosoluble;
import Vitaminas.Vitaminas;
public class VitaminaB6 extends Vitaminas {
    String enfermedadRelacionada;

    public VitaminaB6() {
        nombre = "Vitamina B6";
        clasificacion = "Hidrosoluble";
        enfermedadRelacionada = "Depresión, anemia, dermatitis, neuropatía periférica";
    }

    public void mostrarEnfermedadRelacionada() {
        System.out.println("La deficiencia de " + nombre + " puede causar: " + enfermedadRelacionada);
    }

    @Override
    public void funcionVitamina() {
        System.out.println( "Funciones principales de la " + nombre + " : " +
                """
                Ayuda a formar glóbulos rojos, 
                Reacciones de transferencia de grupos aminos.
                
                """);
    }
}
