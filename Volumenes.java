package calq;

import javax.swing.JOptionPane;

public class Volumenes {
    
    private double area;
    
    public Volumenes(){
    area = 0;
}
    
    public void Cubo(){
        double lado = 0, volumen = 0;
        
        lado = Integer.parseInt(JOptionPane.showInputDialog("- - - - CUBO - - - -\n\n"
                + "Introduce el lado del cubo:"));
        
        volumen = lado * lado * lado;
        
        JOptionPane.showMessageDialog(null, "- - - - CUBO - - - -\n\n"
                + "El LADO introducido fue: " + lado
                + "\nEl VOLUMEN del CUBO es: " + volumen);
    }
    
    public void Cilindro(){
        double altura = 0, radio = 0, volumen = 0;
        
        altura = Integer.parseInt(JOptionPane.showInputDialog("- - - - CILINDRO - - - -\n\n"
                + "Introduce la altura del cilindro:"));
        radio = Integer.parseInt(JOptionPane.showInputDialog("- - - - CILINDRO - - - -\n\n"
                + "Introduce el radio del cilindro:"));
        
        volumen = radio * radio * altura *Math.PI;
        
        JOptionPane.showMessageDialog(null, "- - - - CILINDRO - - - -\n\n"
                + "La ALTURA introducida fue: " + altura
                + "\nEl RADIO introducido fue: " + radio
                + "\nEl VOLUMEN del CILINDRO es: " + volumen);
    }
    
    public void Esfera(){
        double radio = 0, volumen = 0;
        
        radio = Integer.parseInt(JOptionPane.showInputDialog("- - - - ESFERA - - - -\n\n"
                + "Introduce el radio de la esfera:"));
        
        volumen = (((4)*(Math.PI)*(radio*radio*radio))/3);
        
        JOptionPane.showMessageDialog(null, "- - - - ESFERA - - - -\n\n"
                + "El RADIO introducido fue: " + radio
                + "\nEl VOLUMEN de la ESFERA es: " + volumen);
    }
    
    public void Cono(){
        double radio = 0, volumen = 0, altura = 0;
        
        radio = Integer.parseInt(JOptionPane.showInputDialog("- - - - CONO - - - -\n\n"
                + "Introduce el radio del cono:"));
        altura = Integer.parseInt(JOptionPane.showInputDialog("- - - - CONO - - - -\n\n"
                + "Introduce el radio del cono:"));
        
        volumen = (((altura)*(Math.PI)*(radio*radio))/3);
        
        JOptionPane.showMessageDialog(null, "- - - - CONO - - - -\n\n"
                + "El RADIO introducido fue: " + radio
                + "\nLa ALTURA introducida fue: " + altura
                + "\nEl VOLUMEN del CONO es: " + volumen);
    }
    
    public void Areas(){
        double base = 0, altura = 0, apotema = 0, baseMayor = 0, baseMenor = 0, lado = 0;
        
        int eleccion = 0;
        String[] options = {"CUADRADO", "TRIANGULO", "RECTANGULO", "TRAPECIO", "POLIGONO REGULAR (+5)"};
        
        eleccion = JOptionPane.showOptionDialog(null, "Seleccione la base de su figura: ", " - - - - MENU BASES - - - - ", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
        
        switch(eleccion){
            
            case 0://CUADRADO
                
                break;
                
                
            case 1://TRIANGULO
                
                break;
                
                
            case 2://RECTANGULO
                
                break;
                
                
            case 3://TRAPECIO
                
                break;
                
                
            case 4://POLIGONO
                
                break;           
            
        }
    }
    
}
