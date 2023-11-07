///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package principal.controladores;
//
//import java.time.LocalDateTime;
//import java.time.Month;
//import java.util.ArrayList;
//import pedidos.modelos.Pedido;
//import pedidos.modelos.ProductoDelPedido;
//import productos.modelos.Categoria;
//import productos.modelos.Estado;
//import productos.modelos.Producto;
//import usuarios.modelos.Cliente;
//import usuarios.modelos.Empleado;
//import usuarios.modelos.Encargado;
//
///**
// *
// * @author estudiante
// */
//public class ControladorPrincipal {
//    
//    public static void main(String[] args) {
//        
//        ArrayList <Cliente> listaCliente = new ArrayList<>();
//        ArrayList <Empleado> listaEmpleados = new ArrayList<>();
//        ArrayList <Encargado> listaEncargados = new ArrayList<>();
//        ArrayList <Producto> listaProductos = new ArrayList<>();
//        ArrayList <Pedido> listaPedidos = new ArrayList<>();
//        
//    //Objetos Cliente
//        
//        Cliente unCliente1 = new Cliente("aleRome@gmail.com","12375","Romero","Alejandro"); //Ejemplo usando constructor
//        Cliente unCliente2 = new Cliente("Martin123@gmail.com","63346","Campero","Martin");  //Ejemplo usando constructor
//        Cliente unCliente3 = new Cliente("DaniRomero532@gmail.com","125","Rome","Tomas");  //Ejemplo usando constructor
//        
////      unCliente1.asignarCorreo("43849747");
////      unCliente1.asignarClave("12375");
////      unCliente1.asignarApellido("Romero");       
////      unCliente1.asignarNombre("Alejandro");
//       
////      unCliente2.asignarCorreo("74784943");
////      unCliente2.asignarClave("63346");
////      unCliente2.asignarApellido("Campero");      
////      unCliente2.asignarNombre("Martin");
//                
////      unCliente3.asignarCorreo("43877");
////      unCliente3.asignarClave("125");
////      unCliente3.asignarApellido("Rome");         
////      unCliente3.asignarNombre("Tomas");
//
//
//        //Cambio de Nombres de Clientes
//        
//        unCliente1.asignarNombre("Fermin");
//        unCliente2.asignarNombre("Taylor");
//        unCliente3.asignarNombre("Daniela");
//        
//        
//        listaCliente.add(unCliente1);
//        listaCliente.add(unCliente2);
//        listaCliente.add(unCliente3);
//        
//     //Objeto de Empleado
//     
//        Empleado unObjeto4 = new Empleado();
//        Empleado unObjeto5 = new Empleado();
//        Empleado unObjeto6 = new Empleado();
//        
//        unObjeto4.asignarCorreo("alejandro567@gmail.com");
//        unObjeto4.asignarClave("Romero78");
//        unObjeto4.asignarApellido("Correa");
//        unObjeto4.asignarNombre("Lucas");
//        
//        unObjeto5.asignarCorreo("alejandro@gmail.com");
//        unObjeto5.asignarClave("Romero78");
//        unObjeto5.asignarApellido("Correa");
//        unObjeto5.asignarNombre("Lisandro");
//        
//        unObjeto6.asignarCorreo("alejandro345@gmail.com");
//        unObjeto6.asignarClave("Romero78efr");
//        unObjeto6.asignarApellido("Nieva");
//        unObjeto6.asignarNombre("Agustin");
//        
//        listaEmpleados.add(unObjeto4);
//        listaEmpleados.add(unObjeto5);
//        listaEmpleados.add(unObjeto6);
//        
//    //Objetos Encargado
//    
//        Encargado unObjeto7 = new Encargado();
//        Encargado unObjeto8 = new Encargado();
//        Encargado unObjeto9 = new Encargado();
//        
//        unObjeto7.asignarCorreo("apolo@gmail.com");
//        unObjeto7.asignarClave("29109832");
//        unObjeto7.asignarApellido("Gutierrez");
//        unObjeto7.asignarNombre("Agustin");
//        
//        unObjeto8.asignarCorreo("Maia@gmail.com");
//        unObjeto8.asignarClave("235364");
//        unObjeto8.asignarApellido("Gongora");
//        unObjeto8.asignarNombre("Agustin");
//        
//        unObjeto9.asignarCorreo("Maria5@gmail.com");
//        unObjeto9.asignarClave("234876");
//        unObjeto9.asignarApellido("Pizzani");
//        unObjeto9.asignarNombre("Franco");
//        
//        listaEncargados.add(unObjeto7);
//        listaEncargados.add(unObjeto8);
//        listaEncargados.add(unObjeto9);
//        
//        
//    //Objetos Producto
//    
//        Producto unProducto1 = new Producto();
//        Producto unProducto2 = new Producto();
//        Producto unProducto3 = new Producto();
//
//        unProducto1.asignarCodigo(34);
//        unProducto1.asignarDescripcion("Producto1");
//        unProducto1.asignarCategoria(Categoria.ENTRADA);  //Accede a la enumeracion y le dice que es de tipo entrada
//        unProducto1.asignarEstado(Estado.DISPONIBLE);
//        unProducto1.asignarPrecio(156.6f);
//
//        unProducto2.asignarCodigo(43);
//        unProducto2.asignarDescripcion("Producto2");
//        unProducto2.asignarCategoria(Categoria.PRINCIPAL);
//        unProducto2.asignarEstado(Estado.DISPONIBLE);
//        unProducto2.asignarPrecio(300f);
//
//        unProducto3.asignarCodigo(67);
//        unProducto3.asignarDescripcion("Producto3");
//        unProducto3.asignarCategoria(Categoria.PLATO);
//        unProducto3.asignarEstado(Estado.DISPONIBLE);
//        unProducto3.asignarPrecio(134.6f);
//
//        listaProductos.add(unProducto1);
//        listaProductos.add(unProducto2);
//        listaProductos.add(unProducto3);
//                
//   //Recorro ArrayList y muestro por pantalla
//   
//        System.out.println("Clientes");
//        System.out.println("========");
//        
//        for (int i = 0; i < listaCliente.size(); i++) {
//            
//           listaCliente.get(i).mostrar();
//           System.out.println("\s ");
//        }
//        
//        System.out.println("\s ");
//        System.out.println("Empleados");
//        System.out.println("========");
//        
//        for (int i = 0; i < listaEmpleados.size(); i++) {
//            
//            listaEmpleados.get(i).mostrar();
//            System.out.println("\s ");
//            
//        }
//        System.out.println("\s ");
//        System.out.println("Encargados");
//        System.out.println("========");
//        
//        for (int i = 0; i < listaEncargados.size(); i++) {
//            
//            listaEncargados.get(i).mostrar();
//            System.out.println("\s ");
//            
//        }
//        
//        System.out.println("\s ");
//        System.out.println("Productos");
//        System.out.println("=========");
//       
//        for (int i = 0; i < listaProductos.size(); i++) {
//            
//            listaProductos.get(i).mostrar();
//            System.out.println("\s ");
//            
//        }
//        System.out.println("\s ");
////        System.out.println(" ");
////        System.out.println("Descripcipcion de Productos");
////        
////        
////        for (int i = 0; i < listaProductos.size(); i++) {
////            
////            System.out.println(listaProductos.get(i));
////        }
////        System.out.println();
//        
//        //Crear Pedidos
// 
//        LocalDateTime tiempo1 =LocalDateTime.of(2023, Month.MARCH, 10, 12, 20);
//        ArrayList <ProductoDelPedido> pdp1= new ArrayList<>();
//        pdp1.add(new ProductoDelPedido(10, unProducto3));
//        pdp1.add(new ProductoDelPedido(20,unProducto2));
//        
//        Pedido unPedido1 = new Pedido(545, tiempo1, unCliente1, pedidos.modelos.Estado.CREADO, pdp1 );
//        
//        
//        
//        LocalDateTime tiempo2 =LocalDateTime.of(2023, Month.APRIL, 13, 18, 15);
//        
//        ArrayList <ProductoDelPedido> pdp2 = new ArrayList<>();
//        pdp2.add(new ProductoDelPedido(30, unProducto3));
//        pdp2.add(new ProductoDelPedido(40, unProducto2));
//        
//        Pedido unPedido2 = new Pedido(5446, tiempo2, unCliente2, pedidos.modelos.Estado.SOLICITADO, pdp2 );
//      
//        
//        LocalDateTime tiempo3 =LocalDateTime.of(2023, Month.OCTOBER, 8, 10, 01);
//        ArrayList <ProductoDelPedido> pdp3 = new ArrayList<>();
//        pdp3.add(new ProductoDelPedido(50, unProducto3));
//        pdp3.add(new ProductoDelPedido(60, unProducto2));
//       
//        Pedido unPedido3 = new Pedido(123, tiempo3, unCliente3, pedidos.modelos.Estado.SOLICITADO, pdp3);
//        
//        listaPedidos.add(unPedido1);
//        listaPedidos.add(unPedido2);
//        listaPedidos.add(unPedido3);
//        
//        
//        
//        System.out.println("Pedidos");
//        System.out.println("========");
//        for (int i = 0; i < listaPedidos.size(); i++) {
//            
//            listaPedidos.get(i).mostrar();
//            System.out.println();
//            
//        }
//    }
//    
//  
//    
//}

//CONTROLADOR FACULTAD

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal.controladores;

import java.time.LocalDateTime;
import java.util.ArrayList;
import pedidos.modelos.Pedido;
import pedidos.modelos.ProductoDelPedido;
import productos.modelos.Categoria;
import productos.modelos.Estado;
import productos.modelos.Producto;
import usuarios.modelos.Cliente;
import usuarios.modelos.Empleado;
import usuarios.modelos.Encargado;
import usuarios.modelos.Usuario;

/**
 *
 * @author Mariana
 */
public class ControladorPrincipal{
    public static void main(String[] args) {
        /*
        INICIO Primera parte - comparación de objetos
        */
//        ArrayList<Producto> listaProductos = new ArrayList<>();
//        ArrayList<Pedido> listaPedidos = new ArrayList<>();
//        ArrayList<Cliente> listaClientes = new ArrayList<>();
//        
//        
//        System.out.println("#################### ");
//        System.out.println("PRODUCTOS");
//        Producto p1 = new  Producto(1, "Producto 1", Categoria.ENTRADA ,Estado.DISPONIBLE, 200.0f);        
//        Producto p2 = new  Producto(2, "Producto 2", Categoria.PLATO, Estado.DISPONIBLE, 1950.0f);        
//        Producto p3 = new  Producto(3, "Producto 3",Categoria.POSTRE, Estado.NODISPONIBLE, 580.0f);        
//        Producto p4 = new  Producto(4, "Producto 4",Categoria.POSTRE, Estado.NODISPONIBLE, 580.0f);        
//        Producto p5 = new  Producto(3, "Producto 5",Categoria.POSTRE, Estado.NODISPONIBLE, 7580.0f);         
//        //no debe agregar a p5
//        
//        if (!listaProductos.contains(p1))
//            listaProductos.add(p1);
//        if (!listaProductos.contains(p2))
//            listaProductos.add(p2);
//        if (!listaProductos.contains(p3))
//            listaProductos.add(p3);
//        if (!listaProductos.contains(p4))
//            listaProductos.add(p4);
//        if (!listaProductos.contains(p5))
//            listaProductos.add(p5);
//        
//        for (Producto p: listaProductos)
//            p.mostrar();
//        
//        System.out.println("#################### ");
//        System.out.println("CLIENTES");
//        Cliente cliente1 = new Cliente("cliente1@bar.com", "claveCliente1", "ApellidoCliente1", "NombreCliente1");        
//        Cliente cliente2 = new Cliente("cliente2@bar.com", "claveCliente2", "ApellidoCliente2", "NombreCliente2");       
//        Cliente cliente3 = new Cliente("cliente3@bar.com", "claveCliente3", "ApellidoCliente3", "NombreCliente3");
//        
//        listaClientes.add(cliente1);
//        listaClientes.add(cliente2);
//        listaClientes.add(cliente3);
//        
//        for (Cliente e: listaClientes)
//            e.mostrar();
//        
//        
//        System.out.println("#################### ");
//        System.out.println("PEDIDOS");
//               
//        ArrayList<ProductoDelPedido> listapdp1 = new ArrayList<>();
//        ProductoDelPedido pdp1 = new ProductoDelPedido(p1, 1);
//        ProductoDelPedido pdp2 = new ProductoDelPedido(p2, 2);        
//        if (!listapdp1.contains(pdp1))
//            listapdp1.add(pdp1);
//        if (!listapdp1.contains(pdp2))
//            listapdp1.add(pdp2);
//        Pedido unPedido1 = new Pedido(1, LocalDateTime.now(), listapdp1, cliente1, pedidos.modelos.Estado.CREANDO);        
//        
//        ArrayList<ProductoDelPedido> productosDelPedido2 = new ArrayList<>();
//        ProductoDelPedido pdp3 = new ProductoDelPedido(p3, 10);
//        ProductoDelPedido pdp4 = new ProductoDelPedido(p1, 20);
//        ProductoDelPedido pdp5 = new ProductoDelPedido(p1, 30);
//        //producto repetido        
//        if (!productosDelPedido2.contains(pdp3))
//            productosDelPedido2.add(pdp3);
//        if (!productosDelPedido2.contains(pdp4))
//            productosDelPedido2.add(pdp4);
//        if (!productosDelPedido2.contains(pdp5))
//            productosDelPedido2.add(pdp5);
//        Pedido unPedido2 = new Pedido(2, LocalDateTime.now(), productosDelPedido2, cliente2, pedidos.modelos.Estado.CREANDO);        
//        
//        ArrayList<ProductoDelPedido> productosDelPedido3 = new ArrayList<>();
//        ProductoDelPedido pdp6 = new ProductoDelPedido(listaProductos.get(1), 100);
//        ProductoDelPedido pdp7 = new ProductoDelPedido(listaProductos.get(2), 200);
//        if (!productosDelPedido3.contains(pdp6))
//            productosDelPedido3.add(pdp6);
//        if (!productosDelPedido3.contains(pdp7))
//            productosDelPedido3.add(pdp7);
//        Pedido unPedido3 = new Pedido(2, LocalDateTime.now(), productosDelPedido3, cliente3, pedidos.modelos.Estado.CREANDO);        
//        //pedido repetido
//
//        if(!listaPedidos.contains(unPedido1))
//            listaPedidos.add(unPedido1);
//        if(!listaPedidos.contains(unPedido2))
//            listaPedidos.add(unPedido2);
//        if(!listaPedidos.contains(unPedido3))
//            listaPedidos.add(unPedido3);
//        
//        System.out.println("Pedidos");
//        System.out.println("=======");
//        for(Pedido p : listaPedidos) {
//            p.mostrar();
//            System.out.println();
//        }
//        System.out.println();        
//    
    /*
     FIN Primera parte - comparación de objetos
    */
    /*
    INICIO Segunda parte - herencia
//    */
//        ArrayList<Usuario> usuarios = new ArrayList<>();
//        
//        Usuario unCliente1 = new Cliente("cliente1@bar.com", "claveCliente1", "ApellidoCliente1", "NombreCliente1");        
//        Usuario unCliente2 = new Cliente("cliente2@bar.com", "claveCliente2", "ApellidoCliente2", "NombreCliente2");       
//        Usuario unCliente3 = new Cliente("cliente3@bar.com", "claveCliente3", "ApellidoCliente3", "NombreCliente3");
//        Usuario unCliente4 = new Cliente("cliente3@bar.com", "claveCliente4", "ApellidoCliente4", "NombreCliente4"); 
//        //unCliente4 repetido con unCliente3
//        
//        if (!usuarios.contains(unCliente1))
//            usuarios.add(unCliente1);
//        if (!usuarios.contains(unCliente2))
//            usuarios.add(unCliente2);
//        if (!usuarios.contains(unCliente3))
//            usuarios.add(unCliente3);
//        if (!usuarios.contains(unCliente4))
//            usuarios.add(unCliente4);
//        
//        System.out.println("Clientes");
//        System.out.println("========");
//        for(Usuario c : usuarios) {
//            if (c instanceof Cliente) {
//                c.mostrar();
//                System.out.println();
//            }
//        }
//        System.out.println();        
//                
//        Usuario unEmpleado1 = new Empleado("empleado1@bar.com", "claveEmpleado1", "ApellidoEmpleado1", "NombreEmpleado1");        
//        Usuario unEmpleado2 = new Empleado("empleado2@bar.com", "claveEmpleado2", "ApellidoEmpleado2", "NombreEmpleado2");        
//        Usuario unEmpleado3 = new Empleado("empleado3@bar.com", "claveEmpleado3", "ApellidoEmpleado3", "NombreEmpleado3");
//        Usuario unEmpleado4 = new Empleado("empleado3@bar.com", "claveEmpleado4", "ApellidoEmpleado4", "NombreEmpleado4");
//        //empleado repetido
//        
//        if (!usuarios.contains(unEmpleado1))
//            usuarios.add(unEmpleado1);
//        if (!usuarios.contains(unEmpleado2))
//            usuarios.add(unEmpleado2);
//        if (!usuarios.contains(unEmpleado3))
//            usuarios.add(unEmpleado3);
//        if (!usuarios.contains(unEmpleado4))
//            usuarios.add(unEmpleado4);
//        
//        System.out.println("Empleados");
//        System.out.println("=========");
//        for(Usuario e : usuarios) {
//            if (e instanceof Empleado) {  //El operador instanceof permite verificar si un objeto pertenece a una clase determinada. 
//                e.mostrar();  //Metodo mostrar de cada uno
//                System.out.println();
//            }
//        }
//        System.out.println();
//
//        Usuario unEncargado1 = new Encargado("encargado1@bar.com", "claveEncargado1", "ApellidoEncargado1", "NombreEncargado1");
//        Usuario unEncargado2 = new Encargado("encargado2@bar.com", "claveEncargado2", "ApellidoEncargado2", "NombreEncargado2");
//        Usuario unEncargado3 = new Encargado("encargado3@bar.com", "claveEncargado3", "ApellidoEncargado3", "NombreEncargado3");
//        Usuario unEncargado4 = new Encargado("encargado3@bar.com", "claveEncargado4", "ApellidoEncargado4", "NombreEncargado4");
//        //encargado repetido
//
//        if(!usuarios.contains(unEncargado1))
//            usuarios.add(unEncargado1);
//        if(!usuarios.contains(unEncargado2))
//            usuarios.add(unEncargado2);
//        if(!usuarios.contains(unEncargado3))
//            usuarios.add(unEncargado3);
//        if(!usuarios.contains(unEncargado4))
//            usuarios.add(unEncargado4);
//        
//        System.out.println("Encargados");
//        System.out.println("==========");
//        for(Usuario e : usuarios) {
//            if (e instanceof Encargado) {
//                e.mostrar();
//                System.out.println();
//            }
//        }
//        System.out.println();   
//        
//        Usuario unEncargado5 = new Encargado("cliente1@bar.com", "claveEncargado4", "ApellidoEncargado4", "NombreEncargado4");
//        if(!usuarios.contains(unEncargado5))
//            usuarios.add(unEncargado5);
//        //mismo correo que un cliente, no debe agregarse
//        
//        Usuario unCliente5 = new Encargado("empleado3@bar.com", "claveEncargado4", "ApellidoEncargado4", "NombreEncargado4");
//        if(!usuarios.contains(unCliente5))
//            usuarios.add(unCliente5);
//        //mismo correo que un empleado, no debe agregarse
//        
//        
//            
//        System.out.println("Todos");
//        System.out.println("=====");
//        for(Usuario u : usuarios) {
//            u.mostrar();
//            System.out.println();
//        }
//        System.out.println();
//    
    
    /*
    FIN Segunda parte - herencia
    */
    /*
    INICIO Tercera parte - herencia
    */
    
//        ArrayList<Usuario> usuarios = new ArrayList<>();
//        ArrayList<Producto> listaProductos = new ArrayList<>();
//        ArrayList<Pedido> listaPedidos = new ArrayList<>();
//        
//        Usuario unCliente1 = new Cliente("cliente1@bar.com", "claveCliente1", "ApellidoCliente1", "NombreCliente1");        
//        Usuario unCliente2 = new Cliente("cliente2@bar.com", "claveCliente2", "ApellidoCliente2", "NombreCliente2");       
//        Usuario unCliente3 = new Cliente("cliente3@bar.com", "claveCliente3", "ApellidoCliente3", "NombreCliente3");
//        Usuario unCliente4 = new Cliente("cliente3@bar.com", "claveCliente4", "ApellidoCliente4", "NombreCliente4"); 
//        //cliente repetido
//        
//        if (!usuarios.contains(unCliente1))
//            usuarios.add(unCliente1);
//        if (!usuarios.contains(unCliente2))
//            usuarios.add(unCliente2);
//        if (!usuarios.contains(unCliente3))
//            usuarios.add(unCliente3);
//        if (!usuarios.contains(unCliente4))
//            usuarios.add(unCliente4);
//                        
//        Usuario unEmpleado1 = new Empleado("empleado1@bar.com", "claveEmpleado1", "ApellidoEmpleado1", "NombreEmpleado1");        
//        Usuario unEmpleado2 = new Empleado("empleado2@bar.com", "claveEmpleado2", "ApellidoEmpleado2", "NombreEmpleado2");        
//        Usuario unEmpleado3 = new Empleado("empleado3@bar.com", "claveEmpleado3", "ApellidoEmpleado3", "NombreEmpleado3");
//        Usuario unEmpleado4 = new Empleado("empleado3@bar.com", "claveEmpleado4", "ApellidoEmpleado4", "NombreEmpleado4");
//        //empleado repetido
//        
//        if (!usuarios.contains(unEmpleado1))
//            usuarios.add(unEmpleado1);
//        if (!usuarios.contains(unEmpleado2))
//            usuarios.add(unEmpleado2);
//        if (!usuarios.contains(unEmpleado3))
//            usuarios.add(unEmpleado3);
//        if (!usuarios.contains(unEmpleado4))
//            usuarios.add(unEmpleado4);
//        
//        Usuario unEncargado1 = new Encargado("encargado1@bar.com", "claveEncargado1", "ApellidoEncargado1", "NombreEncargado1");
//        Usuario unEncargado2 = new Encargado("encargado2@bar.com", "claveEncargado2", "ApellidoEncargado2", "NombreEncargado2");
//        Usuario unEncargado3 = new Encargado("encargado3@bar.com", "claveEncargado3", "ApellidoEncargado3", "NombreEncargado3");
//        Usuario unEncargado4 = new Encargado("encargado3@bar.com", "claveEncargado4", "ApellidoEncargado4", "NombreEncargado4");
//        //encargado repetido
//
//        if(!usuarios.contains(unEncargado1))
//            usuarios.add(unEncargado1);
//        if(!usuarios.contains(unEncargado2))
//            usuarios.add(unEncargado2);
//        if(!usuarios.contains(unEncargado3))
//            usuarios.add(unEncargado3);
//        if(!usuarios.contains(unEncargado4))
//            usuarios.add(unEncargado4);
//
//        Producto unProducto1 = new Producto(1, "Producto1", Categoria.ENTRADA, Estado.DISPONIBLE, 1.0f);        
//        Producto unProducto2 = new Producto(2, "Producto2", Categoria.PLATO, Estado.DISPONIBLE, 2.0f);
//        Producto unProducto3 = new Producto(3, "Producto3", Categoria.POSTRE, Estado.DISPONIBLE, 3.0f);
//        Producto unProducto4 = new Producto(3, "Producto4", Categoria.POSTRE, Estado.DISPONIBLE, 4.0f);
//        //producto repetido
//        
//        if(!listaProductos.contains(unProducto1))
//            listaProductos.add(unProducto1);
//        if(!listaProductos.contains(unProducto2))
//            listaProductos.add(unProducto2);
//        if(!listaProductos.contains(unProducto3))
//            listaProductos.add(unProducto3);
//        if(!listaProductos.contains(unProducto4))
//            listaProductos.add(unProducto4);
//        
////        System.out.println("productos");   //extra
////        for(Producto z : listaProductos) {
////            z.mostrar();
////            System.out.println();
////        }
//        
//        ArrayList<ProductoDelPedido> listapdp1 = new ArrayList<>();
//        ProductoDelPedido pdp1 = new ProductoDelPedido(listaProductos.get(0), 1);
//        ProductoDelPedido pdp2 = new ProductoDelPedido(listaProductos.get(1), 2);        
//        if (!listapdp1.contains(pdp1))
//            listapdp1.add(pdp1);
//        if (!listapdp1.contains(pdp2))
//            listapdp1.add(pdp2);
//        Pedido unPedido1 = new Pedido(1, LocalDateTime.now(), listapdp1, (Cliente)usuarios.get(0), pedidos.modelos.Estado.CREANDO); //Mostrame de cliente quee esta en usuarios el primer objeto, en este caso unCliente1       
//        
//        ArrayList<ProductoDelPedido> productosDelPedido2 = new ArrayList<>();
//        ProductoDelPedido pdp3 = new ProductoDelPedido(listaProductos.get(2), 10);
//        ProductoDelPedido pdp4 = new ProductoDelPedido(listaProductos.get(0), 20);
//        ProductoDelPedido pdp5 = new ProductoDelPedido(listaProductos.get(2), 30);
//        //producto repetido        
//        if (!productosDelPedido2.contains(pdp3))
//            productosDelPedido2.add(pdp3);
//        if (!productosDelPedido2.contains(pdp4))
//            productosDelPedido2.add(pdp4);
//        if (!productosDelPedido2.contains(pdp5))
//            productosDelPedido2.add(pdp5);
//        Pedido unPedido2 = new Pedido(2, LocalDateTime.now(), productosDelPedido2, (Cliente)usuarios.get(1), pedidos.modelos.Estado.CREANDO);        
//        
//        ArrayList<ProductoDelPedido> productosDelPedido3 = new ArrayList<>();
//        ProductoDelPedido pdp6 = new ProductoDelPedido(listaProductos.get(1), 100);
//        ProductoDelPedido pdp7 = new ProductoDelPedido(listaProductos.get(2), 200);
//        if (!productosDelPedido3.contains(pdp6))
//            productosDelPedido3.add(pdp6);
//        if (!productosDelPedido3.contains(pdp7))
//            productosDelPedido3.add(pdp7);
//        Pedido unPedido3 = new Pedido(2, LocalDateTime.now(), productosDelPedido3, (Cliente)usuarios.get(2), pedidos.modelos.Estado.CREANDO);        
//        //pedido repetido
//
//        if(!listaPedidos.contains(unPedido1))
//            listaPedidos.add(unPedido1);
//        if(!listaPedidos.contains(unPedido2))
//            listaPedidos.add(unPedido2);
//        if(!listaPedidos.contains(unPedido3))
//            listaPedidos.add(unPedido3);
//        
//        System.out.println("Pedidos");
//        System.out.println("=======");
//        for(Pedido p : listaPedidos) {
//            p.mostrar();
//            System.out.println();
//        }
//        
//        
//        ((Cliente)unCliente1).agregarPedido(unPedido1);
//        ((Cliente)unCliente1).agregarPedido(unPedido1);  //Apartado 11 primero
////       
////        //pedido repetido
////        
//        System.out.println("Pedidos de " + unCliente1.verApellido() + ", " + unCliente1.verNombre());
//        for(Pedido p : unCliente1.verPedidos()) {
//            p.mostrar();
//            System.out.println();
//        }
// 
//        
//        ((Cliente)unCliente1).cancelarPedido(unPedido1);
//        System.out.println("Pedidos de " + unCliente1.verApellido() + ", " + unCliente1.verNombre());
//        for(Pedido p : unCliente1.verPedidos()) {
//            p.mostrar();
//            System.out.println(); 
//        }
//        
//        String formato = "dd/mm/y";
//        DateTimeFormatter formateador = DateTimeFormatter.ofPattern(formato);
//        LocalDateTime ahora = this.fechaYHora;
//        return formateador.format(ahora);
//        ese es el codigo para formatear la fecha
//                
//        String formato = "HH/mm/ss";
//        DateTimeFormatter formateador = DateTimeFormatter.ofPattern(formato);
//        LocalDateTime ahora = this.fechaYHora;
//        return formateador.format(ahora);
//        y ese de la hora, si queres otro formato modificas el string formato y listo
    
    /*
    FIN Tercera parte - herencia
    */
    }
  }