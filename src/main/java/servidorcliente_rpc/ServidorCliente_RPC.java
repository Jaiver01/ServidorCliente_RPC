package servidorcliente_rpc;

import org.apache.xmlrpc.WebServer;
import javax.swing.JOptionPane;

public class ServidorCliente_RPC {
    public static void main(String args[]) {
        try {
            System.out.println("Iniciando servidor...");
            
            WebServer server = new WebServer(8080);

            Suma suma = new Suma();
            Resta resta = new Resta();
            Multiplicacion multiplicacion = new Multiplicacion();
            Division division = new Division();
            
            server.addHandler("servidorRPC.suma", suma);
            server.addHandler("servidorRPC.resta", resta);
            server.addHandler("servidorRPC.multiplicacion", multiplicacion);
            server.addHandler("servidorRPC.division", division);
            
            
            server.start();
            
            JOptionPane.showMessageDialog(null, "Servidor en línea...");
        } catch (Exception e) {
            System.out.println("Error en server " + e.getMessage());
        }
    }
}