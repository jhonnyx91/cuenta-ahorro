package com.example.cuentaahorro.repository;

import com.example.cuentaahorro.model.CuentaAhorroDTO;

public interface ICuentaAhorro {

    void crear(CuentaAhorroDTO cuentaAhorro);

    CuentaAhorroData consultar(String numCuenta);

    String borrar(String numCuenta);
}
