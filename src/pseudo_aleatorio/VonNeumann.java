package pseudo_aleatorio;

import archivo.ManejoArchivos;
import pseudo_aleatorio.modelo.Semilla;

public class VonNeumann {
    Semilla semilla = new Semilla();
    ManejoArchivos manejoArchivos = new ManejoArchivos();

    public void iterar(int n) {
        semilla.setValor(9763);
        for(int i = 0; i < n; i++) {
            semilla.elevarCuadrado();
            semilla.agregarCeros();
            semilla.extraerCentrales();
            manejoArchivos.escribir(semilla.getValor());
        }
        manejoArchivos.leerArchivo();
    }
}
