/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pedidos.modelos;

import java.time.LocalDateTime;
import java.util.ArrayList;
import usuarios.modelos.Cliente;

/**
 *
 * @author estudiante
 */
public class Pedido {
    
    private int numero;
    private LocalDateTime fechaYHora;
    
    private Cliente cliente;
    private Estado estado;
    
    private ArrayList<ProductoDelPedido> productoDelPedido;
    
    //Constructores
    
    public Pedido(){
        
    }

    public Pedido(int numero, LocalDateTime fechaYHora, Cliente cliente, Estado estado, ArrayList<ProductoDelPedido> productoDelPedido) {
        this.numero = numero;
        this.fechaYHora = fechaYHora;
        this.cliente = cliente;
        this.estado = estado;
        this.productoDelPedido = productoDelPedido;
    }

 
    //Metodos get/set
    
    
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

//    public LocalDateTime getFechaYHora() {
//        return fechaYHora;
//    }
//    public int getFechaYHora() {
//        return fechaYHora.getHour();
//    }
    
    public String getHora() {
        return fechaYHora.getHour() + ":" + fechaYHora.getMinute();
    }
    
    public String getFecha(){
        return fechaYHora.getDayOfMonth() + "/" + fechaYHora.getMonth() + "/" + fechaYHora.getYear();
    }
    public void setFechaYHora(LocalDateTime fechaYHora) {
        this.fechaYHora = fechaYHora;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
    
    // get/set del ProductoDelPedido
    
    public ArrayList<ProductoDelPedido> getProductoDelPedido() {
        return productoDelPedido;
    }
                                                                                            
    public void setProductoDelPedido(ArrayList<ProductoDelPedido> ProductoDelPedido) {
        this.productoDelPedido = ProductoDelPedido;
    }
    
    
    public void mostrar(){
        
        System.out.println("Nro: " + this.numero);
        System.out.println("Fecha: " + this.getFecha() + "\t Hora: " + this.getHora());                     
        System.out.println("Cliente: " + this.cliente.verApellido() + " , " + this.cliente.verNombre());
        System.out.println("Estado: " + this.estado);
        System.out.println("\tProducto\tCantidad");
        System.out.println("\t==========================");
        
       for (int i = 0; i < productoDelPedido.size(); i++) {
           System.out.println("\t"+ productoDelPedido.get(i).verProducto().verDescripcion() + "\t"+ productoDelPedido.get(i).verCantidad());
       }
    }

    //Metodo para ver si dos pedidos son iguales tenniendo el mismo numero

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + this.numero;
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
        final Pedido other = (Pedido) obj;
        return this.numero == other.numero;
    }
    
    
}
