
package CarreraCiclística;


public class Escalador extends Ciclista {
    private double aceleraciónPromedio;
    // Atributo que define el grado de rampa soportado por un escalador
    private double gradoRampa;
    public Escalador(int identificador, String nombre, double
    aceleraciónPromedio, double gradoRampa) {
    super(identificador, nombre);
    this.aceleraciónPromedio = aceleraciónPromedio;
    this.gradoRampa = gradoRampa;
    }
    /**
    * Método que devuelve la aceleración promedio de un escalador
    * @return La aceleración promedio de un escalador
    */
    protected double getAceleraciónPromedio() {
    return aceleraciónPromedio;
    }
    /**
    * Método que establece la aceleración promedio de un escalador
    * @param Parámetro que especifica la aceleración promedio de un
    * escalador
    */
    protected void setAceleraciónPromedio(double
    aceleraciónPromedio) {
    this.aceleraciónPromedio = aceleraciónPromedio;
    }
    /**
    * Método que devuelve el grado de rampa soportado de un escalador
    * @return El grado de rampa soportado de un escalador
    */
    protected double getGradoRampa() {
    return gradoRampa;
    }
    protected void setGradoRampa(double gradoRampa) {
    this.gradoRampa = gradoRampa;
    }
    /**
    * Método que muestra en pantalla los datos de un escalador
    */
    @Override
    protected void imprimir() {
    super.imprimir(); // Invoca el método imprimir de la clase padre
    System.out.println("Aceleración promedio = " +
    aceleraciónPromedio);
    System.out.println("Grado de rampa = " + gradoRampa);
    }
    /**
    * Método que devuelve el tipo de ciclista
    * @return Un valor String con el texto “Es un escalador”
    */
    @Override
    protected String imprimirTipo() {
    return "Es un escalador";
    }
}
