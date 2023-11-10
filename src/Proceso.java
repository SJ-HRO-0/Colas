public class Proceso {

    private int idProceso;
    private int cedula;
    private int tiempoCPU;
    private int tiempoCPURestante;

    public Proceso(int idProceso, int cedula, int tiempoCPU) {
        this.idProceso = idProceso;
        this.cedula = cedula;
        this.tiempoCPU = tiempoCPU;
        this.tiempoCPURestante = tiempoCPU;
    }

    public int getIdProceso() {
        return idProceso;
    }

    public void setIdProceso(int idProceso) {
        this.idProceso = idProceso;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public int getTiempoCPU() {
        return tiempoCPU;
    }

    public void setTiempoCPU(int tiempoCPU) {
        this.tiempoCPU = tiempoCPU;
    }

    public int getTiempoCPURestante() {
        return tiempoCPURestante;
    }

    public void setTiempoCPURestante(int tiempoCPURestante) {
        this.tiempoCPURestante = tiempoCPURestante;
    }

    public String toString() {
        return "ID: " + idProceso + ", Cédula: " + cedula +
                ", Tiempo CPU: " + tiempoCPU;
    }

}
