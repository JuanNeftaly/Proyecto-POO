package Conexiones;
import java.time.LocalDateTime;

/**
 * @author juanc
 */
public class ConsultarFecha {
    
    static public String consultarFecha() {
        
        // guardar inicio de partida
        LocalDateTime DATETIME = LocalDateTime.now();
        return DATETIME.toString().replace("T"," ");
        
    }
}
