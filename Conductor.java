class Conductor {
    private String nombre;
    private String documento;
    private String vehiculo;

    public Conductor(String nombre, String documento, String vehiculo) {
        this.nombre = nombre;
        this.documento = documento;
        this.vehiculo = vehiculo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDocumento() {
        return documento;
    }

    public String getVehiculo() {
        return vehiculo;
    }

    public void mostrarInformacion() {
        System.out.println("Conductor: " + nombre + " | Documento: " + documento);
    }
}