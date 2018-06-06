public class Transaccion extends Thread {

    private String nombre;
    private int tiempo;

    public String getNombre() {
        return nombre;
    }

    public int getTiempo() {
        return tiempo;
    }

    @Override
    public void run() {
        System.out.println("Transaccionando");
    }
}
