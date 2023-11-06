/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package productos.modelos;

/**
 *
 * @author estudiante
 */
public enum Estado {
    
    DISPONIBLE, NODISPONIBLE;
    
    @Override
    public String toString(){
        switch (this) {
            case DISPONIBLE:
                return "diponible";
            case NODISPONIBLE:
                return "no disponible";   
                
            default:
                throw new AssertionError();
        }
    }
    
}
