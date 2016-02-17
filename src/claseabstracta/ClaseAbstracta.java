package claseabstracta;

import javax.swing.JOptionPane;

/**
 *
 * @author epastorizalorenzo
 */
public class ClaseAbstracta {

    
    public static void main(String[] args) {
       Moto vespa= new Moto(125,50);
       JOptionPane.showMessageDialog(null,"Impuesto moto "+vespa.calcularImpuesto());
       JOptionPane.showMessageDialog(null,vespa.arrancar());
       Coche c3 = new Coche(100,80,5);
       JOptionPane.showMessageDialog(null,"Impuesto coche "+c3.calcularImpuesto());
       JOptionPane.showMessageDialog(null,c3.arrancar());
       JOptionPane.showMessageDialog(null,c3.toString());
       Camion barreiro = new Camion(8,3000,300);
       JOptionPane.showMessageDialog(null,"Impuesto camion "+barreiro.calcularImpuesto());
       JOptionPane.showMessageDialog(null,barreiro.arrancar());
    }
    
}
