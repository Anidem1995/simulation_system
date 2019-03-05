package archivo;

import java.io.RandomAccessFile;

public class ManejoArchivos {
    RandomAccessFile archivo;

    private void abrirArchivo() {
        try {
            archivo = new RandomAccessFile("almacen", "rw");
        }catch(Exception e) {
            e.printStackTrace();
        }
    }

    public void escribir(long numero) {
        try {
            abrirArchivo();
            archivo.seek(archivo.length());
            archivo.writeLong(numero);
            archivo.close();
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void leerArchivo() {
        try {
            abrirArchivo();
            while (archivo.getFilePointer() < archivo.length())
                System.out.println(archivo.readLong());
            archivo.close();
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
