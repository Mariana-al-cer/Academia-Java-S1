import TodosLosTranstornos.*;
import TodosLosTranstornos.Transtorno;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Principal {

    public static void main(String[] args) {
        Scanner peticion = new Scanner(System.in);
        Integer opcion = null;
        boolean salir = false;

        do {
            System.out.println("--------------------------------------------------------");
            System.out.println("Elija la opción que desee consultar con respecto a los transtornos del sueño    : ");
            System.out.println("""
                    1. ¿Qué son los transtornos del sueño?
                    2. Insomnio
                    3. Narcolepsia
                    4. Parasomnia
                    5. Transtorno del sueño relacionado con la respiración
                    6. Hipersomnia
                    7. Salir
                    
                    """);
            try {

                System.out.println("Por favor, introduzca la opción deseada: ");
                opcion = peticion.nextInt(); //Aqui se evalua si la opcion introducida es correcta

                if (opcion < 1 || opcion > 7) {
                    System.out.println("La opción introducida no es correcta. Intente de nuevo.");
                } else {

                    switch (opcion) {
                        case 1:
                            Transtorno transtorno = new TranstornoS();
                            transtorno.describirTranstorno();
                            break;
                        case 2:
                            Transtorno insomnio = new Insomnio();
                            insomnio.describirTranstorno();
                            insomnio.sintomas();
                            insomnio.tratamiento();
                            break;

                        case 3:
                            Transtorno narcolepsia = new Narcolepsia();
                            narcolepsia.describirTranstorno();
                            narcolepsia.sintomas();
                            narcolepsia.tratamiento();
                            break;

                        case 4:
                            Transtorno parasomnia = new Parasomnia();
                            parasomnia.describirTranstorno();
                            parasomnia.sintomas();
                            parasomnia.tratamiento();
                            break;

                        case 5:
                            Transtorno respiratorio = new Respiratorio();
                            respiratorio.describirTranstorno();
                            respiratorio.sintomas();
                            respiratorio.tratamiento();
                            break;

                        case 6:
                            Transtorno hipersomnia = new Hipersomnia();
                            hipersomnia.describirTranstorno();
                            hipersomnia.sintomas();
                            hipersomnia.tratamiento();
                            break;

                        case 7:
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



