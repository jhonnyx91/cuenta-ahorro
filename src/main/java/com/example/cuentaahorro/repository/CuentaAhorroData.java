package com.example.cuentaahorro.repository;

import com.example.cuentaahorro.model.TipoTrabajoEnum;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Data
public class CuentaAhorroData {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

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
