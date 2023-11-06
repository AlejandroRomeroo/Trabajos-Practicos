/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package usuarios.modelos;

import java.util.ArrayList;
import pedidos.modelos.Pedido;
/**
 *
 * @author NEW GAME
 */
public class Cliente extends Usuario{
    
    private ArrayList<Pedido> pedido;
    
    
    //Metodo Constructor 
   
    public Cliente(String correo, String clave, String apellido, String nombre) {
        
        super(correo, clave, apellido, nombre);
        
    }

//    public Cliente(ArrayList<Pedido> pedido){
//        
//        this.pedido = pedido;
//    }
    
   
    public ArrayList<Pedido> verPedido() {
        return pedido;
    }

    public void asignarPedido(ArrayList<Pedido> pedido) {
        this.pedido = pedido;
    }
    
    
    
}
