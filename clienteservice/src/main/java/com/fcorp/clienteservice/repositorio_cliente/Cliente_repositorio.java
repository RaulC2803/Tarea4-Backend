package com.fcorp.clienteservice.repositorio_cliente;

import com.fcorp.clienteservice.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Cliente_repositorio extends JpaRepository<Cliente, Long> {
}
