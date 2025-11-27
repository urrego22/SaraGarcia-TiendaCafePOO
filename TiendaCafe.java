public class TiendaCafe {
    public static void main(String[] args) {

        // Crear objetos de tipo Cafe
        Cafe cafe1 = new Cafe("Café de Nariño", "Nariño", 35000, 10);
        Cafe cafe2 = new Cafe("Café del Huila", "Huila", 30000, 8);
        Cafe cafe3 = new Cafe("Café de Antioquia", "Antioquia", 28000, 12);

        // Mostrar información
        cafe1.mostrarInformacion();
        cafe2.mostrarInformacion();
        cafe3.mostrarInformacion();

        // Calcular precios totales
        System.out.println("Precio total Café de Nariño: $" + cafe1.calcularPrecioTotal());
        System.out.println("Precio total Café del Huila: $" + cafe2.calcularPrecioTotal());
        System.out.println("Precio total Café de Antioquia: $" + cafe3.calcularPrecioTotal());

        // Actualizar cantidad de café 1
        cafe1.actualizarCantidad(15);
        System.out.println("\n--- Información actualizada del Café de Nariño ---");
        cafe1.mostrarInformacion();
    }
}
