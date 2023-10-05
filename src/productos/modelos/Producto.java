/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package productos.modelos;

/**
 *
 * @author NEW GAME
 */
public class Producto {
    
    private int codigo;
    private String descripcion;
    private String categoria;
    private String estado;
    private float precio;
    
    //Metodo Mostrar
    
    public void mostrar(){
        
        System.out.println("Categoria: " + categoria + ",  Descripcion: " + descripcion + ",  Codigo: " + codigo + ",  Estado: " + estado + ",  Precio: " + precio);
        
    }
    
    //Metodo Constructor
    
    public Producto(){
        
    }

    public Producto(int codigo, String descripcion, String categoria, String estado, float precio) {
        
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.categoria = categoria;
        this.estado = estado;
        this.precio = precio;
        
    }

    @Override
    public String toString() {
        return "El producto tiene la siguiente descripcion: " + descripcion + '.';
    }
    
    
    

    public int verCodigo() {   //get
        return codigo;
    }

    public void asignarCodigo(int codigo) {   //set
        this.codigo = codigo;
    }

    public String verDescripcion() {
        return descripcion;
    }

    public void asignarDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String verCategoria() {
        return categoria;
    }

    public void asignarCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String verEstado() {
        return estado;
    }

    public void asignarEstado(String Estado) {
        this.estado = Estado;
    }

    public float verPrecio() {
        return precio;
    }

    public void asignarPrecio(float precio) {
        this.precio = precio;
    }
    
}
