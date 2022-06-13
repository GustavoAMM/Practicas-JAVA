package calq;

import javax.swing.JOptionPane;

public class AreasPerimetros {
    
    
    public void Cuadrado(){
        
        double lado=0, area=0, perimetro=0;
        
        lado = Integer.parseInt(JOptionPane.showInputDialog("- - - - CUADRADO - - - -\n\n"
                + "Introduce el lado del cuadrado:")); 
        
        area = lado * lado;
        perimetro = lado * 4;
        
        JOptionPane.showMessageDialog(null, "- - - - CUADRADO - - - -\n\n"
                + "El LADO introducido fue: " + lado
                + "\nEl AREA del CUADRADO es: " + area
                + "\nEl PERIMETRO del CUADRADO es: " + perimetro);
}
    public void Circulo(){
        
        double radio=0, area=0, perimetro;
        
        radio = Integer.parseInt(JOptionPane.showInputDialog("- - - - CIRCULO - - - -\n\n"
                + "Introduce el radio del circulo:")); 
        
        area = radio * radio * (Math.PI);
        perimetro = 2 * radio * (Math.PI);
        
        JOptionPane.showMessageDialog(null, "- - - - CIRCULO - - - -\n\n" 
                + "El RADIO introducido fue: " + radio
                + "\nEl AREA del CIRCULO es: " + area
                + "\nEl PERIMETRO del CIRCULO es: " + perimetro);
    }
    
    public void Rectangulo(){
        double base=0, altura = 0, area=0, perimetro=0;
        
        base = Integer.parseInt(JOptionPane.showInputDialog("- - - - RECTANGULO - - - -\n\n"
                + "Introduce la base del rectangulo:")); 
        altura = Integer.parseInt(JOptionPane.showInputDialog("- - - - RECTANGULO - - - -\n\n"
                + "Introduce la altura del rectangulo:"));
        
        area = base * altura;
        perimetro = base + base + altura + altura;
        
        JOptionPane.showMessageDialog(null, "- - - - RECTANGULO - - - -\n\n"
                + "La BASE introducida fue: " + base
                + "\nLa ALTURA introducida fue: " + altura
                + "\nEl AREA del RECTANGULO es: " + area
                + "\nEl PERIMETRO del RECTANGULO es: " + perimetro);
    }
    
    public void TrapecioArea(){
        double baseMayor=0, baseMenor=0, altura=0, area=0;
        
        baseMayor = Integer.parseInt(JOptionPane.showInputDialog("- - - - TRAPECIO - - - -\n\n"
                + "Introduce la base mayor del trapecio:")); 
        baseMenor = Integer.parseInt(JOptionPane.showInputDialog("- - - - TRAPECIO - - - -\n\n"
                + "Introduce la base menor del trapecio:")); 
        altura = Integer.parseInt(JOptionPane.showInputDialog("- - - - TRAPECIO - - - -\n\n"
                + "Introduce la altura menor del trapecio:"));
        
        area = (((baseMayor + baseMenor) * altura)/2);
        
        JOptionPane.showMessageDialog(null, "- - - - TRAPECIO - - - -\n\n"
                + "La BASE MAYOR introducida fue: " + baseMayor
                +"\nLa BASE MENOR introducida fue: " + baseMenor
                +"\nLa ALTURA introducida fue: " + altura
                + "\nEl AREA del TRAPECIO es: " + area);
    }
    public void TrapecioPerimetro(){
        double baseMayor=0, baseMenor=0, lado=0, perimetro=0;
        
        baseMayor = Integer.parseInt(JOptionPane.showInputDialog("- - - - TRAPECIO - - - -\n\n"
                + "Introduce la base mayor del trapecio:")); 
        baseMenor = Integer.parseInt(JOptionPane.showInputDialog("- - - - TRAPECIO - - - -\n\n"
                + "Introduce la base menor del trapecio:")); 
        lado = Integer.parseInt(JOptionPane.showInputDialog("- - - - TRAPECIO - - - -\n\n"
                + "Introduce el lado menor del trapecio:"));
        
        perimetro = lado + lado +  baseMayor + baseMenor;
        
        JOptionPane.showMessageDialog(null, "- - - - TRAPECIO - - - -\n\n"
                + "La BASE MAYOR introducida fue: " + baseMayor
                +"\nLa BASE MENOR introducida fue: " + baseMenor
                +"\nEl LADO introducido fue: " + lado
                + "\nEl PERIMETRO del TRAPECIO es: " + perimetro);
    }
    
    public void RomboArea(){
        double diagonalMayor=0, diagonalMenor=0, area=0;
        
        diagonalMayor = Integer.parseInt(JOptionPane.showInputDialog("- - - - ROMBO - - - -\n\n"
                + "Introduce la diagonal mayor del rombo:")); 
        diagonalMenor = Integer.parseInt(JOptionPane.showInputDialog("- - - - ROMBO - - - -\n\n"
                + "Introduce la diagonal menor del rombo:"));
        
        area = ((diagonalMayor * diagonalMenor)/2);
        
        JOptionPane.showMessageDialog(null, "- - - - ROMBO - - - -\n\n"
                + "La DIAGONAL MAYOR introducida fue: " + diagonalMayor
                +"\nLa DIAGONAL MENOR introducida fue: " + diagonalMenor
                + "\nEl AREA del TRAPECIO es: " + area);        
    }
    public void RomboPerimetro(){
    double lado = 0, perimetro=0;
    
    lado = Integer.parseInt(JOptionPane.showInputDialog("- - - - ROMBO - - - -\n\n"
                + "Introduce el lado del rombo:")); 
    
    perimetro = lado * 4;
    
    JOptionPane.showMessageDialog(null, "- - - - ROMBO - - - -\n\n"
                + "El LADO introducido fue: " + lado
                + "\nEl PERIMETRO del ROMBO es: " + perimetro);     
}
    
    public void PoligonoRegular(){
        double lado = 0, apotema = 0, numero = 0, area = 0, perimetro = 0;
        
        lado = Integer.parseInt(JOptionPane.showInputDialog("- - - - POLIGONO REGULAR (+5) - - - -\n\n"
                + "Introduce el lado del poligono:")); 
        apotema = Integer.parseInt(JOptionPane.showInputDialog("- - - - POLIGONO REGULAR (+5) - - - -\n\n"
                + "Introduce el apotema del poligono:")); 
        numero = Integer.parseInt(JOptionPane.showInputDialog("- - - - POLIGONO REGULAR (+5) - - - -\n\n"
                + "Introduce el numero de lados del poligono:")); 
        
        perimetro = numero * lado;
        area = ((perimetro * apotema) / 2);
        
        JOptionPane.showMessageDialog(null, "- - - - POLIGONO REGULAR (+5) - - - -\n\n"
                + "El LADO introducido fue: " + lado
                + "\nEl APOTEMA introducido fue: " + apotema
                + "\nEl AREA del POLIGONO es: " + area
                + "\nEl PERIMETRO del POLIGONO es: " + perimetro); 
    }
    
    //TRIANGULOS
    
    public void TrianguloHeron(){
        double lado1 = 0, lado2= 0, lado3 = 0, perimetro = 0, semiperimetro = 0, area = 0;
        
        lado1 = Integer.parseInt(JOptionPane.showInputDialog("- - - - TRIANGULO - - - -\n\n"
                + "Introduce el lado 1 del triangulo:"));
        lado2 = Integer.parseInt(JOptionPane.showInputDialog("- - - - TRIANGULO - - - -\n\n"
                + "Introduce el lado 2 del triangulo:"));
        lado3 = Integer.parseInt(JOptionPane.showInputDialog("- - - - TRIANGULO - - - -\n\n"
                + "Introduce el lado 3 del triangulo:"));
        
        perimetro = lado1 + lado2 + lado3 ;
        semiperimetro = perimetro / 2;
        area = (Math.sqrt((semiperimetro)*(semiperimetro - lado1)*(semiperimetro - lado2)*(semiperimetro - lado2)));
    }
    public void TrianguloBasico(){
        double base = 0, altura = 0, area=0;
        
        base = Integer.parseInt(JOptionPane.showInputDialog("- - - - TRIANGULO - - - -\n\n"
                + "Introduce la base del triangulo:"));
        altura = Integer.parseInt(JOptionPane.showInputDialog("- - - - TRIANGULO - - - -\n\n"
                + "Introduce la altura del triangulo:")); 
        
        area = ((base * altura) / 2);
        
        JOptionPane.showMessageDialog(null, "- - - - TRIANGULO - - - -\n\n"
                + "La BASE introducida fue: " + base
                + "\nLa ALTURA introducia gue: " + altura
                + "\nEl AREA el triagulo es: " + area);
    }
}



