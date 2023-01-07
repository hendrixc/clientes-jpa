package com.banquito.core.clientesjpa.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.banquito.core.clientesjpa.dao.ClienteRepository;
import com.banquito.core.clientesjpa.model.Cliente;

import jakarta.transaction.Transactional;

@Service
public class ClienteService {

    private final ClienteRepository clienteRepository;

    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }


    @Transactional
    public void crearCliente(Cliente cliente) {
        cliente.setNombreCompleto(cliente.getApellidos()+" "+cliente.getNombres());
        if (cliente.getFechaNacimiento().after(new Date())) {
            throw new RuntimeException("La fecha de nacimiento es invalida "+ cliente.getFechaNacimiento());
        }
        cliente.setEstado("INA");
        cliente.setFechaCreacion(new Date());
        Cliente clienteTemp = this.clienteRepository.findByTipoIdentificacionAndIdentificacion(cliente.getTipoIdentificacion(), cliente.getIdentificacion());
        if (clienteTemp !=null) {
            throw new RuntimeException("El cliente ya existe");
        }
        this.clienteRepository.save(cliente);
    }

    public List<Cliente> obtenerTodos() {
        return this.clienteRepository.findAll();
    }

    public List<Cliente> obtenerPorApellidos(String apellido) {
        return this.clienteRepository.findByApellidosLikeOrderByNombres(apellido);
    }

    public Cliente findById(Integer id) {
        Optional<Cliente> clienteOpt = this.clienteRepository.findById(id);
        if (clienteOpt.isPresent()) {
            return clienteOpt.get();
        } else {
            throw new RuntimeException("No se encontro el cliente");
        }
    }

    public Cliente obtenerPorTipoYIdentificacion(String tipo, String identificacion) {
        return this.clienteRepository.findByTipoIdentificacionAndIdentificacion(tipo, identificacion);
    }

    
}
