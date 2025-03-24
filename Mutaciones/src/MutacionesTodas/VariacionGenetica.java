package MutacionesTodas;

public interface VariacionGenetica {

    void describirEfecto();

    static void mostrarInformacionGeneral() {
        System.out.println("""
                Los fallos en la secuencia del ADN de nuestras células se pueden dar a diferentes niveles, 
                entre ellos el cromosómico. Dentro de las anomalías cromosómicas podemos encontrarnos con : 
                """);
    }
}
