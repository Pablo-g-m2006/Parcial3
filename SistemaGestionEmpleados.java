import java.util.Scanner;

public class SistemaGestionEmpleados {

    public static void main(String[] args) {
        Empleados empleados = new Empleados(3);

        empleados.darDeAlta(new Empleado("Juan", "Desarrollador", 50000));
        empleados.darDeAlta(new Empleado("María", "Diseñadora", 45000));
        empleados.darDeAlta(new Empleado("Pedro", "Gerente", 60000));

        Scanner scanner = new Scanner(System.in);
        System.out.print(Textos.INTRODUZCA_PORCENTAJE);
        double porcentaje = scanner.nextDouble();

        empleados.aumentarSalario(porcentaje);

        empleados.mostrarEmpleados();

        scanner.close();
    }
}