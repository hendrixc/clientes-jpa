package com.banquito.core.clientesjpa.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.banquito.core.clientesjpa.model.ClienteDireccion;
import com.banquito.core.clientesjpa.model.ClienteDireccionPK;

public interface ClienteDireccionRepository extends JpaRepository<ClienteDireccion, ClienteDireccionPK>{
    
}
