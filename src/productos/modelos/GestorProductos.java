/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package productos.modelos;

import java.util.ArrayList;

/**
 *
 * @author estudiante
 */
public class GestorProductos {
    
    public static final String EXITO = "Producto creado/modificado con éxito";
    public static final String ERROR_CODIGO = "El código del producto es incorrecto";
    public static final String ERROR_DESCRIPCION = "La descripción del producto es incorrecta";
    public static final String ERROR_PRECIO = "El precio del producto es incorrecto";
    public static final String ERROR_CATEGORIA = "La categoría del producto es incorrecta";
    public static final String ERROR_ESTADO = "El precio del producto es incorrecto";
    public static final String PRODUCTOS_DUPLICADOS = "Ya existe un producto con ese código";
    public static final String VALIDACION_EXITO = "Los datos del producto son correctos";
    public static final String PRODUCTO_INEXISTENTE = "No existe el producto especificado";
    
    
    ArrayList<Producto> listaProductos;
    
    private static GestorProductos gestor;
    
    private GestorProductos(){
        
    }
    
    public static GestorProductos crear(){
        
        if (gestor == null) {
            gestor = new GestorProductos();
            
        }
        return gestor;
    }
    
    /*Metodo validarProducto*/
    private String validarProducto(int codigo, String descripcion, float precio, Categoria categoria, Estado estado) {
        
        if (codigo == 0) {
            return ERROR_CODIGO;
        } else if (descripcion == null) {
            return ERROR_DESCRIPCION;
        } else if (precio <= 0) {
            return ERROR_PRECIO;
        } else if (categoria == null) {
            return ERROR_CATEGORIA;
        } else if (estado == null) {
            return ERROR_ESTADO;
        } else {
            return VALIDACION_EXITO;
        }
        
    }

    /*Metodo crearProducto*/
    public String crearProducto(int codigo, String descripcion, float precio, Categoria categoria, Estado estado) {
        Producto producto = new Producto(codigo, descripcion, categoria, estado, precio);
        if (this.validarProducto(codigo, descripcion, precio, categoria, estado).equals(VALIDACION_EXITO)) {
            if (this.listaProductos.contains(producto)) {
                return PRODUCTOS_DUPLICADOS;
            } else {
                this.listaProductos.add(producto);

            }
        }
        return EXITO;
    }

    /*Metodo modificarProducto*/
    public String modificarProducto(Producto productoAModificar, int codigo, String descripcion, float precio, Categoria categoria,
            Estado estado) {

        if (this.validarProducto(codigo, descripcion, precio, categoria, estado).equals(VALIDACION_EXITO)) {
            if (!this.listaProductos.contains(productoAModificar)) {
                return PRODUCTO_INEXISTENTE;
            } else {
                listaProductos.get(listaProductos.indexOf(productoAModificar)).asignarCodigo(codigo);
                listaProductos.get(listaProductos.indexOf(productoAModificar)).asignarDescripcion(descripcion);
                listaProductos.get(listaProductos.indexOf(productoAModificar)).asignarPrecio(precio);
                listaProductos.get(listaProductos.indexOf(productoAModificar)).asignarCategoria(categoria);
                listaProductos.get(listaProductos.indexOf(productoAModificar)).asignarEstado(estado);
            }
        }
        return EXITO;
    }

    /*Metodo Menu*/
    public ArrayList<Producto> menu() {
        return listaProductos;
      
    }


    /*Metodo buscarProducto*/
    public ArrayList<Producto> buscarProductos(String descripcion) {
        ArrayList<Producto> Coincidencias = new ArrayList();
        for (Producto prod : listaProductos) {
            if (prod.verDescripcion().contains(descripcion)) {
                Coincidencias.add(prod);
            }
        }
        return Coincidencias;
    }

    /*Metodo existeProducto*/
    public boolean existeEsteProducto(Producto producto) {
        if (!this.listaProductos.contains(producto)) {
            return false;
        } else {
            return true;
        }
    }

    /*Metodo verProductosPorCategoria*/
    public ArrayList<Producto> verProductosPorCategoria(Categoria categoria) {
        ArrayList<Producto> Coincidencias = new ArrayList();
        for (Producto prod : listaProductos) {
            if (prod.verCategoria().equals(categoria)) {
                Coincidencias.add(prod);
            }
        }
        return Coincidencias;
    }

    /*Metodo obtenerProducto*/
    public Producto obtenerProducto(Integer codigo) {

        for (Producto prod : listaProductos) {
            if (prod.verCodigo() == codigo) {
                return prod;

            }
        }
        return null;
    }
    
        
}
