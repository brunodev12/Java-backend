package Entidades;

import Enumeraciones.FormaPago;
import Enumeraciones.TipoCobertura;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author bruno
 */
public class Poliza {

    private final Persona persona;
    private final Vehiculo vehiculo;
    private final int numeroPoliza;
    private Date fechaInicio;
    private Date fechaFin;
    private final int cantidadCuotas;
    private ArrayList<Cuota> cuotas;
    private final long montoTotalAsegurado;
    private final boolean granizo;
    private final long montoMaximoGranizo;
    private FormaPago formaDePago;
    private TipoCobertura tipoCobertura;

    public Poliza(Persona persona, Vehiculo vehiculo, int numeroPoliza, Date fechaInicio, Date fechaFin, int cantidadCuotas, long montoTotalAsegurado, boolean granizo, long montoMaximoGranizo) {
        this.persona = persona;
        this.vehiculo = vehiculo;
        this.numeroPoliza = numeroPoliza;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.cantidadCuotas = cantidadCuotas;
        this.montoTotalAsegurado = montoTotalAsegurado;
        this.granizo = granizo;
        this.montoMaximoGranizo = montoMaximoGranizo;
    }

    public Persona getPersona() {
        return persona;
    }

    public void addCuota(Cuota cuota) {
        this.cuotas.add(cuota);
    }

    public ArrayList<Cuota> getCuotas() {
        return cuotas;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public int getNumeroPoliza() {
        return numeroPoliza;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public int getCantidadCuotas() {
        return cantidadCuotas;
    }

    public FormaPago getFormaDePago() {
        return formaDePago;
    }

    public long getMontoTotalAsegurado() {
        return montoTotalAsegurado;
    }

    public boolean isGranizo() {
        return granizo;
    }

    public long getMontoMaximoGranizo() {
        return montoMaximoGranizo;
    }

    public TipoCobertura getTipoCobertura() {
        return tipoCobertura;
    }

    public void setFormaDePago(FormaPago formaDePago) {
        this.formaDePago = formaDePago;
    }

    public void setTipoCobertura(TipoCobertura tipoCobertura) {
        this.tipoCobertura = tipoCobertura;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    private Cuota generarCuota(int numCuota, long montoCuota) {
        Cuota cuota = new Cuota(numCuota, montoCuota, false, new Date( (numCuota + 1) + "/10/2023"));
        FormaPago metodoPago = this.getFormaDePago();
        cuota.setFormaPago(metodoPago);
        return cuota;
    }
    
    public void setCuotas() {
        this.cuotas = new ArrayList();
        for (int i = 0; i < this.cantidadCuotas; i++) {
            long montoCuota = 25000 + i * 1000;
            Cuota cuota = generarCuota(i + 1, montoCuota);
            cuotas.add(cuota);
        }
    }

    @Override
    public String toString() {
        return "Poliza{" + "persona=" + persona + ", vehiculo=" + vehiculo + ", numeroPoliza=" + numeroPoliza + ", fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin + ", cantidadCuotas=" + cantidadCuotas + ", cuotas=" + cuotas + ", montoTotalAsegurado=" + montoTotalAsegurado + ", granizo=" + granizo + ", montoMaximoGranizo=" + montoMaximoGranizo + ", formaDePago=" + formaDePago + ", tipoCobertura=" + tipoCobertura + '}';
    }
    
    
}
