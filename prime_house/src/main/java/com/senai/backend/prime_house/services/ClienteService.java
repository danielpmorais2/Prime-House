package com.senai.backend.prime_house.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.backend.prime_house.models.Cliente;
import com.senai.backend.prime_house.repositories.ClienteRepository;

@Service
public class ClienteService {
    @Autowired
    private ClienteRepository clienteRepository;
    public Long contarClientes(){
        return clienteRepository.count();
    }
    public Cliente buscarCliente(Integer id){
        return clienteRepository.findById(id).get();
    }
    public List <Cliente> listarCliente(){
        return clienteRepository.findAll();
    }
    public Boolean deletarCliente(Integer id){
        if (clienteRepository.existsById(id)) {
        clienteRepository.deleteById(id);
        return true;
        }
        return false;
    }
    public Cliente cadastrarCliente(Cliente cliente){
         return clienteRepository.save(cliente);

    }
    public Cliente atualizarCliente(Integer id, Cliente cliente){
        Cliente clienteRecuperado= buscarCliente(id);
        if (clienteRecuperado !=null) {
            clienteRecuperado.setId(id);
        }
        if(clienteRecuperado != null){
            clienteRecuperado.setNome(clienteRecuperado.getNome());
        }
        if(clienteRecuperado!= null){
            clienteRecuperado.setCpf(clienteRecuperado.getCpf());
        }
        if (clienteRecuperado!=null) {
            clienteRecuperado.setEmail(clienteRecuperado.getEmail());
        }
        if (clienteRecuperado!=null) {
            clienteRecuperado.setTelefone(clienteRecuperado.getTelefone());
        }
        return null;

        
    }

}
