/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package usuarios.modelos;

import java.util.ArrayList;

/**
 *
 * @author estudiante
 */
public class GestorUsuarios {
    
    public static final String EXITO = "Usuario creado/modificado con éxito";
    public static final String ERROR_CORREO = "El correo del usuario es incorrecto";
    public static final String ERROR_APELLIDO = "El apellido del usuario es incorrecto";
    public static final String ERROR_NOMBRE = "El nombre del usuario es incorrecto";
    public static final String ERROR_CLAVES = "Las claves especificadas no coinciden o son incorrectas";
    public static final String ERROR_PERFIL = "El perfil del usuario es incorrecto";
    public static final String PERFIL_CAMBIO = "El usuario no puede cambiarse de perfil";
    public static final String ERROR_PERMISOS = "No se tienen los permisos para realizar esta funcionalidad";
    public static final String USUARIOS_DUPLICADOS = "Ya existe un usuario con ese correo";
    public static final String USUARIO_INEXISTENTE = "No existe el usuario especificado";
    public static final String VALIDACION_EXITO = "Los datos del usuario son correctos";

    ArrayList<Usuario> listaUsuarios = new ArrayList();

    /*Patron Singleton*/
    private static GestorUsuarios gestor;

    private GestorUsuarios() {
    }

    private static GestorUsuarios crearGestor() {
        
        if (gestor == null) {
            gestor = new GestorUsuarios();
        }
        return gestor;
    }

    /*Metodo validarUsuario*/
    private String validarUsuario(String correo, String apellido, String nombre, String clave, String claveRepetida) {
        if (correo == null) {
            return ERROR_CORREO;
        } else if (apellido == null) {
            return ERROR_APELLIDO;
        } else if (nombre == null) {
            return ERROR_NOMBRE;
        } else if (clave == null) {
            return ERROR_CLAVES;
        } else if (claveRepetida == null) {
            return ERROR_CLAVES;
        }  else {
            return VALIDACION_EXITO;
        }
    }

    /*Metodo crearUsuario*/
    public String crearUsuario(String correo, String apellido, String nombre, String clave, String claveRepetida) {
        Usuario usuario = null;
        if (this.validarUsuario(correo, apellido, nombre, clave, claveRepetida).equals(VALIDACION_EXITO)) {
            if (this.listaUsuarios.contains(usuario)) {
                return USUARIOS_DUPLICADOS;
            } else {
                this.listaUsuarios.add(usuario);
            }
        }
        return EXITO;
    }

    /*Metodo verUsuario*/
    public ArrayList<Usuario> menu() {
        return listaUsuarios;
    }
    
    /*Metodo buscarUsuario*/
    public ArrayList<Usuario> buscarUsuario(String apellido) {
        ArrayList<Usuario> Coincidencias = new ArrayList();
        for (Usuario usu : listaUsuarios) {
            if (usu.verApellido().contains(apellido)) {
                Coincidencias.add(usu);
            }
        }
        return Coincidencias;
    }
    
    /*Metodo existeUsuario*/
    public boolean existeEsteProducto(Usuario usuario) {
        if (!this.listaUsuarios.contains(usuario)) {
            return false;
        } else {
            return true;
        }
    }
    
    /*Metodo obtenerUsuario*/
    public Usuario obtenerUsuario(String correo) {

        for (Usuario usu : listaUsuarios) {
            if (usu.verCorreo().equals(correo)) {
                return usu;
            }
        }     return null;
    }
    
}
