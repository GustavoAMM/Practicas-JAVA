package segundoParcial;
import javax.swing.JOptionPane;

public class Cajero {
    double saldo = 3500;
    private String movimiento[];
    private String cantidad[];
    private String lugar[];
    private int contm;
    private int contc;
    private int contl;
    
     public Cajero(){
        movimiento = new String[100];
        cantidad = new String[100];
        lugar = new String[100];
        contm=0;
        contc=0;
        contl=0;
    }
     
    public void retirar(){
        int op;
        op = Integer.parseInt(JOptionPane.showInputDialog(null, "\n      ===RETIRAR==="
        +"\n\nSaldo actual: " + saldo
        +"\n\nElegir opción: " 
        +"\n\n1.- $100"
        +"\n2.- $200"
        +"\n3.- $300"
        +"\n4.- $400"
        +"\n5.- $500"
        +"\n6.- $1000"
        +"\n7.- $2000"
        +"\n8.- $5000"
        +"\n9.-  Otra cantidad (menor a $5000)"
        +"\n ")); 
        
        switch(op){
            case 1:
                if(saldo<100){
                JOptionPane.showMessageDialog(null, "Saldo insuficiente");
                }else{
                    saldo=saldo-100;
                    JOptionPane.showMessageDialog(null,"Retiro: 100 "+"\nSaldo actual : "+saldo);
                }
                movimiento[contm++]="Retiro";
                cantidad[contc++]="$100";
                lugar[contl++]="Cajero";
                
                break;
            case 2:
                if(saldo<200){
                JOptionPane.showMessageDialog(null, "Saldo insuficiente");
                }else{
                    saldo=saldo-200;
                    JOptionPane.showMessageDialog(null,"Retiro: 200 "+ "\nSaldo actual : "+saldo);
                }
                movimiento[contm++]="Retiro";
                cantidad[contc++]="$200";
                lugar[contl++]="Cajero";
                break;
            case 3:
                if(saldo<300){
                JOptionPane.showMessageDialog(null,"Retiro: 300 "+ "\nSaldo insuficiente");
                }else{
                }
                movimiento[contm++]="Retiro";
                cantidad[contc++]="$300";
                lugar[contl++]="Cajero";
                break;
            case 4:
                if(saldo<400){
                JOptionPane.showMessageDialog(null, "Saldo insuficiente");
                }else{
                    saldo=saldo-400;
                    JOptionPane.showMessageDialog(null,"Retiro: 400 "+ "\nSaldo actual : "+saldo);
                }
                movimiento[contm++]="Retiro";
                cantidad[contc++]="$400";
                lugar[contl++]="Cajero";
                break;
            case 5: 
                if(saldo<500){
                JOptionPane.showMessageDialog(null, "Saldo insuficiente");
                }else{
                    saldo=saldo-500;
                    JOptionPane.showMessageDialog(null,"Retiro: 500 "+ "\nSaldo actual : "+saldo);
                }
                movimiento[contm++]="Retiro";
                cantidad[contc++]="$500";
                lugar[contl++]="Cajero";
                break;
            case 6:
                if(saldo<1000){
                JOptionPane.showMessageDialog(null, "Saldo insuficiente");
                }else{
                    saldo=saldo-1000;
                    JOptionPane.showMessageDialog(null,"Retiro: 1000 "+ "\nSaldo actual : "+saldo);
                }
                movimiento[contm++]="Retiro";
                cantidad[contc++]="$1000";
                lugar[contl++]="Cajero";
                break;
            case 7:
                if(saldo<2000){
                JOptionPane.showMessageDialog(null, "Saldo insuficiente");
                }else{
                    saldo=saldo-2000;
                    JOptionPane.showMessageDialog(null,"Retiro: 2000 "+ "\nSaldo actual : "+saldo);
                }
                movimiento[contm++]="Retiro";
                cantidad[contc++]="$2000";
                lugar[contl++]="Cajero";
                break;
            case 8:
                if(saldo<5000){
                JOptionPane.showMessageDialog(null, "Saldo insuficiente");
                }else{
                    saldo=saldo-5000;
                    JOptionPane.showMessageDialog(null,"Retiro: 5000 "+ "\nSaldo actual : "+saldo);
                }
                movimiento[contm++]="Retiro";
                cantidad[contc++]="$5000";
                lugar[contl++]="Cajero";
                break;
            case 9:
                int cant;
                cant = Integer.parseInt(JOptionPane.showInputDialog("Ingresar cantidad: "));
                
                if(saldo<cant){
                JOptionPane.showMessageDialog(null, "Saldo insuficiente");
                }else{
                if(cant>5000){
                JOptionPane.showMessageDialog(null, "Únicamente se pueden hacer retiros máximos de $5000");
                }else{
                    saldo=saldo-cant;
                    JOptionPane.showMessageDialog(null, "Retiro: "+cant+"\nSaldo actual : "+saldo);
                }   
                String cantCadena=String.valueOf(cant);//pasar el valor entero a String
                movimiento[contm++]="Retiro";
                cantidad[contc++]=cantCadena;
                lugar[contl++]="Cajero";
                }
                break;
            default:
                JOptionPane.showMessageDialog(null, "Elegir una opción valida del menú");
                break;
        }
}
    public void depositar(){
        int cant;
        cant = Integer.parseInt(JOptionPane.showInputDialog(null, "\n      ===DEPOSITAR==="
            +"\n\nSaldo actual: " + saldo
            +"\nIngresar deposito(Máximo $3000): "));
        if (cant>3000){
            JOptionPane.showMessageDialog(null, "No depositos máximos de $3000.00");
        }else{
            saldo=saldo+cant;
            JOptionPane.showMessageDialog(null, "Deposito exitoso por: "+cant+"\nSaldo actual: "+saldo);
        }
        String cantCadena=String.valueOf(cant);
            movimiento[contm++]="Deposito";
            cantidad[contc++]=cantCadena;
            lugar[contl++]="Cajero";
    }
    
    public void pagar(){
        String tienda;
        int cant;
        
        tienda = JOptionPane.showInputDialog(null, "\n      ===PAGAR==="
            +"\nIngresar tienda: ");
        cant = Integer.parseInt(JOptionPane.showInputDialog(null, "\n      ===PAGAR==="
            +"\nIngresar cantidad a pagar: "));
        double interes=cant*.10;
        if(saldo<cant){
            JOptionPane.showMessageDialog(null, "Saldo insuficiente");
        }else{
            saldo=saldo-cant;
            saldo=saldo-interes;
            JOptionPane.showMessageDialog(null, "\nPago exitoso"+"\nSe aplicó un interés de 10%");
            JOptionPane.showMessageDialog(null, "Saldo actual: "+saldo);
            String cantCadena=String.valueOf(cant);
            movimiento[contm++]="Pago";
            cantidad[contc++]=cantCadena;
            lugar[contl++]=tienda;
        }
    }
    public void consultar(){
        JOptionPane.showMessageDialog(null, "\n      ===CAJERO ATM==="
            +"\n\n Saldo actual: "+saldo);
    }
    public void movimientos(){
        for(int i=0;i<contm;i++)
        
        JOptionPane.showMessageDialog(null, "\n                                            ===CAJERO ATM==="
        +"\nMovimiento: "+(i+1)       
        +"\n\nMovimiento realizado   "+"Cantidad del movimiento   "+"Lugar del movimiento   "
        +"\n"+movimiento[i]+"                                         "+cantidad[i]+"                                         "+lugar[i]);
    }
}
