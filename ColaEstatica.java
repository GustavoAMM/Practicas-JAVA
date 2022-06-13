package segundoParcial;

import javax.swing.JOptionPane;

/**
 *
 * @author Jorge Eduardo
 */

public class ColaEstatica {
    private String cola[];
    private int cont;
    
    public ColaEstatica(){
        
        cola = new String[5];
        cont = 0;
    }
    
    public void add(String dato){ //Método para agregar datos
        
        cola[cont++] = dato;
        JOptionPane.showMessageDialog(null, "Dato almacenado con éxito");
    }
    
    public String peek(){  //Método para leer datos
        
        return cola[0];   
    }
    
    public String poll(){  //Método para extraer datos
    
        String dato = cola[0];
        
        for (int i=0; i<cont-1; i++){
            
            cola[i] = cola[i+1];
        }
        
        cont--;
        return dato;
    }
    
    public void Clear(){
        
        cont = 0;
    }
    
    public void Print(){
        
        String dato = "[ ";
        
        for (int i=0; i<(cont-1); i++){
          dato += cola[i] + " , ";  
        }
        
        dato += cola[cont-1] + " ]";
        JOptionPane.showMessageDialog(null, dato);
    }
    
    public boolean isEmpty(){
        if (cont==0)
            return true;
        else
            return false;
    }
    
    public boolean isFull(){
        if (cont == cola.length)
            return true;
        else
            return false;
    }
}
