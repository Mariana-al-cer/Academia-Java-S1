package TodosLosTranstornos;

public class Parasomnia implements Transtorno {
    @Override
    public void describirTranstorno() {
        System.out.println("""
                La parasomnia causa:
                
                Conductas indeseables que ocurren durante el sueño como hablar, llorar, comer, 
                gritar o caminar. Aunque la parasomnia más común son las pesadillas
                 (sueños emocionalmente intensos y desagradables).
                
                """);
    }

    @Override
    public void sintomas() {
        System.out.println("""
                Los sintomas de parasomnia son:
                
                - Sonambulismo
                - Orinarse dormido
                - Terrores nocturnos
                - Conducta violenta durante el sueño
                - Conducta sexual durante el sueño
                - Parálisis de sueño
                
                """);
    }

    @Override
    public void tratamiento() {
        System.out.println("""
                Los tratamientos para el parasomnia incluyen:
                
                - Clonazepan, psicotrópico que potencia
                la acción inhibitoria presináptica y
                postsináptica del GABA en el sistema
                nervioso central, que amortigua la
                hiperexcitación, suprime periodos MOR
                y las fases profundas del sueño.
               
                -  Carbamazepina, la cual estabiliza las
                membranas nerviosas hiperexcitadas,
                inhibiendo las descargas neuronales
                repetitivas para disminuir los impulsos
                excitatorios; sin embargo, tiende a
                presentar mayor cantidad de efectos
                secundarios tales como mareos,
                vómitos, urticaria, ataxia, entre otros
                
                """);

    }
}
