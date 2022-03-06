package com.example.cuentaahorro.service.impl;

import com.example.cuentaahorro.model.CuentaAhorroDTO;
import com.example.cuentaahorro.model.CuentaAhorroResponse;

public interface AhorroDigitalService {

    CuentaAhorroResponse create(CuentaAhorroDTO request);

    CuentaAhorroDTO consultar(String numCuenta);

    String borrar(String numCuenta);


}
