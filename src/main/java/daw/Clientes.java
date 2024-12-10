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
    
    //visibilidad de atributos y metodos
    //si no hay modificador --> default (se vem desde propia clase y clases del paquete)
    //public --> cualquier clase tiene acceso
    //proteccted --> propia clase, clases del paquete y subclases
    //private --> solo propia clase
    
    private int idCliente;
    private String nombre;
    private String apellidos;
    private String nif;
    private String telefono;
    private LocalDate fechaNacimiento;
    
    // Metodo constructor - se debe llamar igual que la clase
    // no devuelve nada pero no se le pone void
    // permite crear objetos
    // si no pongo constructor en la clase, se crea uno sin parametros
    public Clientes(int identificador, String nomCliente, String apeCliente,
            String nifCliente, String telefCliente, LocalDate fechaNacCliente){
        
        // izquierda en rosa los atributos del objeto
        //derecha en negro, los parametros del constructor
        if(identificador<0){
            throw new IllegalArgumentException("Id no valido");
        }
        
        idCliente = identificador;
        nombre = nomCliente;
        apellidos = apeCliente;
        nif = nifCliente;
        telefono = telefCliente;
        fechaNacimiento = fechaNacCliente;
    }
    // construcctor por defecto sin parametros
    // metodos sobrecargados
    public Clientes(){
        
    }
    
    //metodo get para el id
    public int getIdCliente(){
        return idCliente;
    }
    public String getNombre(){
        return nombre;
    }
    public void setApellidos(String nuevoAp){
        apellidos = nuevoAp;
    }
    
    // Sobreescritura del metodo toString
    // Devuelve un String con la representacion del objeto
    public String toString(){
        return "nombre: "+nombre+" apellido: "+apellidos+" nif: "+nif;
    }
}
