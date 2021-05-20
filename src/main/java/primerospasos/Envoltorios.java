
package primerospasos;

/**
 *
 * @author Aitana
 */
public class Envoltorios {
    public static void main(String[] args) {
        int numero = 9;
        
        Integer i = numero;        
       //Integer i = new Integer (numero); es lo mismo q la línea anterior
        double numeroAdouble = i.doubleValue();
        short numeroAShort = i.shortValue();
        String numeroi = String.valueOf(numero);//no se si es envoltorio
        String cadena = Integer.toString(i);
        System.out.println("objeto i: "+i); 
        System.out.println("objeto i double: "+numeroAdouble); 
        System.out.println("objeto i short: "+numeroAShort); 
        System.out.println("entero numero a string: "+numeroi); 
        System.out.println("Integer i a string: "+cadena); 
       
    }
}
