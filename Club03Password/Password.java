import javax.swing.*;
/**
 * La clase Password, valida que la Contraseña introducida sea la correcta,
 * únicamente permite la introcucción de tres veces la contraseña, de lo 
 * contrario, ya no permite el ingreso de más contraseñas.
 * @author  Díaz Ruiz Alejandro
 * @version 1.0
 * @since   2019-12-01
 */
public class Password{
    /** 
     * Contraseña establecida
     */
    static final String p1 = "password"; 
    
    /**
     * Constructor de la clase Password heredado de Object.
     * @param null Sin parámetros.
     */
    public Password(){
        
    }
    
    /**
     * Método que determina si la palabra introducida por el usuario
     * coincide con la contraseña establecida en p1
     * @param null Sin parámetros.
     * @return Nothing.
     */
    public static void pass(){
        /** Variables */
        int oport = 0;
        int inten = 2;
        /** Ciclo que cuenta las veces que se introduce la contraseña */
        while (oport <=2){
            /**Recibe mediante teclado la contraseña*/
            String p = JOptionPane.showInputDialog("Introduce Contraseña");
            /** Condición si lo que el usuario escribe, coincide con la contraseña establecida*/
            if (p1.equals(p)){
                StdOut.println("Contraseña correcta!");
                break;
            }else{
                StdOut.println((inten == 0)?"Se acabaron los intentos":"Quedan "+inten+" intentos");
                inten--;
                oport++;
            }         
        }     
     }
     
    /**
     * Método main que usa el método pass().
     * @param args sin usar.
     * @return Nothing.
     */
    public static void main(String [] args){
        pass();
    }
}