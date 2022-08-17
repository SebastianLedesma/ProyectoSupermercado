package com.supermercado.entidades;

public class Cosmetico extends Producto {

    private String contenido;

    public Cosmetico(String nombre, double precio, String contenido) {
        super(nombre, precio);
        this.contenido = contenido;
    }

    @Override
    public String toString() {
        return super.toString() + " /// Contenido: " + this.contenido + " /// Precio: $" + this.precio;
    }
}
