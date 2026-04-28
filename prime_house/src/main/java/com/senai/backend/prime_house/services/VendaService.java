package com.senai.backend.prime_house.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.backend.prime_house.models.Venda;
import com.senai.backend.prime_house.repositories.VendaRepository;

@Service
public class VendaService {
    @Autowired
    private VendaRepository vendaRepository;
    public Long contarvendas(){
        return vendaRepository.count();
    }
    public Venda buscarvenda(Integer id){
        return vendaRepository.findById(id).get();
    }
    public List <Venda> listarvenda(){
        return vendaRepository.findAll();
    }
    public Boolean deletarvenda(Integer id){
        if (vendaRepository.existsById(id)) {
        vendaRepository.deleteById(id);
        return true;
        }
        return false;
    }
    public Venda cadastrarvenda(Venda venda){
         return vendaRepository.save(venda);

    }
    public Venda atualizarvenda(Integer id, Venda venda){
        Venda vendaRecuperado= buscarvenda(id);
        if (vendaRecuperado !=null) {
            vendaRecuperado.setId(id);
        }
        if(vendaRecuperado != null){
            vendaRecuperado.setComprador(vendaRecuperado.getComprador());
        }
       
        return null;

        
    }

}
