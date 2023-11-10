public class Simulador {

    ColaProcesos cola;
    private int quantum;
    private int tiempoTotal;
    private int conmutaciones;

    public Simulador() {
        cola = new ColaProcesos();
        quantum = 0;
        tiempoTotal = 0;
        conmutaciones = 0;
    }

    public void establecerQuantum(int q) {
        quantum = q;
    }

    public void agregarProceso(Proceso p) {
        cola.insertarEnCola(p);
    }

    public void ejecutarRoundRobin() {

        while(!cola.esVacia()) {

            Proceso actual = cola.desencolar();

            if(actual.getTiempoCPURestante() > 0) {

                System.out.println("Proceso actual: " + actual);

                if(actual.getTiempoCPURestante() <= quantum) {
                    tiempoTotal += actual.getTiempoCPURestante();
                    System.out.println("Tiempo: " + actual.getTiempoCPURestante());
                    actual.setTiempoCPURestante(0);
                }
                else {
                    tiempoTotal += quantum;
                    conmutaciones++;
                    System.out.println("Tiempo: " + quantum);
                    actual.setTiempoCPURestante(actual.getTiempoCPURestante() - quantum);
                }

                if(actual.getTiempoCPURestante() > 0) {
                    cola.insertarEnCola(actual);
                }

            }

        }

    }
    public void imprimirEstadisticas() {

        System.out.println("Tiempo total de ejecución: " + getTiempoTotal() + " ms");
        System.out.println("Total conmutaciones: " + getConmutaciones());

    }

    public int getTiempoTotal() {
        return tiempoTotal;
    }

    public int getConmutaciones() {
        return conmutaciones;
    }

}