package com.mycompany.inventario;

public class Inventario extends Producto {
    
    private float valor;
    private int cantidad;
    private String tipo;
    private String ubicacion;
    private String estado;

    public Inventario(float valor, int cantidad, boolean disponibilidad, String tipo, String ubicacion, String nombre, float codigo, String estado, String pasillo) {
        super(nombre, disponibilidad, 0, codigo, pasillo); // El precio no se pasa a super() ya que no está definido en Producto
        this.valor = valor;
        this.cantidad = cantidad;
        this.tipo = tipo;
        this.ubicacion = ubicacion;
        this.estado = estado;
    }

    public float getValor() {
        return valor;
    }

    public int getCantidad() {
        return cantidad;
    }

    public String getTipo() {
        return tipo;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public String getEstado() {
        return estado;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}