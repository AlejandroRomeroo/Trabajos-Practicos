/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal.controladores;

import java.util.ArrayList;
import productos.modelos.Producto;
import usuarios.modelos.Cliente;
import usuarios.modelos.Empleado;
import usuarios.modelos.Encargado;

/**
 *
 * @author estudiante
 */
public class ControladorPrincipal {
    
    public static void main(String[] args) {
        
        ArrayList <Cliente> listaCliente = new ArrayList<>();
        ArrayList <Empleado> listaEmpleados = new ArrayList<>();
        ArrayList <Encargado> listaEncargados = new ArrayList<>();
        ArrayList <Producto> listaProductos = new ArrayList<>();
        
    //Objetos Cliente
        
        Cliente unObjeto1 = new Cliente("aleRome@gmail.com","12375","Romero","Alejandro"); //Ejemplo usando constructor
        Cliente unObjeto2 = new Cliente("Martin123@gmail.com","63346","Campero","Martin");  //Ejemplo usando constructor
        Cliente unObjeto3 = new Cliente("DaniRomero532@gmail.com","125","Rome","Tomas");  //Ejemplo usando constructor
        
//      unObjeto1.asignarCorreo("43849747");
//      unObjeto1.asignarClave("12375");
//      unObjeto1.asignarApellido("Romero");       
//      unObjeto1.asignarNombre("Alejandro");
       
//      unObjeto2.asignarCorreo("74784943");
//      unObjeto2.asignarClave("63346");
//      unObjeto2.asignarApellido("Campero");      
//      unObjeto2.asignarNombre("Martin");
                
//      unObjeto3.asignarCorreo("43877");
//      unObjeto3.asignarClave("125");
//      unObjeto3.asignarApellido("Rome");         
//      unObjeto3.asignarNombre("Tomas");


        //Cambio de Nombres de Clientes
        
        unObjeto1.asignarNombre("Fermin");
        unObjeto2.asignarNombre("Taylor");
        unObjeto3.asignarNombre("Daniela");
        
        
        listaCliente.add(unObjeto1);
        listaCliente.add(unObjeto2);
        listaCliente.add(unObjeto3);
        
     //Objeto de Empleado
     
        Empleado unObjeto4 = new Empleado();
        Empleado unObjeto5 = new Empleado();
        Empleado unObjeto6 = new Empleado();
        
        unObjeto4.asignarCorreo("alejandro567@gmail.com");
        unObjeto4.asignarClave("Romero78");
        unObjeto4.asignarApellido("Correa");
        unObjeto4.asignarNombre("Lucas");
        
        unObjeto5.asignarCorreo("alejandro@gmail.com");
        unObjeto5.asignarClave("Romero78");
        unObjeto5.asignarApellido("Correa");
        unObjeto5.asignarNombre("Lisandro");
        
        unObjeto6.asignarCorreo("alejandro345@gmail.com");
        unObjeto6.asignarClave("Romero78efr");
        unObjeto6.asignarApellido("Nieva");
        unObjeto6.asignarNombre("Agustin");
        
        listaEmpleados.add(unObjeto4);
        listaEmpleados.add(unObjeto5);
        listaEmpleados.add(unObjeto6);
        
    //Objetos Encargado
    
        Encargado unObjeto7 = new Encargado();
        Encargado unObjeto8 = new Encargado();
        Encargado unObjeto9 = new Encargado();
        
        unObjeto7.asignarCorreo("apolo@gmail.com");
        unObjeto7.asignarClave("29109832");
        unObjeto7.asignarApellido("Gutierrez");
        unObjeto7.asignarNombre("Agustin");
        
        unObjeto8.asignarCorreo("Maia@gmail.com");
        unObjeto8.asignarClave("235364");
        unObjeto8.asignarApellido("Gongora");
        unObjeto8.asignarNombre("Agustin");
        
        unObjeto9.asignarCorreo("Maria5@gmail.com");
        unObjeto9.asignarClave("234876");
        unObjeto9.asignarApellido("Pizzani");
        unObjeto9.asignarNombre("Franco");
        
        listaEncargados.add(unObjeto7);
        listaEncargados.add(unObjeto8);
        listaEncargados.add(unObjeto9);
        
        
    //Objetos Producto
    
        Producto unObjeto10 = new Producto();
        Producto unObjeto11 = new Producto();
        Producto unObjeto12 = new Producto();

        unObjeto10.asignarCodigo(34);
        unObjeto10.asignarDescripcion("Es vegano");
        unObjeto10.asignarCategoria("Ensaladas");
        unObjeto10.asignarEstado("No Disponible");
        unObjeto10.asignarPrecio(156.6f);

        unObjeto11.asignarCodigo(43);
        unObjeto11.asignarDescripcion("Alto en Grasas");
        unObjeto11.asignarCategoria("Hamburguesas");
        unObjeto11.asignarEstado("Pocas Unidades");
        unObjeto11.asignarPrecio(300f);

        unObjeto12.asignarCodigo(67);
        unObjeto12.asignarDescripcion("Saludable");
        unObjeto12.asignarCategoria("Ensaladas");
        unObjeto12.asignarEstado("Disponible");
        unObjeto12.asignarPrecio(134.6f);

        listaProductos.add(unObjeto10);
        listaProductos.add(unObjeto11);
        listaProductos.add(unObjeto12);
                
   //Recorro ArrayList y muestro por pantalla
   
        for (int i = 0; i < listaCliente.size(); i++) {
            
           listaCliente.get(i).mostrar();
       }
       
        System.out.println(" ");
        
        for (int i = 0; i < listaEmpleados.size(); i++) {
            
            listaEmpleados.get(i).mostrar();
            
        }
        
        System.out.println(" ");
        
        for (int i = 0; i < listaEncargados.size(); i++) {
            
            listaEncargados.get(i).mostrar();
            
        }
        
        System.out.println(" ");
        
        for (int i = 0; i < listaProductos.size(); i++) {
            
            listaProductos.get(i).mostrar();
            
        }
        
        System.out.println(" ");
        System.out.println("Descripcipcion de Productos");
        
        
        for (int i = 0; i < listaProductos.size(); i++) {
            
            System.out.println(listaProductos.get(i));
        }
        
        
        
        
        
       
                
     
    }
    
  
    
}
