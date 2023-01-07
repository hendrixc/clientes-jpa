package com.banquito.core.clientesjpa.model;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name="CLIENTE_INFORMACION_CONTACTO")
public class ClienteInformacionContacto {
    
    @EmbeddedId
    private ClienteInformacionContactoPK pk;
    @Column(name = "VALOR", length = 100, nullable = false)
    private String valor;
    public ClienteInformacionContacto(ClienteInformacionContactoPK pk) {
        this.pk = pk;
    }

    
}
