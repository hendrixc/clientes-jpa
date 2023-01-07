package com.banquito.core.clientesjpa.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Embeddable
public class ClienteInformacionContactoPK {
    
    @Column(name = "COD_CLIENTE", nullable = false)
    private Integer codigo;
    @Column(name = "TIPO_CONTACTO", length = 3, nullable = false)
    private String tipoContacto;
    public ClienteInformacionContactoPK(Integer codigo, String tipoContacto) {
        this.codigo = codigo;
        this.tipoContacto = tipoContacto;
    }
    
    
}
