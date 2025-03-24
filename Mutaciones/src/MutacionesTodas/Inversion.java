package MutacionesTodas;

public class Inversion implements VariacionGenetica{
    String mutacion;

    public Inversion(String mutacion){
        this.mutacion = mutacion;
    }

    @Override
    public void describirEfecto() {
        System.out.println("La " + mutacion + " que es :" + "Cambio de sentido de un fragmento de cromosoma.");
    }
}
