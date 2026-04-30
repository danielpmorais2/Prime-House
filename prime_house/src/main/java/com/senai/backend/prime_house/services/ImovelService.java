package com.senai.backend.prime_house.services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.backend.prime_house.models.Imovel;
import com.senai.backend.prime_house.repositories.ImovelRepository;

@Service
public class ImovelService {
    
    @Autowired
    private ImovelRepository imovelRepository;

    public Long contarImovel(){
        return imovelRepository.count();
    }
    public Imovel buscarImovel(Integer id){
        return imovelRepository.findById(id).get();
    }
    public List <Imovel> listarImovel(){
        return imovelRepository.findAll();
    }
    public Boolean deletarImovel(Integer id){
        if (imovelRepository.existsById(id)) {
        imovelRepository.deleteById(id);
        return true;
        }
        return false;
    }
    public Imovel cadastrarImovel(Imovel Imovel){
         return imovelRepository.save(Imovel);

    }
    
}


