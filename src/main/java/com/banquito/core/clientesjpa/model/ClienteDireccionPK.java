package com.banquito.core.clientesjpa.model;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Embeddable
public class ClienteDireccionPK implements Serializable{
    
    @Column(name = "COD_CLIENTE", nullable = false)
    private Integer codigo;
    @Column(name = "TIPO_DIRECCION", length = 3, nullable = false)
    private String tipoDireccion;
    
    public ClienteDireccionPK(Integer codigo, String tipoDireccion) {
        this.codigo = codigo;
        this.tipoDireccion = tipoDireccion;
    }

    
}
