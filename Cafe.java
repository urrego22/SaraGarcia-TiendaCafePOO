public class Cafe {

    // Atributos
    private String nombre;
    private String region;
    private double precioPorKilo;
    private float cantidadEnKilos;

    // Constructor
    public Cafe(String nombre, String region, double precioPorKilo, float cantidadEnKilos) {
        this.nombre = nombre;
        this.region = region;
        this.precioPorKilo = precioPorKilo;
        this.cantidadEnKilos = cantidadEnKilos;
    }

    // Método para mostrar información
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Región: " + region);
        System.out.println("Precio por kilo: $" + precioPorKilo);
        System.out.println("Cantidad disponible: " + cantidadEnKilos + " kg");
        System.out.println("-----------------------------------");
    }

    // Método para calcular el precio total
    public double calcularPrecioTotal() {
        return precioPorKilo * cantidadEnKilos;
    }

    // Método para actualizar la cantidad
    public void actualizarCantidad(float nuevaCantidad) {
        this.cantidadEnKilos = nuevaCantidad;
    }

    public void aplicarDescuento(double porcentaje) {
    precioPorKilo = precioPorKilo - (precioPorKilo * porcentaje / 100);
}

}
