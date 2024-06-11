package mialmacen;

public class Producto implements Comparable<Producto> {
    private final String nombreProducto;
    private final String descripcion;
    private final double precioEnPesos;

    public Producto(String nombre, String descripcion, double precio) {
        this.nombreProducto = nombre;
        this.descripcion = descripcion;
        this.precioEnPesos = precio;
    }

    public String getNombre() {
        return nombreProducto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getPrecio() {
        return precioEnPesos;
    }

    @Override
    public int compareTo(Producto otroProducto) {
        return Double.compare(this.getPrecio(), otroProducto.getPrecio());
    }

    @Override
    public String toString() {
        return "Nombre: " + nombreProducto + " /// " + descripcion + " /// Precio: $" + precioEnPesos;
    }
}

