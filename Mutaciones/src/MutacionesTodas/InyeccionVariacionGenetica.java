package MutacionesTodas;

final public class InyeccionVariacionGenetica {

    private final VariacionGenetica variacionGenetica;

    // Constructor para inyectar la dependencia
    public InyeccionVariacionGenetica(VariacionGenetica variacionGenetica) {
        this.variacionGenetica = variacionGenetica;
    }

    public void mostrarInformacion() {
        VariacionGenetica.mostrarInformacionGeneral();
        variacionGenetica.describirEfecto();
    }

}
