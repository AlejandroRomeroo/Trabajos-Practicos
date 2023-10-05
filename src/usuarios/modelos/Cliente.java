/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package usuarios.modelos;

/**
 *
 * @author NEW GAME
 */
public class Cliente {

    private String correo;
    private String clave;
    private String apellido;
    private String nombre;

    //Metodo Mostrar
    public void mostrar() {

        System.out.println("Nombre y Apellido: " + nombre + " " + apellido + ",  Clave: " + clave + ",  Correo: " + correo);

    }

    //Metodo Constructor 
    public Cliente() {

    }

    public Cliente(String correo, String clave, String apellido, String nombre) {
        this.correo = correo;
        this.clave = clave;
        this.apellido = apellido;
        this.nombre = nombre;
    }

    public String verCodigo() {  //get
        return correo;
    }

    public void asignarCodigo(String codigo) {   //set
        this.correo = codigo;
    }

    public String verClave() {
        return clave;
    }

    public void asignarClave(String clave) {
        this.clave = clave;
    }

    public String verApellido() {
        return apellido;
    }

    public void asignarApellido(String apellido) {
        this.apellido = apellido;
    }

    public String verNombre() {
        return nombre;
    }

    public void asignarNombre(String nombre) {
        this.nombre = nombre;
    }

}
