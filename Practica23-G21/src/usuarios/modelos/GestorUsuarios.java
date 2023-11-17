/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package usuarios.modelos;

import java.util.ArrayList;

/**
 *
 * @author gabri
 */
public class GestorUsuarios {
    private ArrayList <Usuario> usuarios = new ArrayList<>();
    private static GestorUsuarios gestor;
    
    public static final String EXITO = "Usuario creado/modificado con éxito";
    public static final String ERROR_CORREO = "El correo del usuario es incorrecto";
    public static final String ERROR_APELLIDO = "El apellido del usuario es incorrecto";
    public static final String ERROR_NOMBRE = "El nombre del usuario es incorrecto";
    public static final String ERROR_CLAVES = "Las claves especificadas no coinciden o son incorrectas";
    public static final String ERROR_PERFIL = "El perfil del usuario es incorrecto";
    public static final String PERFIL_CAMBIO = "El usuario no puede cambiarse deperfil";
    public static final String ERROR_PERMISOS = "No se tienen los permisos pararealizar esta funcionalidad";
    public static final String USUARIOS_DUPLICADOS = "Ya existe un usuario con esecorreo";
    public static final String USUARIO_INEXISTENTE = "No existe el usuario especificado";
    public static final String VALIDACION_EXITO = "Los datos del usuario son correctos";
    
    private GestorUsuarios(){
      
    }
    
    public static GestorUsuarios crear(){
        if(gestor == null){
            gestor= new GestorUsuarios();
        }
        
        return gestor;
    }
    
    public String crearUsuario(String correo, String apellido, String nombre, String clave, String claveRepetida){
        String validez = validarDatos(correo,apellido,nombre,clave,claveRepetida);
        if (validez.equals(EXITO)) 
            return EXITO;
        else 
            return validez;        
    }
    
    public ArrayList<Usuario> verUsuarios(){
        return this.usuarios;
    }
    
    
    public ArrayList<Usuario> buscarUsuarios(String apellido){
         ArrayList<Usuario> apellidoBuscado = new ArrayList<>();
        for(Usuario u: usuarios){
            if(u.verApellido().equals(apellido) || u.verApellido().startsWith(apellido)  ){
            apellidoBuscado.add(u);
            }
        
        }
        
        return apellidoBuscado;
    }
    
    public boolean existeEsteUsuario(Usuario usuario){
        
        return this.usuarios.contains(usuario);
        
    }
    
    public Usuario obtenerUsuario(String correo){
        
        for(Usuario u : usuarios){
            if(u.verCorreo().equals(correo)){
                return u;
            }
        }
        
        return null;
    }
    
    public String validarDatos (String correo, String apellido, String nombre, String clave , String claveRepetida) {
        
        if ( correo == null || !correo.contains("@") ){
            return ERROR_CORREO;
        }
        
        if(apellido == null || apellido.isBlank()){
            return ERROR_APELLIDO;
        }
        
        if(nombre == null || nombre.isBlank()){
            return ERROR_NOMBRE;
        }
        
        if(clave == null ||  clave.isBlank()){
            return ERROR_CLAVES;
        }
        
        if(claveRepetida == null || claveRepetida.isBlank() || claveRepetida.equals(clave)){
            return ERROR_CLAVES;
        }
        
        return EXITO;
        
    }
}