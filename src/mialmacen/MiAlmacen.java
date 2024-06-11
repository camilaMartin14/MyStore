package mialmacen;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MiAlmacen {
    
    public static void main(String[] args) {
        List<Producto> productos = cargarProductos();

        imprimirProductos(productos);

        Producto productoMasCaro = Collections.max(productos);
        Producto productoMasBarato = Collections.min(productos);

        System.out.println("=============================");
        System.out.println("Producto más caro: " + productoMasCaro.getNombre());
        System.out.println("Producto más barato: " + productoMasBarato.getNombre());
    }

    private static List<Producto> cargarProductos() {
        List<Producto> productos = new ArrayList<>();
        productos.add(new Producto("Coca-Cola Zero", "Litros: 1.5", 20));
        productos.add(new Producto("Coca-Cola", "Litros: 1.5", 18));
        productos.add(new Producto("Shampoo Sedal", "Contenido: 500ml", 19));
        productos.add(new Producto("Frutillas", "Unidad de venta: kilo", 64));
        return productos;
    }

    private static void imprimirProductos(List<Producto> productos) {
        for (Producto producto : productos) {
            System.out.println(producto);
        }
    }
}