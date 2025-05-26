public class Empleados {
    private Empleado[] lista;
    private int contador;

    public Empleados(int capacidad) {
        lista = new Empleado[capacidad];
        contador = 0;
    }

    public void darDeAlta(Empleado empleado) {
        if (contador < lista.length) {
            lista[contador] = empleado;
            contador++;
        } else {
            System.out.println(Textos.NO_MAS_EMPLEADOS);
        }
    }

    public void aumentarSalario(double porcentaje) {
        for (Empleado empleado : lista) {
            if (empleado != null) {
                double nuevoSalario = empleado.getSalario() * (1 + porcentaje / 100);
                empleado.setSalario(nuevoSalario);
            }
        }
    }

    public void mostrarEmpleados() {
        System.out.println(Textos.LISTA_EMPLEADOS);
        for (Empleado empleado : lista) {
            if (empleado != null) {
                System.out.println(empleado);
            }
        }
    }

    public Empleado[] getLista() {
        return lista;
    }
}