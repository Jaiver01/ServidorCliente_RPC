package servidorcliente_rpc;

public class Division {
    public String dividir(int n1, int n2) {
        if (n2 == 0) return "No se puede dividir entre cero";

        return String.valueOf((float) n1 / n2);
    }
}