package com.forrajeria.forrajeriarya.persistencia;

import com.forrajeria.forrajeriarya.logic.Producto;
import com.forrajeria.forrajeriarya.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControlPersistencia {

    ProductoJpaController productoJpa = new ProductoJpaController();

    public void guardar(Producto producto) {

        productoJpa.create(producto);
    }

    public List<Producto> traerProductos() {

        return productoJpa.findProductoEntities();
    }

    public void eliminarProducto(int id_producto) {
        try {
            productoJpa.destroy(id_producto);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControlPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Producto traerProducto(int id_producto) {

        return productoJpa.findProducto(id_producto);
    }

    public void modificarProducto(Producto product) {
        try {
            productoJpa.edit(product);
        } catch (Exception ex) {
            Logger.getLogger(ControlPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public List<Producto> buscarProducto(String busqueda) {

        return productoJpa.findProductoByNombre(busqueda);
    }

}
