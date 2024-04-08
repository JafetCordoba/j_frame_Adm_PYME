package com.mycompany.inventario;

public class Inventario {

    private Producto producto;
    private int cantidad;
    private String ubicacion;

    public Inventario(Producto producto, int cantidad, String ubicacion) {
        this.producto = producto;
        this.cantidad = cantidad;
        this.ubicacion = ubicacion;
    }

    public Producto getProducto() {
        return producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
}
