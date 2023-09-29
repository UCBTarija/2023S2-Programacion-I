package E02_Factura;

import java.util.ArrayList;

public class App {

    public static void main(String[] args) {
        
        Factura factura = new Factura();

        Cliente cliente = new Cliente();
        cliente.nit = 100;
        cliente.razon = "Cliente 1";

        factura.setCliente(cliente);

        Producto p1 = new Producto();
        p1.nombre = "Agua";
        p1.cantidad = 10;
        p1.precioU = 2;

        factura.addProducto(p1);


        Producto p2 = new Producto();
        p2.nombre = "Papa";
        p2.cantidad = 2;
        p2.precioU = 15;

        factura.addProducto(p2);

        double total = factura.getTotal();
        System.out.println(total);


    }







    public static void Listas() {

        ArrayList<String> lista = new ArrayList<String>();

        lista.add("Hola");
        lista.add("como");
        lista.add("estas");

        for (int i = 0; i < lista.size(); i++) {
            String ele = lista.get(i);
            System.out.println(ele);
        }

        ArrayList<Cliente> clientes = new ArrayList<Cliente>();

        Cliente c = new Cliente();
        c.nit = 100;
        c.razon = "Algo";
        clientes.add(c);

        Cliente d = new Cliente();
        d.nit = 200;
        d.razon = "Otro";
        clientes.add(d);

         for (int i = 0; i < clientes.size(); i++) {
            Cliente cli = clientes.get(i);
            System.out.println(cli.nit + "  " + cli.razon);
        }

    }
}
