package com.company;

public class Main {

    public static void main(String[] args) {
	/* Sistema de facturación para una zapatería.
Donde tenemos:
Productos -> id, nombre, precioUnitario
Facturas -> id, nombreCliente, precioTotal, cantidadItems
Items de facturas -> id, idProducto, cantidad, precioSubtotal
Crear el sistema que permita registrar nuevas facturas y mostrarlas en pantalla.
Utilizar DAO. */

    for(Producto p: ProductoDAO.getProductos())
        System.out.println(p);
        Producto nuevoProducto = new Producto("zapatos rojos", 15);
        //ProductoDAO.guardar(nuevoProducto);

    }
}
