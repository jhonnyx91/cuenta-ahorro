package com.example.cuentaahorro.service.impl;


import com.example.cuentaahorro.model.CuentaAhorroDTO;
import com.example.cuentaahorro.model.CuentaAhorroResponse;
import com.example.cuentaahorro.repository.CuentaAhorroData;
import com.example.cuentaahorro.repository.ICuentaAhorro;
import lombok.AllArgsConstructor;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AhorroDigitalServiceImpl implements AhorroDigitalService {

    private final ICuentaAhorro cuentaAhorro;

    @Override
    public CuentaAhorroResponse create(CuentaAhorroDTO request) {
        String numCuenta = RandomStringUtils.randomNumeric(11);
        request.setNumCuenta(numCuenta);
        cuentaAhorro.crear(request);
        CuentaAhorroResponse response = new CuentaAhorroResponse();
        response.setNumCuenta(numCuenta);
        return response;
    }

    @Override
    public CuentaAhorroDTO consultar(String numCuenta) {
        CuentaAhorroData data = cuentaAhorro.consultar(numCuenta);
        CuentaAhorroDTO cuentaAhorroDTO = new CuentaAhorroDTO();
        if (data == null) {
            //TODO:retornar una excepcion de negocio
            return null;
        }
        BeanUtils.copyProperties(data, cuentaAhorroDTO);
        return cuentaAhorroDTO;
    }

    @Override
    public String borrar(String numCuenta) {
        return cuentaAhorro.borrar(numCuenta);
    }
}
