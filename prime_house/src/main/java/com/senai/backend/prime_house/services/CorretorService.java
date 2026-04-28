package com.senai.backend.prime_house.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.backend.prime_house.models.Corretor;
import com.senai.backend.prime_house.repositories.CorretorRepository;

@Service
public class CorretorService {
    @Autowired
    private CorretorRepository corretorRepository;
    public Long contarcorretor(){
        return corretorRepository.count();
    }
    public Corretor buscarcorretor(Integer id){
        return corretorRepository.findById(id).get();
    }
    public List <Corretor> listarcorretor(){
        return corretorRepository.findAll();
    }
    public Boolean deletarcorretor(Integer id){
        if (corretorRepository.existsById(id)) {
        corretorRepository.deleteById(id);
        return true;
        }
        return false;
    }
    public Corretor cadastrarcorretor(Corretor corretor){
         return corretorRepository.save(corretor);

    }
    public Corretor atualizarcorretor(Integer id, Corretor corretor){
        Corretor corretorRecuperado= buscarcorretor(id);
        if (corretorRecuperado !=null) {
            corretorRecuperado.setId(id);
        }
        if(corretorRecuperado != null){
            corretorRecuperado.setNome(corretorRecuperado.getNome());
        }
        
        return null;

        
    }

}
