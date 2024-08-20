
package CarreraCiclística;

/**
 *
 * @author Juan
 */
public class Velocista extends Ciclista {
    private double potenciaPromedio; /* Atributo que define la potencia
    promedio de un velocista */
    private double velocidadPromedio;
    public Velocista(int identificador, String nombre, double
        potenciaPromedio, double velocidadPromedio) {
        super(identificador, nombre);
        potenciaPromedio = potenciaPromedio;
        this.velocidadPromedio = velocidadPromedio;
    }
    /**
    * Método que devuelve la potencia promedio de un velocista
    * @return La potencia promedio de un velocista
    */
    protected double getPotenciaPromedio() {
    return potenciaPromedio;
    }
    /**
    * Método que establece la potencia promedio de un velocista
    * @param Parámetro que especifica la potencia promedio de un
    * velocista
    */
    protected void setPotenciaPromedio(double potenciaPromedio) {
    this.potenciaPromedio = potenciaPromedio;
    }
    /**
    * Método que devuelve la velocidad promedio de un velocista
    * @return La velocidad promedio de un velocista
    */
    protected double getvelocidadPromedio() {
    return velocidadPromedio;
    }
    /**
    * Método que establece la velocidad promedio de un velocista
    * @param Parámetro que especifica la velocidad promedio de un
    * velocista
    */
    protected void setVelocidadPromedio(double velocidadPromedio) {
    this.velocidadPromedio = velocidadPromedio;
    }
    @Override
    protected void imprimir() {
    super.imprimir(); // Invoca al método imprimir de la clase padre
    System.out.println("Potencia promedio = " + potenciaPromedio);
    System.out.println("Velocidad promedio = " +
    velocidadPromedio);
    }
    /**
    * Método que devuelve el tipo de ciclista
    * @return Un valor String con el texto “Es un velocista”
    */
    @Override
    protected String imprimirTipo() {
    return "Es un velocista";
    }
}
