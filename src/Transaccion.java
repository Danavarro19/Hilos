public class Transaccion extends Thread {

    private String nombre;
    private long tiempoInicial;

    @Override
    public void run() {
        System.out.println("Transaccionando");
    }
}
