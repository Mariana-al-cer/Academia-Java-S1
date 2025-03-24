package MutacionesTodas;

public class Delecion implements VariacionGenetica{

    String mutacion;

    public Delecion(String mutacion){
        this.mutacion = mutacion;
    }

    @Override
    public void describirEfecto() {
        System.out.println("La " + mutacion + " que es :" + "Pérdida de un fragmento de cromosoma.");
    }
}
