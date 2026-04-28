package com.senai.backend.prime_house.services;

import com.senai.backend.prime_house.repositories.ClienteRepository;
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
    public Imovel atualizarImovel(Integer id, Imovel Imovel){
        Imovel imovelRecuperado= buscarImovel(id);
        if (imovelRecuperado !=null) {
            imovelRecuperado.setId(id);
        }

        if (imovelRecuperado!=null) {
            imovelRecuperado.setImovel().(imovelRecuperado.getImovel());
        }

        
        if(imovelRecuperado!= null){
            imovelRecuperado.setValor_Imovel(imovelRecuperado.getValor_Imovel());
        }

        
        
        return null;

        
    }
}


