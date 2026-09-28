class Espacio {
    private int numero;
    private boolean ocupado;
    private Vehiculo vehiculo;

    public Espacio(int numero) {
        this.numero = numero;
        this.ocupado = false;
    }

    public int getNumero() {
        return numero;
    }

    public boolean isOcupado() {
        return ocupado;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void ocupar(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
        this.ocupado = true;
    }

    public void liberar() {
        this.vehiculo = null;
        this.ocupado = false;
    }

    public void mostrarEstado() {
        System.out.println("Espacio " + numero + " - Ocupado: " + ocupado);
    }
}