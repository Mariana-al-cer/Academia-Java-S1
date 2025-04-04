package TodosLosTranstornos;

public class Insomnio implements Transtorno {

    @Override
    public void describirTranstorno() {
        System.out.println("""
                El insomnio es:
                 
                 Un trastorno del sueño muy común. 
                Quien lo padece, tiene problemas para lograr conciliar el sueño, 
                quedarse dormido o los dos. Como resultado, dormirá poco o 
                tendrá un sueño de poca calidad. Quizá no se sienta descansado al 
                levantarse y estará somnoliento a lo largo del día, puede provocar 
                irritabilidad.
                
                """);
    }

    @Override
    public void sintomas() {
        System.out.println("""
                Los sintomas de insomnio son:
                
                - Permanecer despierto por un largo tiempo antes de dormirse
                - Dormir solo por períodos cortos
                - Estar despierto durante gran parte de la noche
                - Sentirse como si no hubiera dormido nada
                - Despertarse demasiado temprano
                
                """);
    }

    @Override
    public void tratamiento() {
        System.out.println("""
                Los tratamientos para el insomnio incluyen:
                
                Los cambios en el estilo de vida, incluidos los buenos hábitos para dormir, 
                a menudo ayudan a aliviar el insomnio agudo (a corto plazo). 
                Estos cambios pueden hacer que le sea más fácil conciliar el sueño y 
                mantenerse dormido
                Un tipo de terapia, la terapia cognitiva-conductual, puede ayudar a 
                aliviar la ansiedad relacionada con el insomnio crónico
                Varios medicamentos también pueden ayudar a aliviar el insomnio y 
                le permiten restablecer un horario de sueño regular
                
                """);

    }
}
