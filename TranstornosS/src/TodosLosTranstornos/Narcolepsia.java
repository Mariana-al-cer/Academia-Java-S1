package TodosLosTranstornos;

public class Narcolepsia implements Transtorno {
    @Override
    public void describirTranstorno() {
        System.out.println("""
                La narcolepsia es:
                
                Son lapsos recurrentes de
                necesidad irresistible de dormir. Estos
                períodos pueden tener una duración de 10 a
                20 minutos de sueño, posterior a los cuales
                el individuo se siente renovado al menos
                transitoriamente. Puede aparecer a
                cualquier edad, sin embargo, es más
                frecuente en la adolescencia, generalmente
                antes de los 30 años
                
                """);
    }

    @Override
    public void sintomas() {
        System.out.println("""
                Los sintomas de narcolepsia son:
                
                Periodos de sueño incontrolable, perdida de la fuerza inmediatamente 
                después de una emoción intensa, otro síntoma característico es la cataplejía
                (perdida brusca del tono muscular). Su duración suele ser 
                de segundos o pocos minutos y la recuperación es inmediata y completa.
                
                Otros síntomas son la parálisis del sueño, alucinaciones hipnagógicas, sueño desorganizado 
                o conductas automáticas. La parálisis del sueño es la incapacidad generalizada y 
                transitoria para moverse o hablar.
                
                Las alucinaciones hipnagógicas consisten en sueños muy vivenciados que ocurren especialmente 
                al inicio del sueño, y que cursan con fenómenos visuales, táctiles y auditivos.
                
                """);

    }

    @Override
    public void tratamiento() {
        System.out.println("""
        Los tratamientos para la narcolepsia incluyen:
    
      Puede ayudar a controlar su narcolepsia adoptando hábitos de sueño y cambios de estilo de vida 
      saludables. Estos incluyen acostarse a la misma hora todas las noches, levantarse a la misma 
      hora todas las mañanas y tomar siestas programadas durante el día. Evitar el alcohol y los 
      medicamentos que empeoran la somnolencia diurna puede también ayudarle a sentirse menos somnoliento 
      durante el día.
    
    Pueden recetar medicamentos para:
    
    - Ayudar a mantenerse despierto durante el día;
    - Tratar la somnolencia diurna excesiva y la cataplejía;
    - Mejorar el sueño nocturno.
    """);

    }
}
