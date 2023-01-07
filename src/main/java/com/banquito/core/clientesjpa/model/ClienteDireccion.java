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
@Table(name = "CLIENTE_DIRECCION")
public class ClienteDireccion implements Serializable{
    
    @EmbeddedId
    private ClienteDireccionPK pk;
    @Column(name = "LINEA1", length = 100, nullable = false)
    private String linea1;
    @Column(name = "LINEA2", length = 100, nullable = false)
    private String linea2;
    @Column(name = "CIUDAD", length = 50, nullable = false)
    private String ciudad;
    @Column(name = "LATITUD", nullable = true)
    private Float latitud;
    @Column(name = "LONGITUD", nullable = true)
    private Float longitud;
    @Version
    private Long version;

    @ManyToOne
    @JoinColumn(name="COD_CLIENTE", insertable = false, updatable = false, nullable = false)
    private Cliente cliente;
    
    public ClienteDireccion(ClienteDireccionPK pk) {
        this.pk = pk;
    }

    
}
