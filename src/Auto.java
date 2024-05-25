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

}
