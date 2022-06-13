import javax.swing.JOptionPane;
import java.text.*;
public class Conversiones {
    DecimalFormat df = new DecimalFormat("#.000");
    
    //--------------------Sistema inglés a métrico decimal --------------

    public void inAcm () { //Pulgadas a centimetros
        double in = 2.54,cm;
        cm =  Float.parseFloat(JOptionPane.showInputDialog(null, "Insertar cantidad en pulgadas"));
        double resul=in*cm;
        JOptionPane.showMessageDialog(null,df.format(resul)+" cm");
    }

    public void ftAcm(){ // pie a centimetros
        double ft = 30.48, cm;
        cm = Float.parseFloat(JOptionPane.showInputDialog(null, "Insertar cantidad en pies"));
        double resul = ft*cm;
        JOptionPane.showMessageDialog(null,df.format(resul)+" cm");
    }

    public void ydAm(){ // yardas a metros
        double yd = 0.9144,m;
        m = Float.parseFloat(JOptionPane.showInputDialog(null, "Insertar cantidad en yardas"));
        double result = yd*m;
        JOptionPane.showMessageDialog(null,df.format(result)+" m");
    }

    public void miAkm(){ // millas a kilometros
        double mi=1.60934,km;
        km = Float.parseFloat(JOptionPane.showInputDialog(null, "Insertar cantidad en millas"));
        double result = mi*km;
        JOptionPane.showMessageDialog(null,df.format(result)+" km");
    }

    public void lbAgr(){ //libras a gramos
        double lb=453.592,gr;
        gr = Float.parseFloat(JOptionPane.showInputDialog(null, "Insertar cantidad en libras"));
        double result = lb*gr;
        JOptionPane.showMessageDialog(null, df.format(result)+" g");
    }

    public void ozAgr(){ //onzas a gramos
        double oz=28.3495,gr;
        gr = Float.parseFloat(JOptionPane.showInputDialog(null, "Insertar cantidad en onzas"));
        double result=oz*gr;
        JOptionPane.showMessageDialog(null, df.format(result)+" g");
    }

    public void galAl(){ //Galones a litros
        double gal=3.78541,l;
        l = Float.parseFloat(JOptionPane.showInputDialog(null, "Insertar cantidad en galones"));
        double result=gal*l;
        JOptionPane.showMessageDialog(null,df.format(result)+" L");
    } 
    
    public void  qtAml(){ //cuartos a mililitros
        double qt=946.353,ml;
        ml = Float.parseFloat(JOptionPane.showInputDialog(null, "Insertar cantidad en cuartos"));
        double result = qt*ml;
        JOptionPane.showMessageDialog(null,df.format(result) +" ml");
    }

    public void ft3Al(){ //pies cubicos a litros
        double ft3=28.3168,l;
        l = Float.parseFloat(JOptionPane.showInputDialog(null, "Insertar cantidad en pies cúbicos"));
        double result = ft3*l;
        JOptionPane.showMessageDialog(null, df.format(result)+" L");
    }

    //------------------- Sistema métrico decimal a inglés --------------

    public void cmAin () { //Centimetros a pulgadas
        double cm = 0.393701,in;
        in =  Float.parseFloat(JOptionPane.showInputDialog(null, "Insertar cantidad en centímetros"));
        double resul=cm*in;
        JOptionPane.showMessageDialog(null,df.format(resul)+" in");
    }

    public void cmAft(){ // centimetros a pie
        double cm = 0.0328084, ft;
        ft = Float.parseFloat(JOptionPane.showInputDialog(null, "Insertar cantidad en centímetros"));
        double resul = cm*ft;
        JOptionPane.showMessageDialog(null,df.format(resul)+" ft");
    }

    public void mAyd(){ // metros a yarda
        double m = 1.09361,yd;
        yd = Float.parseFloat(JOptionPane.showInputDialog(null, "Insertar cantidad en metros"));
        double result = m*yd;
        JOptionPane.showMessageDialog(null,df.format(result)+" yd");
    }

    public void kmAmi(){ // kilometros a millas
        double km=0.621371,mi;
        mi = Float.parseFloat(JOptionPane.showInputDialog(null, "Insertar cantidad en kilómetros"));
        double result = km*mi;
        JOptionPane.showMessageDialog(null,df.format(result)+" millas");
    }

    public void grAlb(){ //gramos a libras
        double gr=0.00220462,lb;
        lb = Float.parseFloat(JOptionPane.showInputDialog(null, "Insertar cantidad en gramos"));
        double result = gr*lb;
        JOptionPane.showMessageDialog(null, df.format(result)+" lb");
    }

    public void grAoz(){ //gramos a onzas
        double gr=0.035274,oz;
        oz = Float.parseFloat(JOptionPane.showInputDialog(null, "Insertar cantidad en gramos"));
        double result=gr*oz;
        JOptionPane.showMessageDialog(null, df.format(result)+" oz");
    }

    public void lAgal(){ //litros a galones
        double l=0.264172,gal;
        gal = Float.parseFloat(JOptionPane.showInputDialog(null, "Insertar cantidad en litros"));
        double result=l*gal;
        JOptionPane.showMessageDialog(null,df.format(result)+" gl");
    } 
    
    public void  mlAqt(){ //mililitros a cuartos
        double ml=0.00105669,qt;
        qt = Float.parseFloat(JOptionPane.showInputDialog(null, "Insertar cantidad en mililitros"));
        double result = ml*qt;
        JOptionPane.showMessageDialog(null,df.format(result) +" qt");
    }

    public void lAft3(){ //litros a pies cubicos
        double l=0.0353147,ft3;
        ft3 = Float.parseFloat(JOptionPane.showInputDialog(null, "Insertar cantidad en litros"));
        double result = l*ft3;
        JOptionPane.showMessageDialog(null, df.format(result)+" ft³ ");
    }
    // kelvin, celsius, Farenheit
    public void kAc(){ //Kelvin a celsius
        double k;
        k = Float.parseFloat(JOptionPane.showInputDialog(null, "Insertar temperatura en kelvin"));
        double result = k-273.15;
        JOptionPane.showMessageDialog(null, df.format(result)+" °C");
    }
    public void kAf(){ //Kelvin a faherenheit
        double k;
        k = Float.parseFloat(JOptionPane.showInputDialog(null, "Insertar temperatura en kelvin"));
        double result = (k-273.15)*9/5+32;
        JOptionPane.showMessageDialog(null, df.format(result)+" °F");
    }
    public void cAk(){ //celsius a kelvin
        double c;
        c = Float.parseFloat(JOptionPane.showInputDialog(null, "Insertar temperatura celsius"));
        double result = (c+273.15);
        JOptionPane.showMessageDialog(null, df.format(result)+" K");
    }
    public void cAf(){ //celsius a fahrenheit 
        double c;
        c = Float.parseFloat(JOptionPane.showInputDialog(null, "Insertar temperatura en celsius"));
        double result = (c*9/5)+32;
        JOptionPane.showMessageDialog(null, df.format(result)+" °F");
    }
    public void fAk(){ //fahrenheit a kelvin 
        double f;
        f = Float.parseFloat(JOptionPane.showInputDialog(null, "Insertar temperatura en fahrenheit"));
        double result = (f-32)*5/9+273.15;
        JOptionPane.showMessageDialog(null, df.format(result)+" K");
    }
    public void fAc(){ //fahrenheit a celsius 
        double f;
        f = Float.parseFloat(JOptionPane.showInputDialog(null, "Insertar temperatura en fahrenheit"));
        double result = (f-32)*5/9;
        JOptionPane.showMessageDialog(null, df.format(result)+" °C");
    }
    
}
 