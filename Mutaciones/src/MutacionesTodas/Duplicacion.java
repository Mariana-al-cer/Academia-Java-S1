package MutacionesTodas;

public class Duplicacion implements VariacionGenetica{

    String mutacion;

    public Duplicacion(String mutacion){
        this.mutacion = mutacion;
    }

    @Override
    public void describirEfecto() {
        System.out.println("La " + mutacion + " que es :" + "Repetición de un fragmento de cromosoma.");
    }
}
