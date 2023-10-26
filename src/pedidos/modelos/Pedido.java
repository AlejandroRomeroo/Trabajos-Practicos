/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pedidos.modelos;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import usuarios.modelos.Cliente;

/**
 *
 * @author tomyl
 */
public class Pedido {
    private int numero;
    private LocalDateTime fechaYHora;
    private Cliente cliente;
    private Estados estado;
    private ArrayList<ProductoDelPedido>productosDelPedido;
    
    public Pedido(){}

    public Pedido(int numero, LocalDateTime fechaYHora, Estados estado, ArrayList<ProductoDelPedido> productosDelPedido, Cliente cliente) {
        this.numero = numero;
        this.fechaYHora = fechaYHora;
        this.cliente = cliente;
        this.estado = estado;
        this.productosDelPedido = productosDelPedido;
    }
    
    public int verNumero() {
        return numero;
    }

    public LocalDateTime verFechaYHora() {
        return fechaYHora;
    }
    
    public Cliente verCliente() {
        return cliente;
    }

    public Estados verEstado() {
        return estado;
    }

    public void asignarNumero(int numero) {
        this.numero = numero;
    }

    public void asignarFechaYHora(LocalDateTime fechaYHora) {
        this.fechaYHora = fechaYHora;
    }

    public void asignarCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void asignarEstado(Estados estado) {
        this.estado = estado;
    }
    
    public String verHora() {
        Instant instant = fechaYHora.atZone(ZoneId.systemDefault()).toInstant();
        Date date = Date.from(instant);
        String pattern = "HH:mm";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        String dateOut = simpleDateFormat.format(date);
        return dateOut;
    }

    public void mostrar(){
        System.out.println("Nro: "+this.numero); 
        System.out.println("Cliente: " + cliente.verApellido() + ", " + cliente.verNombre());
        System.out.println("Fecha: "+this.fechaYHora.getDayOfMonth()+"/"+ this.fechaYHora.getMonthValue()+"/"+ this.fechaYHora.getYear()+ "\t"+ this.verHora());
        System.out.println("Estado: " +this.estado);
        System.out.println("\tProducto\t" + "Cantidad");
        System.out.println("\t==========================");
        for (ProductoDelPedido productoDelPedido : productosDelPedido) {
            System.out.println("\t"+productoDelPedido.verProducto().verDescripcion()+"\t"+ productoDelPedido.verCantidad());
        }
    }
    
    public boolean equals(Pedido ped){
        if (ped == null) {return false;}
        if (ped == this) {return true;}
        if (getClass()!=ped.getClass()) {return false;}
        return this.numero == ped.numero;
    }
}
