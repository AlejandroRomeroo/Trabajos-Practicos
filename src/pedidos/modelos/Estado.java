/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package pedidos.modelos;

/**
 *
 * @author estudiante
 */
public enum Estado {
    CREANDO, SOLICITADO, PROCESANDO, ENTREGADO;
    
    @Override
    public String toString(){
        switch (this) {
            case CREANDO:
                return "Creando";
            case SOLICITADO:
                return "Solicitado";   
            case PROCESANDO:
                return "Procesando";
            case ENTREGADO:
                return "Entregado";    
            default:
                throw new AssertionError();
        }
    }
    
    
}
