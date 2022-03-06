package com.example.cuentaahorro.rest;

import com.example.cuentaahorro.model.CuentaAhorroDTO;
import com.example.cuentaahorro.model.CuentaAhorroResponse;
import com.example.cuentaahorro.service.impl.AhorroDigitalService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@AllArgsConstructor
@Api(value = "Cuenta Digital", description = "Cuenta Digital")
public class AhorroDigitalController {

    private final AhorroDigitalService ahorroDigitalService;


//    public AhorroDigitalController(AhorroDigitalService ahorroDigitalService) {
//        this.ahorroDigitalService = ahorroDigitalService;
//    }


    @ApiOperation(value = "Cuenta Ahorro")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Se creo cuenta."),
            @ApiResponse(code = 401, message = "Unauthorized."),
            @ApiResponse(code = 500, message = "Internal server error."),
    })
    @PostMapping(path = "/cuentadigital", consumes = {MediaType.APPLICATION_JSON_VALUE}
            , produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<CuentaAhorroResponse> create(
            @RequestBody CuentaAhorroDTO request) {
        return ResponseEntity.ok(ahorroDigitalService.create(request));
    }

    @GetMapping(path = "/cuentadigital", consumes = {MediaType.APPLICATION_JSON_VALUE}
            , produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<CuentaAhorroDTO> consultar(@RequestParam String numCuenta) {
        return ResponseEntity.ok(ahorroDigitalService.consultar(numCuenta));
    }

    @DeleteMapping(path = "/cuentadigital", consumes = {MediaType.APPLICATION_JSON_VALUE}
            , produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<String> borrar(@RequestParam String numCuenta) {
        return ResponseEntity.ok(ahorroDigitalService.borrar(numCuenta));
    }
}
