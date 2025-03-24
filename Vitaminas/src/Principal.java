import TodasVitaminas.Hidrosoluble.*;
import TodasVitaminas.Liposolubles.*;
import Vitaminas.Vitaminas;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner peticion = new Scanner(System.in);
        Integer opcion = null;
        boolean salir = false;

        do {
            System.out.println("--------------------------------------------------------");
            System.out.println("Elija la opción que desee consultar con respecto a las vitaminas");
            System.out.println("""
                    1. ¿Qué son las vitaminas?
                    2. Vitamina B1
                    3. Vitamina B2
                    4. Vitamina B3
                    5. Vitamina B5
                    6. Vitamina B6
                    7. Vitamina B7
                    8. Vitamina B9
                    9. Vitamina C
                    10. Vitamina D
                    11. Vitamina E
                    12. Vitamina K
                    13. Salir
                    """);

            try {
                System.out.println("Por favor, introduzca la opcion deseada: ");
                opcion = peticion.nextInt();


                if (opcion < 1 || opcion > 13) {
                    System.out.println("La opcion introducida no es correcta");

                } else {

                    switch (opcion) {
                        case 1:
                            Vitaminas vitaminas = new Vitaminas();
                            vitaminas.funcionVitamina();
                            break;
                        case 2:
                            Vitaminas vitaminaB1 = new VitaminaB1();
                            vitaminaB1.informacionVitamina();
                            ((VitaminaB1) vitaminaB1).mostrarEnfermedadRelacionada();
                            vitaminaB1.funcionVitamina();
                            break;

                        case 3:
                            Vitaminas vitaminaB2 = new VitaminaB2();
                            vitaminaB2.informacionVitamina();
                            ((VitaminaB2) vitaminaB2).mostrarEnfermedadRelacionada();
                            vitaminaB2.funcionVitamina();
                            break;

                        case 4:
                            Vitaminas vitaminaB3 = new VitaminaB3();
                            vitaminaB3.informacionVitamina();
                            ((VitaminaB3) vitaminaB3).mostrarEnfermedadRelacionada();
                            vitaminaB3.funcionVitamina();
                            break;

                        case 5:
                            Vitaminas vitaminaB5 = new VitaminaB5();
                            vitaminaB5.informacionVitamina();
                            ((VitaminaB5) vitaminaB5).mostrarEnfermedadRelacionada();
                            vitaminaB5.funcionVitamina();
                            break;

                        case 6:
                            Vitaminas vitaminaB6 = new VitaminaB6();
                            vitaminaB6.informacionVitamina();
                            ((VitaminaB6) vitaminaB6).mostrarEnfermedadRelacionada();
                            vitaminaB6.funcionVitamina();
                            break;

                        case 7:
                            Vitaminas vitaminaB7 = new VitaminaB7();
                            vitaminaB7.informacionVitamina();
                            ((VitaminaB7) vitaminaB7).mostrarEnfermedadRelacionada();
                            vitaminaB7.funcionVitamina();
                            break;

                        case 8:
                            Vitaminas vitaminaB9 = new VitaminaB9();
                            vitaminaB9.informacionVitamina();
                            ((VitaminaB9) vitaminaB9).mostrarEnfermedadRelacionada();
                            vitaminaB9.funcionVitamina();
                            break;

                        case 9:
                            Vitaminas vitaminaB12 = new VitaminaB12();
                            vitaminaB12.informacionVitamina();
                            ((VitaminaB12) vitaminaB12).mostrarEnfermedadRelacionada();
                            vitaminaB12.funcionVitamina();
                            break;

                        case 10:
                            Vitaminas vitaminaC = new VitaminaC();
                            vitaminaC.informacionVitamina();
                            ((VitaminaC) vitaminaC).mostrarEnfermedadRelacionada();
                            vitaminaC.funcionVitamina();
                            break;

                        case 11:
                            Vitaminas vitaminaE = new VitaminaE();
                            vitaminaE.informacionVitamina();
                            ((VitaminaE) vitaminaE).mostrarEnfermedadRelacionada();
                            vitaminaE.funcionVitamina();
                            break;

                        case 12:
                            Vitaminas vitaminaK = new VitaminaK();
                            vitaminaK.informacionVitamina();
                            ((VitaminaK) vitaminaK).mostrarEnfermedadRelacionada();
                            vitaminaK.funcionVitamina();
                            break;

                        case 13:
                            salir = true;
                            System.out.println("Gracias por usar el programa.");
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