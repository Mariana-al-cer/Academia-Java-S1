package Vitaminas;

public class Vitaminas {

    public String nombre;
    public String clasificacion;

    public void informacionVitamina() {
        System.out.println("Nombre: " + nombre );
        System.out.println("Clasificacion: " + clasificacion);
    };

    public void funcionVitamina() {
        System.out.println("""
                Descripcion general de las vitaminas:
                  Las vitaminas son un grupo de sustancias necesarias
                para el funcionamiento celular, el crecimiento y el desarrollo
                
                """);
    };



}
