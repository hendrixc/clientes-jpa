package com.banquito.core.clientesjpa.dao;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.banquito.core.clientesjpa.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

    Cliente findByTipoIdentificacionAndIdentificacion(String tipoIdentificacion, String identificacion);
    List<Cliente> findByApellidosOrderByNombres(String apellidos);
    List<Cliente> findByApellidosLikeOrderByNombres(String apellidos);
    List<Cliente> findByIngresosGreaterThan(BigDecimal ingresos);
    
}
