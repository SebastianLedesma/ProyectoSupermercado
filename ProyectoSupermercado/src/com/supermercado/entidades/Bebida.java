package com.supermercado.entidades;

public class Bebida extends Producto {

    private double litros;

    public Bebida(String nombre, double precio, double litros) {
        super(nombre, precio);
        this.litros = litros;
    }

    @Override
    public String toString() {
        return super.toString() + " /// Litros: " + this.litros + " /// Precio: $" + this.precio;
    }
}
