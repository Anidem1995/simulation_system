package pseudo_aleatorio.modelo;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Semilla {
    public double valor;
    private String valor_texto;

    public Semilla(int valor, String valor_texto) {
        this.valor = valor;
        this.valor_texto = valor_texto;
    }

    public Semilla() { }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getValor_texto() {
        return valor_texto;
    }

    public void setValor_texto(String valor_texto) {
        this.valor_texto = valor_texto;
    }

    public void elevarCuadrado() {
        Math.pow(this.valor, 2);
    }

    public void agregarCeros() {
        NumberFormat nf = new DecimalFormat("##.###");
        valor_texto = nf.format(valor) + "";
        StringBuffer sb = new StringBuffer(8);

        switch (valor_texto.length()) {
            case 1:
                sb.append("0000000");
                break;
            case 2:
                sb.append("000000");
                break;
            case 3:
                sb.append("00000");
                break;
            case 4:
                sb.append("0000");
                break;
            case 5:
                sb.append("000");
                break;
            case 6:
                sb.append("00");
                break;
            case 7:
                sb.append("0");
                break;
                default:
                    break;
        }
        valor_texto = sb.toString();
        System.out.println(valor_texto);
    }

    public void extraerCentrales() {
        String centrales = valor_texto.substring(1, 5);
        valor = Double.parseDouble(valor_texto);
    }
}
