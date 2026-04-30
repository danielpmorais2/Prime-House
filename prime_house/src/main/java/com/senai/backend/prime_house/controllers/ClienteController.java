package com.senai.backend.prime_house.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senai.backend.prime_house.models.Cliente;
import com.senai.backend.prime_house.services.ClienteService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
@RequestMapping("/clientes/")
@RestController
public class ClienteController {
    @Autowired
    private ClienteService clienteService;



    @GetMapping("/contar-clientes/")
    public Long contarClientes(){ return clienteService.contarClientes();


    }
    @GetMapping("/buscar-clientes/(id)")
    public  Cliente buscarClientes(@PathVariable Integer id){
        return clienteService.buscarCliente(id);
    }
    public List<Cliente> listarCliente(){
        return clienteService.listarCliente();
    }
    public String deletarCliente (@PathVariable Integer id){
        if(clienteService.deletarCliente(id)){
            return "cliente deletado com sucesso";
        }
        return "cliente não encontrado";
    }
@PutMapping("/atualizar-cliente/(id)")
    public String atualizarCliente(@PathVariable Integer id, @RequestBody Cliente cliente){
        if(clienteService.atualizarCliente(id, cliente)!=null){
          return "Cliente atualizado com sucesso";
        }
    return "Falha ao atualizar cliente";

    
}
}