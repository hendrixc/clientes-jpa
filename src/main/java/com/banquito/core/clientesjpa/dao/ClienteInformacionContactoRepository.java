package com.banquito.core.clientesjpa.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.banquito.core.clientesjpa.model.ClienteInformacionContacto;
import com.banquito.core.clientesjpa.model.ClienteInformacionContactoPK;

public interface ClienteInformacionContactoRepository extends JpaRepository<ClienteInformacionContacto, ClienteInformacionContactoPK>{
    
}
