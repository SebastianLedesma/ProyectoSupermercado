package com.supermercado;

import com.supermercado.entidades.Bebida;
import com.supermercado.entidades.Cosmetico;
import com.supermercado.entidades.Fruta;
import com.supermercado.entidades.Producto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Producto> listaDeProductos = new ArrayList<>();
        listaDeProductos.add(new Bebida("Coca-cola Zero",20,1.5));
        listaDeProductos.add(new Bebida("Coca cola",18, 1.5));
        listaDeProductos.add(new Cosmetico("Shampoo Sedal",19, "500ml"));
        listaDeProductos.add(new Fruta("Frutillas",64,"kilo"));

        for (Producto producto : listaDeProductos) {
            System.out.println(producto);
        }

        System.out.println("=========================");

        Collections.sort(listaDeProductos);
        System.out.println("Producto más caro: " + listaDeProductos.get(listaDeProductos.size() -1).getNombre());
        System.out.println("Producto más barato: " + listaDeProductos.get(0).getNombre());
    }
}
