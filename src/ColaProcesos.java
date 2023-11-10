import java.util.Queue;
import java.util.LinkedList;

public class ColaProcesos {

    private Queue<Proceso> cola;

    public ColaProcesos() {
        cola = new LinkedList<>();
    }

    public void encolar(Proceso p) {
        cola.add(p);
    }

    public Proceso desencolar() {
        return cola.poll();
    }

    public Proceso getFrente() {
        return cola.peek();
    }

    public int getTamanio() {
        return cola.size();
    }

    public boolean esVacia() {
        return cola.isEmpty();
    }

    public void insertarEnCola(Proceso p) {
        cola.add(p);
    }

    public void imprimirCola() {
        if(cola.isEmpty()) {
            System.out.println("La cola está vacía");
            return;
        }

        System.out.println("Procesos en la cola:");

        for(Proceso p : cola) {
            System.out.println(p);
        }
    }

}