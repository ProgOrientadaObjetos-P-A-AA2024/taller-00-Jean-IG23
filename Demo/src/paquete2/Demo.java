/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;
import paquete3.Informacion;
import paquete1.Mensaje;


/**
 *
 * @author reroes
 */
public class Demo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.printf(" %scon %d\n ",   Mensaje.obtenerMensaje()
                , Informacion.obtenerHabitantes() );
        // usar printf;
        
        // importar los paquetes con las clases necesarias para que dentro de 
        // un printf llamar a las funciones e imprimir la cadena formateada
        // con los datos que corresponde y pide la orden del taller
    }
    
}
