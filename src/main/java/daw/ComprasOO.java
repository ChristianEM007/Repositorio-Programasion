
package daw;

import java.time.LocalDate;

/**
 *
 * @author christian
 */
public class ComprasOO {

    public static void main(String[] args) {
        
        // Instantiacion de un objeto con el constructor por defecto
        
        Clientes c1 = new Clientes();
        
        System.out.println(c1);
        
        // para instanciar un objeto necesito el operador 
        // new + constructor 
        // new permite reservar espacio en memoria para dar valor a los atributos del objeto
        Clientes c2 = new Clientes(1, "Manuel", "Lopez","23545G", "658871452", LocalDate.of(2000,12,12));
        System.out.println(c2);
        
        
        Productos p1 = new Productos(1,"cebolla",50.0, 30);
        System.out.println(p1);
    }
}
