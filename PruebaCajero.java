package segundoParcial;
import javax.swing.JOptionPane;

public class PruebaCajero {
  public static void main(String[]args){
    Cajero c=new Cajero();
   int op=0;
        do {
           op = Integer.parseInt(JOptionPane.showInputDialog("========CAJERO ATM========"
                    +"\n\n1.  Retiro"
                    +"\n2.  Depósito"
                    +"\n3.  Pago"
                    +"\n4.  Consultar saldo"
                    +"\n5.  Consulta de movimientos"
                    +"\n6.  Salir"));
           
           switch(op){
               case 1: 
                   c.retirar();
                   break;
               case 2:
                   c.depositar();
                   break;
               case 3: 
                   c.pagar();
                   break;
               case 4:
                   c.consultar();
                   break;
               case 5:
                   c.movimientos();
                   break;
               case 6:
                   JOptionPane.showMessageDialog(null, "C e r r a n d o     s i s t e m a. . .");
                   break;
               default:
                   JOptionPane.showMessageDialog(null,"Elige una opción del menú");
                   
           }
        }while(op != 6);

  }  
}
