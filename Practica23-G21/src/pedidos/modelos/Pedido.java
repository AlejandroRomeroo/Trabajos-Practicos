/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pedidos.modelos;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import usuarios.modelos.Cliente;

/**
 *
 * @author USUARIO
 */
public class Pedido {
    private int numero;
    private LocalDateTime fechaYHora;
    private Estado estado;
    private Cliente unCliente;
    private ArrayList<ProductoDelPedido> unProductoDelPedido;

    public Pedido(int numero, LocalDateTime fechaYHora, ArrayList<ProductoDelPedido> PdP, Cliente unCliente) {
        this.numero = numero;
        this.fechaYHora = fechaYHora;
        this.estado = Estado.CREANDO;
        this.unCliente = unCliente;
        this.unProductoDelPedido = PdP;
    }

    public ArrayList<ProductoDelPedido> verUnProductoDelPedido() {
        return unProductoDelPedido;
    }

    public void asignarUnProductoDelPedido(ArrayList<ProductoDelPedido> unProductoDelPedido) {
        this.unProductoDelPedido = unProductoDelPedido;
    }

    public int verNumero() {
        return numero;
    }

    public void asignarNumero(int numero) {
        this.numero = numero;
    }

    public Estado verEstado() {
        return estado;
    }

    public void asignarEstado(Estado estado) {
        this.estado = estado;
    }

    public Cliente verUnCliente() {
        return unCliente;
    }

    public void asignarUnCliente(Cliente unCliente) {
        this.unCliente = unCliente;
    }
    
    public LocalTime verHora() {
       return (fechaYHora.toLocalTime());
    }
    
    public void asignarHora(LocalTime unaHora) {
        this.fechaYHora = this.fechaYHora.withHour(unaHora.getHour());
        this.fechaYHora = this.fechaYHora.withMinute(unaHora.getMinute());
    }
    
    public LocalDate verFecha() {
       return (fechaYHora.toLocalDate());
    }
    
    public void asignarFecha(LocalDate unaFecha) {
        this.fechaYHora = this.fechaYHora.withDayOfMonth(unaFecha.getDayOfMonth());
        this.fechaYHora = this.fechaYHora.withMonth(unaFecha.getMonthValue());
        this.fechaYHora = this.fechaYHora.withYear(unaFecha.getYear());
    }
   
    
    public void mostrarPedido () {
        String patronFecha = "dd/MM/yyyy";
        String fechaFormateada = fechaYHora.format(DateTimeFormatter.ofPattern(patronFecha)); 
        
        System.out.println("Nro. " + numero);
        System.out.println("Fecha: " + fechaFormateada + "\tHora: " + fechaYHora.getHour()+":"+fechaYHora.getMinute());
        System.out.println("Cliente: " + unCliente.verNombre() + "," + unCliente.verApellido());
        System.out.println("Estado: " + estado);
        System.out.println("\tProducto \tCantidad");
        System.out.println("\t=========================");
        for(ProductoDelPedido pdp: unProductoDelPedido ){
        System.out.println("\t" + pdp.verUnProducto() + "\t" + pdp.verCantidad());
        }
    }
    
}