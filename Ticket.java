import java.time.LocalDateTime;

class Ticket {
    private int numero;
    private Conductor conductor;
    private Espacio espacio;
    private LocalDateTime horaEntrada;
    private LocalDateTime horaSalida;
    private Pago pago;

    public Ticket(int numero, Conductor conductor, Espacio espacio, LocalDateTime horaEntrada, LocalDateTime horaSalida) {
        this.numero = numero;
        this.conductor = conductor;
        this.espacio = espacio;
        this.horaEntrada = horaEntrada;
        this.horaSalida = horaSalida;
    }

    public int getNumero() {
        return numero;
    }

    public Conductor getConductor() {
        return conductor;
    }

    public Espacio getEspacio() {
        return espacio;
    }

    public LocalDateTime getHoraEntrada() {
        return horaEntrada;
    }

    public LocalDateTime getHoraSalida() {
        return horaSalida;
    }

    public Pago getPago() {
        return pago;
    }

    public void setPago(Pago pago) {
        this.pago = pago;
    }

    public void registrarSalida() {
        this.horaSalida = LocalDateTime.now();
    }

    public double calcularValor() {
        if (pago == null) {
            return 0;
        }
        return pago.getValor();
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "numero=" + numero +
                ", conductor=" + conductor.getNombre() +
                ", espacio=" + espacio.getNumero() +
                ", horaEntrada=" + horaEntrada +
                ", horaSalida=" + horaSalida +
                ", pago=" + (pago != null ? pago.getValor() : 0) +
                '}';
    }
}