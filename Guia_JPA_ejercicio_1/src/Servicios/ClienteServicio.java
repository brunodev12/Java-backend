package Servicios;

import Entidades.Cliente;
import Persistencia.ClienteJpaController;
import Persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.Scanner;

public class ClienteServicio {

    ClienteJpaController clienteDao = new ClienteJpaController();

    private final Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void crearCliente() {

        System.out.println("Ingrese el nombre del cliente: ");
        String nombre = leer.next();
        System.out.println("Ingrese el apellido del cliente: ");
        String apellido = leer.next();
        System.out.println("Ingrese el documento del cliente: ");
        long documento = leer.nextLong();
        System.out.println("Ingrese el telefono del cliente: ");
        String telefono = leer.next();
        Cliente cliente = new Cliente(1, documento, nombre, apellido, telefono);
        clienteDao.create(cliente);
    }

    public Cliente buscarCliente(Integer id) {

        Cliente cliente = clienteDao.findCliente(id);

        return cliente;
    }

    public void mostrarCliente() {
        System.out.println("Ingrese el id del cliente: ");
        Integer id = leer.nextInt();

        Cliente cliente = clienteDao.findCliente(id);

        if (cliente != null) {
            System.out.println(cliente);
        } else {
            System.out.println("No existe ese autor");
        }
    }

    public void mostrarClientes() {

        List<Cliente> clientes = clienteDao.findClienteEntities();

        for (Cliente cliente : clientes) {
            System.out.println(cliente);
        }
    }

    public void modificarCliente() throws Exception {
        System.out.println("Ingrese el id del cliente a modificar: ");
        Integer id = leer.nextInt();

        Cliente cliente = buscarCliente(id);

        if (cliente != null) {
            System.out.println(cliente);
            System.out.println("Ingrese el nuevo nombre del cliente");
            cliente.setNombre(leer.next());
            System.out.println("Ingrese el nuevo apellido del cliente: ");
            cliente.setApellido(leer.next());
            System.out.println("Ingrese el nuevo documento del cliente: ");
            cliente.setDocumento(leer.nextLong());
            System.out.println("Ingrese el nuevo telefono del cliente: ");
            cliente.setTelefono(leer.next());
            clienteDao.edit(cliente);
        } else {
            throw new Exception("No existe ese cliente");
//            System.out.println("No existe ese cliente");
        }
    }

    public void eliminarCliente() throws NonexistentEntityException {
        System.out.println("Ingrese el id del cliente a eliminar: ");
        Integer id = leer.nextInt();

        clienteDao.destroy(id);
    }

}
