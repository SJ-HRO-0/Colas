import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Simulador sim = new Simulador();

        int opcion = 0;

        while(opcion != 8) {

            mostrarMenu();

            opcion = sc.nextInt();

            switch(opcion) {

                case 1:
                    System.out.println("Nombre: Juan Arauz");
                    System.out.println("Cédula: 1726319864");
                    System.out.println("Código Banner: A00084068");

                    break;

                case 2:
                    Proceso p1 = new Proceso(1, 1726319864, 20);
                    Proceso p2 = new Proceso(2, 1714196743, 46);

                    sim.cola.insertarEnCola(p1);
                    sim.cola.insertarEnCola(p2);

                    break;

                case 3:
                    System.out.print("Ingrese ID de proceso: ");
                    int id = sc.nextInt();

                    System.out.print("Ingrese cédula: ");
                    int cedula = sc.nextInt();

                    System.out.print("Ingrese tiempo CPU: ");
                    int tiempoCPU = sc.nextInt();

                    Proceso nuevo = new Proceso(id, cedula, tiempoCPU);
                    sim.cola.insertarEnCola(nuevo);

                    break;
                case 4:
                    sim.cola.imprimirCola();
                    break;

                case 5:
                    System.out.print("Ingrese valor del quantum: ");
                    int quantum = sc.nextInt();

                    sim.establecerQuantum(quantum);

                    break;
                case 6:
                    sim.ejecutarRoundRobin();
                    break;

                case 7:
                    sim.imprimirEstadisticas();
                    break;

            }

        }

    }

    public static void mostrarMenu() {

        System.out.println("Menú de Opciones:");
        System.out.println("1. Imprimir datos personales");
        System.out.println("2. Predefinir procesos");
        System.out.println("3. Insertar proceso");
        System.out.println("4. Imprimir cola");
        System.out.println("5. Establecer quantum");
        System.out.println("6. Ejecutar Round Robin");
        System.out.println("7. Ver estadísticas");
        System.out.println("8. Salir");

    }

}