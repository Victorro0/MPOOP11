import hilos.HiloT;
import hilos.HiloR;
public class Main {
  public static void main(String[] args) {
    HiloT miHiloT = new HiloT("Primer Hilo");   
    miHiloT.start();
    new HiloT("Segundo Hilo").start();

    new Thread(new HiloR(),"Tercer Hilo").start();
    new Thread(new HiloR(),"Cuarto Hilo").start();

    for(int i=0; i<10; i++){
      System.out.println("Iteracion "+ i +" del Hilo Main");
    }

    System.out.println("Termina el Hilo Main");
  }
}