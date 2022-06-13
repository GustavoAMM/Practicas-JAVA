import java.util.*;
import javax.swing.JOptionPane;
import java.text.*;
public class calcu {
    public static void main(String[]args){
        
        Conversiones con = new Conversiones();
        con.inAcm(); //pulgadas a centímetros
        con.ftAcm(); //pies a centímetros
        con.ydAm(); //Yardas a metros
        con.miAkm(); //Millas a kilometros
        con.lbAgr(); //Libras a gramos
        con.ozAgr(); //onzas a gramos
        con.galAl(); //Galones a litros
        con.qtAml(); //cuartos a mililitros
        con.ft3Al(); //pies cubicos a litros
        //--------------------------
        con.cmAin(); //centímetros a pulgadas
        con.cmAft(); //centímetros a pies
        con.mAyd(); //metros a yardas
        con.kmAmi(); //kilometros a millas
        con.grAlb(); //gramos a libras
        con.grAoz(); //gramos a onzas
        con.lAgal(); //litros a galones
        con.mlAqt(); //mililitros a cuartos
        con.lAft3(); //litros a pies cubicos
        //----------- temperatura ----------
        con.kAc();   //kalvin a celsius
        con.kAf(); //Kalvin a fahrenheit
        con.cAk(); //celsius a kelvin
        con.cAf(); //Celsius a fahrenheit
        con.fAk(); //fahrenheit a kelvin
        con.fAc(); //fahrenheit a celsius

        
        }
                
    }
 