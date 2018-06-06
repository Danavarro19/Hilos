public class Banco {

    public static void main(String args[]){

       Cliente cliente1=new Cliente("Rafael",
               new Transaccion[] {new Transaccion("Transaccion1",1),
                       new Transaccion("Transaccion2",4),
                       new Transaccion("Transaccion3", 7)});

       Cliente cliente2=new Cliente("Raul",
               new Transaccion[] {new Transaccion("Transaccion1",6),
                       new Transaccion("Transaccion2",4),
                       new Transaccion("Transaccion3", 8)});

       long tiempoInicial = System.currentTimeMillis();

       Cajero cajero1 = new Cajero("Alejo",cliente1,tiempoInicial);
       Cajero cajero2 = new Cajero("Fernando",cliente2,tiempoInicial);

       cajero1.start();
       cajero2.start();
    }
}
