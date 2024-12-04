package daw;

import java.time.LocalDate;

/**
 *
 * @author christian
 */
public class Clientes {
    
    // atributos de clase (llevan static)
    
    // atributos de instancia (no llevan static)
    // objetos a null, numeros a cero y boolean false
    int idCliente;
    String nombre;
    String apellidos;
    String nif;
    String telefono;
    LocalDate fechaNacimiento;
    
    // M
    
    // Sobreescritura del metodo toString
    // Devuelve un String con la representacion del objeto
    public String toString(){
        return "nombre: " + nombre + "apellido: " + apellidos;
    }
}
