package Servicios;

import Entidades.Cliente;
import Entidades.Libro;
import Entidades.Prestamo;
import Persistencia.ClienteJpaController;
import Persistencia.LibroJpaController;
import Persistencia.PrestamoJpaController;
import Persistencia.exceptions.NonexistentEntityException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class PrestamoServicio {

    PrestamoJpaController prestamoDao = new PrestamoJpaController();

    private final Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void crearPrestamo() throws Exception {
        System.out.println("Seleccione el cliente");
        Cliente cliente = seleccionarCliente();
        if (cliente == null) {
            throw new Exception("Cliente no encontrado");
        }
        System.out.println("Seleccione el libro");
        Libro libro = seleccionarLibro();
        if (libro == null) {
            throw new Exception("Libro no encontrado o no disponible");
        }
        Date fechaPrestamo = validarFechaPrestamo();
        Date fechaDevolucion = validarFechaDevolucion(fechaPrestamo);
        Prestamo prestamo = new Prestamo(1, fechaPrestamo, fechaDevolucion, libro, cliente);
        prestamoDao.create(prestamo);
    }

    private Cliente seleccionarCliente() {
        ClienteJpaController clienteDao = new ClienteJpaController();
        List<Cliente> clientes = clienteDao.findClienteEntities();

        for (Cliente item : clientes) {
            System.out.println(item);
        }

        System.out.println("Ingrese el ID del cliente para seleccionar: ");
        Integer id = leer.nextInt();
        Cliente cliente = clienteDao.findCliente(id);

        return cliente;
    }

    private Libro seleccionarLibro() throws Exception {
        LibroJpaController libroDao = new LibroJpaController();
        List<Libro> libros = libroDao.findLibroEntities();

        for (Libro item : libros) {
            System.out.println(item);
        }

        System.out.println("Ingrese el ISBN del libro para seleccionar: ");
        Long id = leer.nextLong();
        Libro libro = libroDao.findLibro(id);

        try {
            if (libro.getEjemplaresRestantes() < 1) {
                System.out.println("No hay libros disponibles");
                libro = null;
            } else {
                Integer ejemplaresPrestados = libro.getEjemplaresPrestados() + 1;
                libro.setEjemplaresPrestados(ejemplaresPrestados);
                libro.setEjemplaresRestantes();
                libroDao.edit(libro);
            }
        } catch (NullPointerException e) {
            System.out.println("Libro no encontrado");
        }

        return libro;
    }

    private Date validarFechaPrestamo() throws ParseException {
        DateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

        Date fechaPrestamo = new Date();
        Boolean check = false;
        long diaMilisegundos = 24 * 60 * 60 * 1000L;
        long fechaAnteriorMilisegundos = fechaPrestamo.getTime() - diaMilisegundos;
        Date fechaActual = new Date(fechaAnteriorMilisegundos);
        do {
            try {
                System.out.println("Ingrese la fecha de prestamo del libro (dd/mm/aaaa): ");
                String fecha = leer.next();
                fechaPrestamo = formato.parse(fecha);
                System.out.println(fechaPrestamo);
                check = true;
            } catch (ParseException e) {
                System.out.println("El formato de la fecha no es correcto");
            }
            if (fechaPrestamo.before(fechaActual)) {
                System.out.println("La fecha de prestamo no puede ser menor que la fecha actual");
                check = false;
            }
        } while (!check);

        return fechaPrestamo;
    }

    private Date validarFechaDevolucion(Date fechaPrestamo) throws ParseException {
        DateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

        Date fechaDevolucion = new Date();
        Boolean check = false;
        do {
            try {
                System.out.println("Ingrese la fecha de devolucion del libro (dd/mm/aaaa): ");
                String fecha = leer.next();
                fechaDevolucion = formato.parse(fecha);
                System.out.println(fechaDevolucion);
                check = true;
            } catch (ParseException e) {
                System.out.println("El formato de la fecha no es correcto");
            }
            if (fechaDevolucion.before(fechaPrestamo)) {
                System.out.println("La fecha de devolucion no puede ser menor que la fecha de prestamo");
                check = false;
            }
        } while (!check);

        return fechaDevolucion;
    }

    public Prestamo buscarPrestamo(Integer id) {

        Prestamo prestamo = prestamoDao.findPrestamo(id);

        return prestamo;
    }

    public void mostrarPrestamo() {
        System.out.println("Ingrese el id del prestamo: ");
        Integer id = leer.nextInt();

        Prestamo prestamo = prestamoDao.findPrestamo(id);

        if (prestamo != null) {
            System.out.println(prestamo);
        } else {
            System.out.println("No existe ese prestamo");
        }
    }

    public void mostrarPrestamoPorCliente() {
        Cliente cliente = seleccionarCliente();
        List<Prestamo> prestamos = null;
        if (cliente != null) {
            int id = cliente.getId();
            prestamos = prestamoDao.findPrestamoByCliente(id);
        }

        try {
            if (prestamos.size() > 1) {
                for (Prestamo prestamo : prestamos) {
                    System.out.println(prestamo);
                }
            } else {
                System.out.println("No se ha encontrado ningun prestamo para ese cliente");
            }
        } catch (NullPointerException e) {
            System.out.println("No se ha encontrado ningun cliente con ese id");
        }

    }

    public void mostrarPrestamos() {

        List<Prestamo> prestamos = prestamoDao.findPrestamoEntities();

        for (Prestamo prestamo : prestamos) {
            System.out.println(prestamo);
        }
    }

    public void mostrarLibrosPrestados() {

        List<Prestamo> prestamos = prestamoDao.findPrestamoEntities();

        for (Prestamo prestamo : prestamos) {
            System.out.println(prestamo.getLibro());
        }
    }

    public void modificarPrestamo() throws Exception {
        System.out.println("Ingrese el id del prestamo a modificar: ");
        Integer id = leer.nextInt();

        Prestamo prestamo = buscarPrestamo(id);

        if (prestamo != null) {
            System.out.println("Seleccione el nuevo cliente");
            Cliente cliente = seleccionarCliente();
            if (cliente == null) {
                throw new Exception("Cliente no encontrado");
            }
            prestamo.setCliente(cliente);
            System.out.println("Seleccione el nuevo libro");
            Libro libro = seleccionarLibro();
            if (libro == null) {
                throw new Exception("Libro no encontrado o no disponible");
            }
            prestamo.setLibro(libro);
            Date fechaPrestamo = validarFechaPrestamo();
            prestamo.setFechaPrestamo(fechaPrestamo);
            Date fechaDevolucion = validarFechaDevolucion(fechaPrestamo);
            prestamo.setFechaDevolucion(fechaDevolucion);
            prestamoDao.edit(prestamo);
        } else {
            throw new Exception("No existe ese prestamo");
        }
    }

    public void devolverLibro() throws NonexistentEntityException, Exception {
        LibroJpaController libroDao = new LibroJpaController();
        System.out.println("Ingrese el isbn del libro que desea devolver");
        mostrarLibrosPrestados();
        long isbn = leer.nextLong();
        List<Prestamo> prestamos = prestamoDao.findPrestamoByLibroIsbn(isbn);
        ArrayList<Integer> idPrestamos = new ArrayList<>();
        for (Prestamo prestamo : prestamos) {
            System.out.println(prestamo);
            idPrestamos.add(prestamo.getId());
        }
        System.out.println("Ingrese el id del prestamo");
        Integer id = leer.nextInt();
        if (idPrestamos.contains(id)) {
            Prestamo prestamo = buscarPrestamo(id);

            if (prestamo != null) {
                Libro libro = prestamo.getLibro();
                int ejemplaresPrestados = libro.getEjemplaresPrestados() - 1;
                libro.setEjemplaresPrestados(ejemplaresPrestados);
                libro.setEjemplaresRestantes();
                libroDao.edit(libro);
                prestamoDao.destroy(id);
            } else {
                throw new Exception("No existe ese prestamo");
            }
        } else {
            throw new Exception("No existe ese prestamo o no contiene ese libro");
        }
    }

    public void eliminarPrestamo() throws NonexistentEntityException, Exception {
        LibroJpaController libroDao = new LibroJpaController();
        System.out.println("Ingrese el id del prestamo a eliminar: ");
        Integer id = leer.nextInt();
        Prestamo prestamo = buscarPrestamo(id);

        if (prestamo != null) {
            Libro libro = prestamo.getLibro();
            int ejemplaresPrestados = libro.getEjemplaresPrestados() - 1;
            libro.setEjemplaresPrestados(ejemplaresPrestados);
            libro.setEjemplaresRestantes();
            libroDao.edit(libro);
        }

        prestamoDao.destroy(id);
    }

}
