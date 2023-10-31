/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package productos.modelos;

import java.util.ArrayList;

/**
 *
 * @author gabri
 */
public class GestorProductos {
    private ArrayList <Producto> productos = new ArrayList<>();
    private static GestorProductos gestor;
    
    public static final String EXITO_CREADO = "Producto creado exitosamente";
    public static final String EXITO_MODIFICADO = "Producto modificado exitosamente";
    public static final String ERROR_CODIGO = "El código del producto es incorrecto";
    public static final String ERROR_DESCRIPCION = "La descripción del producto es incorrecta";

    public static final String ERROR_PRECIO = "El precio del producto es incorrecto";
    public static final String ERROR_CATEGORIA = "La categoría del producto es incorrecta";

    public static final String ERROR_ESTADO = "El precio del producto es incorrecto";
    public static final String PRODUCTOS_DUPLICADOS = "Ya existe un producto con ese código";

    public static final String VALIDACION_EXITO = "Los datos del producto son correctos";

    public static final String PRODUCTO_INEXISTENTE = "No existe el producto especificado";
    
    
    
    private GestorProductos(){
    
    }
    
    public static GestorProductos crear(){
        if(gestor == null){
            gestor = new GestorProductos();
        }
        
        return gestor;
    
    }
    
    public String crearProducto(int codigo, String descripcion, float precio, Categoria categoria, Estado estado){
        if(codigo < 0){
            return ERROR_CODIGO;
        }
        
        if(descripcion.isEmpty() || descripcion.isBlank() ){
            return ERROR_DESCRIPCION;
        }
        
        if(precio > 0){
            return ERROR_PRECIO;
        }
        
        if(categoria == null){
            return ERROR_CATEGORIA;
        }
        
        if(estado == null){
            return ERROR_ESTADO;
        }
        
        productos.add(new Producto(codigo,descripcion, categoria,estado,precio));
        
        return EXITO_CREADO;
    }
    /*
    public String modificarProducto(Producto productoAModificar, int codigo, String descripcion, float precio, Categoria categoria, Estado estado){}

    public ArrayList<Producto> menu(){}
    
    public ArrayList<Prodcuto> buscarProductos(String descripcion){}
    
    public boolean existeEsteProducto (Producto producto){}
    
    public ArrayList <Producto> verProductosPorCategoria(Categoria categoria){}
    
    public Producto obtenerProducto(Integer codigo){}
    */
}