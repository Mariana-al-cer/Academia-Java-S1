import MutacionesTodas.*;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner peticion = new Scanner(System.in);
        Integer opcion = null;
        boolean salir = false;

        do {
            System.out.println("--------------------------------------------------------");
            System.out.println("Elija la opción que desee consultar con respecto a las mutaciones genéticas    : ");
            System.out.println("""
                    1. Deleción
                    2. Inversión
                    3. Duplicación  
                    4. Translocación
                    5. Salir del programa
                    
                    """);
            try {

                System.out.println("Por favor, introduzca la opción deseada: ");
                opcion = peticion.nextInt(); //Aqui se evalua si la opcion introducida es correcta

                if (opcion < 1 || opcion > 5) {
                    System.out.println("La opción introducida no es correcta. Intente de nuevo.");
                } else {

                    switch (opcion) {
                        case 1:
                            // Crear la dependencia
                            VariacionGenetica delecion = new Delecion("Deleción");
                            // Inyectar la dependencia en el servicio
                            InyeccionVariacionGenetica inyeccion = new InyeccionVariacionGenetica(delecion);
                            // Usar el servicio
                            inyeccion.mostrarInformacion();
                            break;
                        case 2:
                            VariacionGenetica inversion = new Inversion("Inversión");
                            inyeccion = new InyeccionVariacionGenetica(inversion);
                            inyeccion.mostrarInformacion();
                            break;

                        case 3:
                            VariacionGenetica duplicacion = new Duplicacion("Duplicación");
                            inyeccion = new InyeccionVariacionGenetica(duplicacion);
                            inyeccion.mostrarInformacion();
                            break;

                        case 4:
                            VariacionGenetica translocacion = new Translocacion("Translocación");
                            inyeccion = new InyeccionVariacionGenetica(translocacion);
                            inyeccion.mostrarInformacion();
                            break;

                        case 5:
                            salir = true;
                            System.out.println("Gracias por usar el programa");
                            break;
                    }
                }
            } catch (InputMismatchException e) {
                // Manejo de la excepción
                System.out.println("Error: Debe introducir un número válido.");
                peticion.next(); // Limpiar el buffer del Scanner
            }
        } while (!salir);

        peticion.close(); // Cerrar el Scanner
    }
}











