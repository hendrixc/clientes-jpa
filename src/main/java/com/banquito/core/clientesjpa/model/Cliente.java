package com.banquito.core.clientesjpa.model;

import java.math.BigDecimal;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "CLIENTE")
public class Cliente {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "COD_CLIENTE", nullable = false)
    private Integer codigo;
    @Column(name = "TIPO_IDENTIFICACION", length = 3, nullable = false)
    private String tipoIdentificacion;
    @Column(name = "IDENTIFICACION", length = 20, nullable = false)
    private String identificacion;
    @Column(name = "APELLIDOS", length = 50, nullable = false)
    private String apellidos;
    @Column(name = "NOMBRES", length = 50, nullable = false)
    private String nombres;
    @Column(name = "NOMBRE_COMPLETO", length = 100, nullable = false)
    private String nombreCompleto;
    @Temporal(TemporalType.DATE)
    @Column(name = "FECHA_NACIMIENTO", nullable = false)
    private Date fechaNacimiento;
    @Column(name="INGRESOS", scale = 15, precision = 2, nullable = true)
    private BigDecimal ingresos;
    @Column(name="EGRESOS", scale = 15, precision = 2, nullable = true)
    private BigDecimal egresos;
    @Column(name = "ESTADO", length = 3, nullable = false)
    private String estado;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "FECHA_CREACION", nullable = false)
    private Date fechaCreacion;

    public Cliente(Integer codigo) {
        this.codigo = codigo;
    }

}
