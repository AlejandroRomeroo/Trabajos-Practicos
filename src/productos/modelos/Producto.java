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
    private Categoria categoria;
    private Estado estado;
    private float precio;
    
    //Metodo Mostrar
    
    public void mostrar(){
        
        
        System.out.println("Producto: " + this.descripcion);
        System.out.println("Precio: " + this.precio);
        System.out.println("Categoria: " + this.categoria + ", Vigente: " + this.estado);
    }
    
    //Metodo Constructor
    
    public Producto(){
        
    }

    public Producto(int codigo, String descripcion, Categoria categoria, Estado estado, float precio) {
        
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

    public Categoria verCategoria() {
        return categoria;
    }

    public void asignarCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Estado verEstado() {
        return estado;
    }

    public void asignarEstado(Estado Estado) {
        this.estado = Estado;
    }

    public float verPrecio() {
        return precio;
    }

    public void asignarPrecio(float precio) {
        this.precio = precio;
    }
    
    //Metodos para ver si dos productos son iguales teniendo el mismo codigo

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.codigo;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Producto other = (Producto) obj;
        return this.codigo == other.codigo;
    }
    
    
    
}
