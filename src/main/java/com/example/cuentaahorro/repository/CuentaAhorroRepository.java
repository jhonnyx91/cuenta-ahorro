package com.example.cuentaahorro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CuentaAhorroRepository extends JpaRepository<CuentaAhorroData, Long> {


    CuentaAhorroData findOneByNumCuenta(String numCuenta);

    void deleteOneByNumCuenta(String numCuenta);
}
