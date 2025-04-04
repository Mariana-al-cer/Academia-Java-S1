package TodasVitaminas.Hidrosoluble;
import Vitaminas.Vitaminas;

public class VitaminaB9 extends Vitaminas {
    String enfermedadRelacionada;

    public VitaminaB9() {
        nombre = "Vitamina B9";
        clasificacion = "Hidrosoluble";
        enfermedadRelacionada = "Anemia megaloblástica, defectos del tubo neural";
    }

    public void mostrarEnfermedadRelacionada() {
        System.out.println("La deficiencia de " + nombre + " puede causar: " + enfermedadRelacionada);
    }

    @Override
    public void funcionVitamina() {
        System.out.println( "Funciones principales de la " + nombre + " : " +
                """
                Esencial para la transferencia y uso de unidades 
                de un carbono en la síntesis del ADN.
                
                """);
    }
}
