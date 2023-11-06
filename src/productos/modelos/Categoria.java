/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package productos.modelos;

/**
 *
 * @author estudiante
 */
public enum Categoria {
    
    ENTRADA, PLATO, PRINCIPAL, POSTRE;
    
    @Override
    public String toString(){
        switch (this) {
            case ENTRADA:
                return "entrada";
            case PLATO:
                return "plato";   
            case PRINCIPAL:
                return "principal";
            case POSTRE:
                return "postre";    
            default:
                throw new AssertionError();
        }
    }
}
