import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Parqueadero {
    private String nombre;
    private List<Vehiculo> vehiculos;
    private List<Espacio> espacios;
    private List<Ticket> tickets;
    private List<Conductor> conductores;

    public Parqueadero(String nombre) {
        this.nombre = nombre;
        this.vehiculos = new ArrayList<>();
        this.espacios = new ArrayList<>();
        this.tickets = new ArrayList<>();
        this.conductores = new ArrayList<>();
    }

    public void agregarVehiculo(Vehiculo vehiculo) {
        vehiculos.add(vehiculo);
    }

    public void agregarEspacio(Espacio espacio) {
        espacios.add(espacio);
    }

    public void agregarTicket(Ticket ticket) {
        tickets.add(ticket);
    }

    public void agregarConductor(Conductor conductor) {
        conductores.add(conductor);
    }

    public String getNombre() {
        return nombre;
    }

    public List<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public List<Espacio> getEspacios() {
        return espacios;
    }

    public List<Ticket> getTickets() {
        return tickets;
    }

    public List<Conductor> getConductores() {
        return conductores;
    }

    public static void main(String[] args) {
        Parqueadero parqueadero = new Parqueadero("Parqueadero Central");

        Conductor conductor = new Conductor("Juan Perez", "12345678", "Toyota");
        Vehiculo vehiculo = new Vehiculo("ABC-123", "Toyota", "Sedan", "Rojo", conductor);
        Espacio espacio = new Espacio(1);

        parqueadero.agregarConductor(conductor);
        parqueadero.agregarVehiculo(vehiculo);
        parqueadero.agregarEspacio(espacio);

        espacio.ocupar(vehiculo);

        Ticket ticket = new Ticket(1001, conductor, espacio, LocalDateTime.now(), null);
        parqueadero.agregarTicket(ticket);

        Pago pago = new Pago(2500.0, "Efectivo");
        ticket.setPago(pago);

        System.out.println("Parqueadero: " + parqueadero.getNombre());
        System.out.println(ticket);
        System.out.println("Espacio ocupado: " + espacio.isOcupado());
    }
}
