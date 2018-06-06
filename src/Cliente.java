public class Cliente{

    private String nombre;
    private Transaccion[] transacciones;
    private long tiempoInicial;


    public Cliente(String nombre,Transaccion[] transacciones){
        this.nombre=nombre;
        this.transacciones=transacciones;
    }


    public String getNombre() {
        return nombre;
    }


    public Transaccion[] getTransacciones() {
        return transacciones;
    }
}
