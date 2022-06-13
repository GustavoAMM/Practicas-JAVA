package segundoParcial;

import java.util.LinkedList;
import java.util.Queue;
import javax.swing.JOptionPane;

/**
 *
 * @author Jorge Eduardo
 */
public class ColaDinamica {
    Queue<Integer> cola;
    
    public ColaDinamica(){
        
        cola = new LinkedList<Integer>();
    }
    
    public void Menu(){
        
        char op = '\0';
        
        do {
            op = JOptionPane.showInputDialog("----- M E N Ú -----"
            + "\n\n1. Agregar dato."
            + "\n2. Leer dato."
            + "\n3. Extraer dato."
            + "\n4. Imprimir estructura cola."
            + "\n5. Vaciar estructura cola."
            + "\n6. Cerrar.").charAt(0);
            
            int dato = 0;
            switch(op){
                case '1':
                    dato = Integer.parseInt(JOptionPane.showInputDialog("Ingresa tu edad"));
                    cola.add(dato);
                    JOptionPane.showMessageDialog(null, "Dato almacenado con éxito");
                break;
                case '2':
                    if(cola.isEmpty())
                        JOptionPane.showMessageDialog(null, "Estructura vacía, no hay datos para leer");
                    else{
                        dato = cola.peek();
                        JOptionPane.showMessageDialog(null, "Dato en cola: " +dato);
                    }
                break;
                case '3':
                    if(cola.isEmpty())
                        JOptionPane.showMessageDialog(null, "Estructura vacía, no hay datos para leer");
                    else{
                        dato = cola.poll();
                        JOptionPane.showMessageDialog(null, "Dato extraído y eliminado: " +dato);
                    }
                break;
                case '4':
                    JOptionPane.showMessageDialog(null, cola);
                break;
                case '5':
                    cola.clear();
                    JOptionPane.showMessageDialog(null, "Se ha vaciado la estructura");
                break;
                case '6':
                    JOptionPane.showMessageDialog(null, "Cerrando el sistema. . .");
                break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción incorrecta, selecciona una del menú");
                break;
            }
        }while(op != '6');
    }
}
