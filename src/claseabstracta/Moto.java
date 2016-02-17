package claseabstracta;

/**
 *
 * @author epastorizalorenzo
 */
public class Moto extends Vehiculo {
    
public Moto(int cilindrada,int potencia){
        super(cilindrada,potencia);
    }

public double calcularImpuesto(){
        return getCilindrada()/30+getPotencia()*10;
    
    }
}
