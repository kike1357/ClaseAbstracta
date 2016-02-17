package claseabstracta;

/**
 *
 * @author epastorizalorenzo
 */
public abstract class Vehiculo {
    
    private int cilindrada;
    private int potencia;

    public Vehiculo(int cilindrada, int potencia) {
        this.cilindrada = cilindrada;
        this.potencia = potencia;
    }
    
    
    public int getCilindrada(){
        return cilindrada;
        }
    public int getPotencia(){
        return potencia;
    }
    
    public String arrancar(){
        return "Arrancar el vehículo";
    }
    public abstract double calcularImpuesto();
        
    }

