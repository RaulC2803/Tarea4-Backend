package com.fcorp.clienteservice.rest_service;

import com.fcorp.clienteservice.entity.Cliente;
import com.fcorp.clienteservice.service.cliente_service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.POST })
public class Cliente_Rest {
    @Autowired
    private cliente_service cliente_service;

    @PostMapping("/registrar")
    public Cliente registrarCliente(@RequestBody Cliente cliente) throws Exception {
        return cliente_service.registrarCliente(cliente);
    }
}
