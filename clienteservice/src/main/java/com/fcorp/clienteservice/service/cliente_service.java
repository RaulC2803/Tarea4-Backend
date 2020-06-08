package com.fcorp.clienteservice.service;

import com.fcorp.clienteservice.entity.Cliente;
import com.fcorp.clienteservice.repositorio_cliente.Cliente_repositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class cliente_service {
    @Autowired
    private Cliente_repositorio cliente_repositorio;


    public Cliente registrarCliente(Cliente cliente) throws Exception {
        Cliente c = null;
        c = cliente;
        if (c == null){
            throw new Exception("No se pudo registrar");
        }
        else {
            return cliente_repositorio.save(c);
        }
    }
}