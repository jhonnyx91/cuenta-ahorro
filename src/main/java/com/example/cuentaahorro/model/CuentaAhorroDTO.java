package com.example.cuentaahorro.model;

import lombok.Data;

import java.util.Date;

@Data
public class CuentaAhorroDTO {

    private String nombres;
    private String apellidos;
    private Date fechaNacimiento;
    private String telefono;
    private String correo;
    private String direccion;
    private String ciudad;
    private String profesion;
    private TipoTrabajoEnum trabajo;
    private String ingreso;
    private String egresos;
    private String numCuenta;
    private Integer clave;
}
