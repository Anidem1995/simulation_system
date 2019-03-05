package pseudo_aleatorio;

import pseudo_aleatorio.modelo.Semilla;

public class VonNeumann {
    Semilla semilla = new Semilla();

    public void iterar(int n) {
        semilla.setValor(9763);
        for(int i = 0; i < n; i++) {
            semilla.setValor(Math.pow(semilla.getValor(), 2));
            semilla.agregarCeros();
            semilla.extraerCentrales();
        }
    }
}
