package com.banquito.core.clientesjpa.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Embeddable
public class ClienteReferenciaPK {
    
    @Column(name = "COD_CLIENTE", nullable = false)
    private Integer codigo;
    @Column(name = "COD_REFERENCIA", length = 2, nullable = false)
    private Integer codigoReferencia;
    
    public ClienteReferenciaPK(Integer codigo, Integer codigoReferencia) {
        this.codigo = codigo;
        this.codigoReferencia = codigoReferencia;
    }
}
