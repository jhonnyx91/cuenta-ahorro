package com.example.cuentaahorro.repository;

import com.example.cuentaahorro.model.CuentaAhorroDTO;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@AllArgsConstructor
@Transactional
public class CuentaAhorro implements ICuentaAhorro {

    private final CuentaAhorroRepository cuentaAhorroRepository;

    @Override
    public void crear(CuentaAhorroDTO cuentaAhorro) {
        CuentaAhorroData cuentaAhorroData = new CuentaAhorroData();
        cuentaAhorroData.setNombres(cuentaAhorro.getNombres());
        cuentaAhorroData.setApellidos(cuentaAhorro.getApellidos());
        cuentaAhorroData.setCiudad(cuentaAhorro.getCiudad());
        //TODO: encryptar
        cuentaAhorroData.setClave(cuentaAhorro.getClave());
        cuentaAhorroData.setNumCuenta(cuentaAhorro.getNumCuenta());
        cuentaAhorroData.setDireccion(cuentaAhorro.getDireccion());
        cuentaAhorroData.setCorreo(cuentaAhorro.getCorreo());
        cuentaAhorroData.setFechaNacimiento(cuentaAhorro.getFechaNacimiento());
        cuentaAhorroData.setIngreso(cuentaAhorro.getIngreso());
        cuentaAhorroData.setEgresos(cuentaAhorro.getEgresos());
        cuentaAhorroData.setProfesion(cuentaAhorro.getProfesion());
        cuentaAhorroData.setTrabajo(cuentaAhorro.getTrabajo());
        cuentaAhorroData.setTelefono(cuentaAhorro.getTelefono());
        cuentaAhorroRepository.save(cuentaAhorroData);
    }

    @Override
    public CuentaAhorroData consultar(String numCuenta) {
        return cuentaAhorroRepository.findOneByNumCuenta(numCuenta);
    }

    @Override
    public String borrar(String numCuenta) {
        cuentaAhorroRepository.deleteOneByNumCuenta(numCuenta);
        return numCuenta;
    }
}
