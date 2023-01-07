package com.banquito.core.clientesjpa.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.banquito.core.clientesjpa.model.ClienteReferencia;
import com.banquito.core.clientesjpa.model.ClienteReferenciaPK;

public interface ClienteReferenciaRepository extends JpaRepository<ClienteReferencia, ClienteReferenciaPK>{
    
    List<ClienteReferencia> findByTipoReferencia(String tipoReferencia);
}
