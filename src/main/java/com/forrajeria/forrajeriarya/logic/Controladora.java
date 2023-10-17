package com.forrajeria.forrajeriarya.logic;

import com.forrajeria.forrajeriarya.persistencia.ControlPersistencia;
import java.util.List;

public class Controladora {

    ControlPersistencia controlP = new ControlPersistencia();

    public void guardar(String nombre, String peso, String tipo, String tamanio, String linea_Producto, int stock) {

        Producto producto = new Producto();
        producto.setNombre(nombre);
        producto.setPeso(peso);
        producto.setTipo(tipo);
        producto.setTamanio(tamanio);
        producto.setLineaProducto(linea_Producto);
        producto.setStock(stock);

        controlP.guardar(producto);

    }

    public List<Producto> traerProductos() {
        return controlP.traerProductos();
    }

    public void eliminarProducto(int id_producto) {
        controlP.eliminarProducto(id_producto);
    }

    public Producto traerProducto(int id_producto) {

        return controlP.traerProducto(id_producto);
    }

    public void modificarProducto(Producto product, String nombre, String peso, String tipo, String tamanio, String linea_Producto, int stock) {
        product.setNombre(nombre);
        product.setPeso(peso);
        product.setTipo(tipo);
        product.setTamanio(tamanio);
        product.setLineaProducto(linea_Producto);
        product.setStock(stock);

        controlP.modificarProducto(product);

    }

    public List<Producto> busquedaProducto(String busqueda) {

        return controlP.buscarProducto(busqueda);

    }

}
