package E02_Factura;

import java.util.ArrayList;

public class Factura {

    public Cliente cliente;
    public ArrayList<Producto> productos =  new ArrayList<Producto>();

    public void setCliente(Cliente cli) {
        cliente = cli;
    }

    public void addProducto(Producto prod) {
        productos.add(prod);
    }

    public double getTotal(){
        double suma = 0;
        for(int i = 0; i < productos.size(); i++){
            Producto producto = productos.get(i);
            suma = suma + producto.getSubTotal();
        }
        return suma;
    }

}
