package claseabstracta;

/**
 *
 * @author epastorizalorenzo
 */
public class Coche extends Vehiculo {
    int numPuertas;
 public Coche(int cilindrada,int potencia, int numPuertas){
     super(cilindrada,potencia);
     this.numPuertas=numPuertas;
 }   
 
 public double calcularImpuesto(){
     return getCilindrada()/20+getPotencia()*20;
 }
 @Override
    public String toString() {
        return "Coche{" + "numPuertas=" + numPuertas + "potencia "+getPotencia()+"cilindrada "+getCilindrada()+'}';
    }
}

