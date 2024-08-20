
package CarreraCiclística;


public class Contrarrelojista extends Ciclista {
    private double velocidadMáxima;
    public Contrarrelojista(int identificador, String nombre, double
    velocidadMáxima) {
    super(identificador, nombre);
    this.velocidadMáxima = velocidadMáxima;
    }
    /**
    * Método que devuelve la velocidad máxima de un contrarrelojista
    * @return La velocidad máxima de un contrarrelojista
    */
    protected double getVelocidadMáxima() {
    return velocidadMáxima;
    }
    /**
    * Método que establece la velocidad máxima de un contrarrelojista
    * @param Parámetro que especifica la velocidad máxima de un
    * contrarrelojista
    */
    protected void setVelocidadMáxima(double velocidadMáxima) {
    this.velocidadMáxima = velocidadMáxima;
    }
    /**
    * Método que muestra en pantalla los datos de un contrarrelojista
    */
    @Override
    protected void imprimir() {
    super.imprimir(); // Invoca el método imprimir de la clase padre
    System.out.println("Aceleración promedio = " +
    velocidadMáxima);
    }
    /**
    * Método que devuelve el tipo de ciclista
    * @return Un valor String con el texto “Es un constrarrelojista”
    */
    @Override
    protected String imprimirTipo() {
    return "Es un constrarrelojista";
    }
}
