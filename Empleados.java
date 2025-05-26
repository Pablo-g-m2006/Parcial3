/**
 * Clase que gestiona un conjunto de empleados.
 */
public class Empleados {
    /**
     * Array que almacena los empleados.
     */
    private Empleado[] lista;

    /**
     * Contador de empleados dados de alta.
     */
    private int contador;

    /**
     * Constructor que inicializa la lista de empleados con una capacidad dada.
     * @param capacidad Número máximo de empleados.
     */
    public Empleados(int capacidad) {
        lista = new Empleado[capacidad];
        contador = 0;
    }

    /**
     * Da de alta un nuevo empleado en la lista.
     * @param empleado El empleado a añadir.
     */
    public void darDeAlta(Empleado empleado) {
        if (contador < lista.length) {
            lista[contador] = empleado;
            contador++;
        } else {
            System.out.println(Textos.NO_MAS_EMPLEADOS);
        }
    }

    /**
     * Aumenta el salario de todos los empleados en un porcentaje dado.
     * @param porcentaje Porcentaje de aumento.
     */
    public void aumentarSalario(double porcentaje) {
        for (Empleado empleado : lista) {
            if (empleado != null) {
                double nuevoSalario = empleado.getSalario() * (1 + porcentaje / 100);
                empleado.setSalario(nuevoSalario);
            }
        }
    }

    /**
     * Muestra por pantalla la lista de empleados.
     */
    public void mostrarEmpleados() {
        System.out.println(Textos.LISTA_EMPLEADOS);
        for (Empleado empleado : lista) {
            if (empleado != null) {
                System.out.println(empleado);
            }
        }
    }

    /**
     * Devuelve el array de empleados.
     * @return Array de empleados.
     */
    public Empleado[] getLista() {
        return lista;
    }
}