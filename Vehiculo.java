class Vehiculo {
    private String placa;
    private String marca;
    private String tipo;
    private String color;
    private Conductor conductor;

    public Vehiculo(String placa, String marca, String tipo, String color, Conductor conductor) {
        this.placa = placa;
        this.marca = marca;
        this.tipo = tipo;
        this.color = color;
        this.conductor = conductor;
    }

    public String getPlaca() {
        return placa;
    }

    public String getMarca() {
        return marca;
    }

    public String getTipo() {
        return tipo;
    }

    public String getColor() {
        return color;
    }

    public Conductor getConductor() {
        return conductor;
    }

    public void mostrarInformacion() {
        System.out.println("Vehiculo: " + marca + " " + tipo + " - Placa: " + placa);
    }
}