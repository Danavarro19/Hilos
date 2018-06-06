public class Cliente{

    private String nombre;
    private Transaccion[] transacciones;
    private long tiempoInicial;

    public String getNombre() {
        return nombre;
    }

    public Transaccion[] getTransacciones() {
        return transacciones;
    }
}
