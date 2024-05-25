
package paquete2;
import java.util.Scanner;
import paquete3.Informacion;
import paquete1.Mensaje;


  
public class Demo002 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
  
        short valor;
        
        System.out.println("Ingrese un valor:");
        System.out.println("a) Del 1 al 5: Mensaje Original");
        System.out.println("b) Menor a 1 o Mayor a 5: Mensaje en Mayusculas");
        valor = sc.nextShort();

        String mensaje = Mensaje.obtenerMensaje();
        int habitantes = Informacion.obtenerHabitantes() ;

        if (valor >= 1 && valor <=5) {
            System.out.printf(" %scon %d\n ", mensaje
                ,habitantes );
        } else { 
            mensaje = mensaje.toUpperCase(); 
            System.out.printf(" %scon %d\n ", mensaje
                ,habitantes ); 
        }
        
        
        
        
        // usar printf;
        
        
    }
    
}
