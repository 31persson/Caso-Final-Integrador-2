public class Recurso {
    protected String nombre;
    protected int cantidad;
    protected String proveedor;

    public Recurso(String nombre, int cantidad, String proveedor) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.proveedor = proveedor;
    }

    public void reabastecer(int cantidad) {
        System.out.println("Reabasteciendo " + nombre + " con cantidad: " + cantidad);
        // Implementa la lógica de reabastecimiento
    }
}
