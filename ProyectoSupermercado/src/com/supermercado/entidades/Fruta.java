package com.supermercado.entidades;

public class Fruta extends Producto {

    private String unidadDeVenta;

    public Fruta(String nombre, double precio, String unidadDeVenta) {
        super(nombre, precio);
        this.unidadDeVenta = unidadDeVenta;
    }



    @Override
    public String toString() {
        return super.toString() + " /// Precio: $" + this.precio + " /// Unidad de venta: " + this.unidadDeVenta;
    }
}
