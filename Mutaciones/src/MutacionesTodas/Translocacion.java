package MutacionesTodas;

public class Translocacion implements VariacionGenetica{

    String mutacion;

    public Translocacion(String mutacion){
        this.mutacion = mutacion;
    }

    @Override
    public void describirEfecto() {
        System.out.println("La " + mutacion + " que es :" + "Cambio de sentido de un fragmento de cromosoma.");
    }
}
