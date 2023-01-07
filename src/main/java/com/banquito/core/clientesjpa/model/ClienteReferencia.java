package com.banquito.core.clientesjpa.model;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "CLIENTE_REFERENCIA")
public class ClienteReferencia {

    @EmbeddedId
    private ClienteReferenciaPK pk;
    @Column(name = "TIPO_REFERENCIA", length = 3, nullable = false)
    private String tipoReferencia;
    @Column(name = "NOMBRE_COMPLETO", length = 100, nullable = false)
    private String nombreCompleto;
    @Column(name = "DIRECCION", length = 150, nullable = false)
    private String direccion;
    @Column(name = "TELEFONO_cASA", length = 12, nullable = false)
    private String telefonoCasa;
    @Column(name = "TELEFONO_MOVIL", length = 12, nullable = false)
    private String telefonoMovil;
    @Column(name = "CORREO_ELECTRONICO", length = 50, nullable = false)
    private String correoElectronico;
    
    @ManyToOne
    @JoinColumn(name="COD_CLIENTE", insertable = false, updatable = false, nullable = false)
    private Cliente cliente;
    
    public ClienteReferencia(ClienteReferenciaPK pk) {
        this.pk = pk;
    }

    
}
