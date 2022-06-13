import java.util.*;

import javax.swing.JOptionPane;
public class pitagoras {
public Scanner lea = new Scanner (System.in);
public double a, b, c, x;

public static void main (String[]args) {
Scanner capture = new Scanner (System.in);
pitagoras objeto = new pitagoras();
int opc = 0;
opc = JOptionPane.showInputDialog(null, "== Teorma de Pitagoras ==" 
+ "¿Qué desea hallar? "
+ "\n 1.- Hipotenusa "
+ "\n 2.- Cateto A"
+ "\n 3.- Cateto B");




switch (opc) {
case 1:
objeto.hipotenusa();
break;
case 2:
objeto.catetoA();
break;
case 3:
objeto.catetoB();
break;

}

} /* fin void main */


public void hipotenusa() {
System.out.println ("Ingrese el cateto A");
a = lea.nextDouble();
System.out.println ("Ingrese el cateto B");
b = lea.nextDouble();
x = ((a*a)+(b*b));
c = Math.sqrt(x);
System.out.println ("La Hipotenusa del triangulo es: " +c);
}

public void catetoA() {
System.out.println ("Ingrese el cateto B");
b = lea.nextDouble();
System.out.println ("Ingrese La Hipotenusa");
c = lea.nextDouble();
x = ((c*c)-(b*b));
a = Math.sqrt(x);
System.out.println ("El Cateto A del triangulo es: " +a);
}
public void catetoB() {
System.out.println ("Ingrese el cateto A");
a = lea.nextDouble();
System.out.println ("Ingrese La Hipotenusa");
c = lea.nextDouble();
x = ((c*c)-(a*a));
b = Math.sqrt(x);
System.out.println ("El Cateto B del triangulo es: " +b);
}

} /* fin class */