

public class Cajero extends Thread {

    private String nombre;
    private Cliente cliente;
    private long tiempoInicial;

    public Cajero(String nombre, Cliente cliente, long tiempoInicial){
        this.nombre=nombre;
        this.cliente=cliente;
        this.tiempoInicial=tiempoInicial;
    }

    @Override
    public void run(){

        System.out.println("La cajera " + this.nombre + " COMIENZA A PROCESAR LA COMPRA DEL CLIENTE "
                + this.cliente.getNombre() + " EN EL TIEMPO: "
                + (System.currentTimeMillis() - this.tiempoInicial) / 1000
                + "seg");

        for (int i = 0; i < this.cliente.getTransacciones().length; i++) {
            this.esperarXsegundos(cliente.getTransacciones()[i].getTiempo());
            System.out.println("Procesado el producto " + (i + 1)
                    + " del cliente " + this.cliente.getNombre() + "->Tiempo: "
                    + (System.currentTimeMillis() - this.tiempoInicial) / 1000
                    + "seg");
        }
    }


    private void esperarXsegundos(int segundos) {
        try {
            Thread.sleep(segundos * 1000);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }
}
