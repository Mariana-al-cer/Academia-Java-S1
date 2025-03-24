package TodosLosTranstornos;

public class Respiratorio implements Transtorno {
    @Override
    public void describirTranstorno() {
        System.out.println("""
                El Trastornos del sueño relacionados con la respiración es:
                
                Un problema que incluye situaciones
                donde se evidencia desde la resistencia de
                la vía aérea respiratoria superior como la
                apnea (ausencia de flujo de aire) y la
                hipopnea (disminución del aire aéreo), hasta
                la apnea obstructiva grave del sueño. Cada
                una de las situaciones respiratorias
                alteradas por el sueño se puede clasificar
                como central, obstructiva o mixta,
                refiriéndose la central a la falta de esfuerzo
                respiratorio
                
                """);
    }

    @Override
    public void sintomas() {
        System.out.println("""
                Los sintomas del trastorno del sueño relacionado con la respiración son:
                
                Los síndromes de apnea central del sueño incluyen aquellos trastornos en los que el movimiento 
                respiratorio está disminuido o ausente de una manera intermitente o cíclica, debido a una 
                disfunción cardíaca o del sistema nervioso central.
                
                En el síndrome de apneas obstructivas del sueño se produce una obstrucción al flujo del aire en 
                la vía aérea, de manera que en presencia de movimientos respiratorios, a menudo enérgicos para 
                intentar superar la obstrucción, hay una inadecuada ventilación.
                
                Síndrome de apnea/hipopnea obstructiva del sueño (SAHOS) Consiste en la presencia de apnea, 
                ronquido, durante el sueño, de episodios repetidos de obstrucción, completa en el caso de las apneas 
                y parcial en el caso de las hipopneas.
                
                Estos episodios provocan con frecuencia una reducción de la saturación de oxígeno. Pueden ocurrir 
                en cualquier fase del sueño, aunque lo más frecuente es que lo hagan en las fases 1 y 2, y 
                en la fase REM, produciéndose típicamente las mayores desaturaciones en esta última fase.
                
                Un signo frecuentemente asociado son los ronquidos muy intensos, que suelen producirse entre las apneas.
                
                """);

    }

    @Override
    public void tratamiento() {
        System.out.println("""
                Los tratamientos para el trastorno del sueño relacionado con la respiración incluyen:
                
                Un dispositivo respiratorio, como un equipo de presión positiva continua en la vía respiratoria 
                (CPAP, por sus siglas en inglés), es el tratamiento más habitual para la apnea del sueño. 
                Un equipo de CPAP proporciona una presión de aire constante en toda la vía respiratoria 
                superior para mantenerla abierta y ayudarle a respirar mientras duerme.
                
                """);
    }
}
