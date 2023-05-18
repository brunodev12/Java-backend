/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import Enumeraciones.FormaPago;
import java.util.Date;

/**
 *
 * @author bruno
 */
public class Cuota {
    private final int numeroCuota;
    private final long montoTotalCuota;
    private boolean pagada;
    private final Date fechaVencimiento;
    private FormaPago formaPago;

    public Cuota(int numeroCuota, long montoTotalCuota, boolean pagada, Date fechaVencimiento) {
        this.numeroCuota = numeroCuota;
        this.montoTotalCuota = montoTotalCuota;
        this.pagada = pagada;
        this.fechaVencimiento = fechaVencimiento;
    }

    public int getNumeroCuota() {
        return numeroCuota;
    }

    public long getMontoTotalCuota() {
        return montoTotalCuota;
    }

    public boolean isPagada() {
        return pagada;
    }

    public void setPagada(boolean pagada) {
        this.pagada = pagada;
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public FormaPago getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(FormaPago formaPago) {
        this.formaPago = formaPago;
    }

    @Override
    public String toString() {
        return "Cuota{" + "numeroCuota=" + numeroCuota + ", montoTotalCuota=" + montoTotalCuota + ", pagada=" + pagada + ", fechaVencimiento=" + fechaVencimiento + ", formaPago=" + formaPago + '}';
    }
    
}
