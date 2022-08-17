package com.supermercado.entidades;

public abstract class Producto implements Comparable<Producto> {

    protected String nombre;
    protected double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public int compareTo(Producto o) {
        /*if(this.precio > o.precio){
            return 1;
        }else if(this.precio < o.precio){
            return -1;
        }else{
            return 0;
        }*/
        return Double.valueOf(this.precio).compareTo(o.precio);
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre;
    }
}
