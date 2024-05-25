public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        // Crear instancias de cada tipo de vehículo
        Auto auto = new Auto("Toyota", "Corolla", 2020, 15000, 5, "Gasolina");

        Camion camion = new Camion("Volvo", "FH", 2019, 75000, 20000, 4);

        // Mostrar la informacion de cada vehiculo
        System.out.println("Informacion del Auto:");
        auto.mostrarInfo();
        auto.RealizarMantenimiento();

        System.out.println("\nInformacion del Camion:");
        camion.mostrarInfo();
        camion.RealizarMantenimiento();

        System.out.println("El costo total del mantenimiento es: ");
        auto.calcularCostoMantenimiento(50000, 0.80);

    }
}
