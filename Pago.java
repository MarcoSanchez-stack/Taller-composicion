class Pago {
    private double valor;
    private String metodo;

    public Pago(double valor, String metodo) {
        this.valor = valor;
        this.metodo = metodo;
    }

    public double getValor() {
        return valor;
    }

    public String getMetodo() {
        return metodo;
    }

    public void realizarPago() {
        System.out.println("Pago realizado por " + metodo + " por valor de " + valor);
    }
}