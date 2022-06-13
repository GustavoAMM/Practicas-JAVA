
package calq;

import javax.swing.JOptionPane;

public class Estadistica_Probabilidad {
    public static void varianza(){
    double[] guardar_datos = new double[15];
    int contador_suma,n1,cont=0;
    double x=0,x1=0,s=0,s1=0,r,dato;
    String[] Opciones_pobla_muestra={"De poblacion","De muestra"};
    int eleccion=JOptionPane.showOptionDialog(null,"¿De qué tipo es la varianza? (Máximo 15 datos)","Bienvenido",JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE,null,Opciones_pobla_muestra,Opciones_pobla_muestra[0]);
    switch(eleccion){
        case 0:
            contador_suma=Integer.valueOf(JOptionPane.showInputDialog("Introduce la cantidad de datos"));
            n1=contador_suma;
            for (int i = 0; i < contador_suma; i++) {
                dato=Double.parseDouble(JOptionPane.showInputDialog("Introduce tu dato"));
                x1=x1+dato;
                guardar_datos[i]=dato;
                JOptionPane.showMessageDialog(null, guardar_datos[i]);
            }
            x1=x1/contador_suma;;
            while (n1!=0){
                x=guardar_datos[cont];
                s=(x-x1)*(x-x1);
                s1=s1+s;
                n1--;
                cont++;
            }
            r=s1/contador_suma;
            JOptionPane.showMessageDialog(null,"La varianza de población es de "+r);
            break;
        case 1: 
            contador_suma=Integer.valueOf(JOptionPane.showInputDialog("Introduce la cantidad de datos"));
            n1=contador_suma;
            for (int i = 0; i < contador_suma; i++) {
                dato=Double.parseDouble(JOptionPane.showInputDialog("Introduce tu dato"));
                x1=x1+dato;
                guardar_datos[i]=dato;
                JOptionPane.showMessageDialog(null, guardar_datos[i]);
            }
            x1=x1/contador_suma;;
            while (n1!=0){
                x=guardar_datos[cont];
                s=(x-x1)*(x-x1);
                s1=s1+s;
                n1--;
                cont++;
            }
            r=s1/(contador_suma-1);
            JOptionPane.showMessageDialog(null,"La varianza de muestra es de "+r);
            break;
    }
}
    public static void main(String[] args){
       permutacion();
    }
    public static void permutacion(){
        double dato_n,dato_k,x_permutacion,n,n1=1,k,k1=1,x;
        String[] Opciones_permutacion={"Con repeticiones","Sin repeticiones"};
        int eleccion=JOptionPane.showOptionDialog(null,"¿De qué tipo es la varianza? (Máximo 15 datos)","Bienvenido",JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE,null,Opciones_permutacion,Opciones_permutacion[0]);
        switch(eleccion){
            case 0:
                dato_n=Double.parseDouble(JOptionPane.showInputDialog("Introduce la cantidad de elementos (n)"));
                dato_k=Double.parseDouble(JOptionPane.showInputDialog("Introduce los grupos deseados (k)"));
                x_permutacion=Math.pow(dato_n,dato_k);
                JOptionPane.showMessageDialog(null, x_permutacion);
                break;
            case 1:
                dato_n=Double.parseDouble(JOptionPane.showInputDialog("Introduce la cantidad de elementos (n)"));
                dato_k=Double.parseDouble(JOptionPane.showInputDialog("Introduce los grupos deseados (k)"));
                x=(dato_n-dato_k);
                if (dato_n==1) {
                    n1=1;
                    }
                
                if (x<0) {
                    while(dato_n!=0){
                    n1=n1*dato_n;dato_n--;
                }
                    x_permutacion=n1;
                }else{
                while(dato_n!=0){
                    n1=n1*dato_n;dato_n--;
                }
                while(x!=0){
                    k1=x*k1;x--;
                }
                x_permutacion=n1/k1; 
                }                
                JOptionPane.showMessageDialog(null,"El resultado es "+ x_permutacion);
                break;
        }
        
        
        //para el factorial de un numero seria x*x, x--; dentro de un while, donde el tope seria que x sea 1
    }
}
