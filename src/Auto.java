public class Auto extends VehiculoPasajeros {
    private String tipoCombustible;

    // Constructor
    public Auto(String marca, String modelo, int año, int kilometraje, int numPasajeros, String tipoCombustible) {
        super(marca, modelo, año, kilometraje, numPasajeros);
        this.tipoCombustible = tipoCombustible;
    }

    // Getter y Setter para tipoCombustible
    public String getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    // Sobrescribir el metodo mostrarInfo()
    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Tipo de Combustible: " + tipoCombustible);
    }

    @Override
    public void RealizarMantenimiento() {
        super.RealizarMantenimiento();
        System.out.println("Para el mantenimiento de este auto se necesita: ");
        System.out.println("1. revisión de neumáticos");
        System.out.println("2. engrase de ejes. ");
        System.out.println("3. cambio de llanta. ");
    }

    public void calcularCostoMantenimiento(double kmRecorridoss, double costoKMrecorrido) {
        double costoTotal = costoKMrecorrido * kmRecorridoss;
        System.out.println(costoTotal + " $ ");

    }

}
