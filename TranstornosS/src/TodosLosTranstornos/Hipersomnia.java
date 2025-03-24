package TodosLosTranstornos;

public class Hipersomnia  implements Transtorno {

    @Override
    public void describirTranstorno() {
        System.out.println("""
                La hipersomnia es:
                
                Una condición de somnolencia excesiva
                incluso después de haber dormido al menos 7 horas
                
                """);
    }

    @Override
    public void sintomas() {
        System.out.println("""
                Los sintomas de hipersomnia son:
                
                - Periodos recurrentes de sueño durante
                un mismo día.
                - Sueño prolongado de una duración de 9
                horas al día sin ser reparador.
                - Posterior a un despertar brusco hay
                dificultad para permanecer despierto
                totalmente.
                
                """);
    }

    @Override
    public void tratamiento() {
        System.out.println("""
                Los tratamientos para la hipersomnia incluyen:
                
                No hay una cura para
                esta afección; sin embargo, los síntomas se
                pueden tratar con psicoestimulantes
                tradicionales como anfetaminas y sus
                derivados, siempre acompañados de siestas
                programadas, ajuste de estilos de vida y
                consejo psicológico""");
    }

}
