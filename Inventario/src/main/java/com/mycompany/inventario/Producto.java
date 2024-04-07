package com.mycompany.inventario;

public class Producto {
    
    private String nombre;
    private boolean disponibilidad;
    private float precio;
    private float codigo;
    private String pasillo;

    public Producto(String nombre, boolean disponibilidad, float precio, float codigo, String pasillo) {
        this.nombre = nombre;
        this.disponibilidad = disponibilidad;
        this.precio = precio;
        this.codigo = codigo;
        this.pasillo = pasillo;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    public float getPrecio() {
        return precio;
    }

    public float getCodigo() {
        return codigo;
    }

    public String getPasillo() {
        return pasillo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public void setCodigo(float codigo) {
        this.codigo = codigo;
    }

    public void setPasillo(String pasillo) {
        this.pasillo = pasillo;
    }
}