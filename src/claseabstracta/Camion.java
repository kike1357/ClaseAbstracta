package claseabstracta;

/**
 *
 * @author epastorizalorenzo
 */
public class Camion extends Vehiculo {
    int numRuedas;
    public Camion(int cilindrada,int potencia,int numRuedas){
        super(cilindrada,potencia);
        this.numRuedas=numRuedas;
    }
    
public double calcularImpuesto(){
    return getCilindrada()/30+getPotencia()*20+numRuedas*20;
  }
}

