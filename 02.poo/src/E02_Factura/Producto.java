package E02_Factura;

public class Producto {
    public String nombre;
    public int cantidad;
    public double precioU;

    public double getSubTotal(){
        return cantidad * precioU;
    }
}
