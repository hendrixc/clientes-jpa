package com.banquito.core.clientesjpa.model;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Version;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name="CLIENTE_INFORMACION_CONTACTO")
public class ClienteInformacionContacto implements Serializable{
    
    @EmbeddedId
    private ClienteInformacionContactoPK pk;
    @Column(name = "VALOR", length = 100, nullable = false)
    private String valor;
    @Version
    private Long version;

    @ManyToOne
    @JoinColumn(name="COD_CLIENTE", insertable = false, updatable = false, nullable = false)
    private Cliente cliente;
    
    public ClienteInformacionContacto(ClienteInformacionContactoPK pk) {
        this.pk = pk;
    }

    
}
