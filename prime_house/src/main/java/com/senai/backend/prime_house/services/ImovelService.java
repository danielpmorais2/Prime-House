package com.senai.backend.prime_house.services;

import com.senai.backend.prime_house.repositories.ClienteRepository;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.backend.prime_house.models.Imovel;
import com.senai.backend.prime_house.repositories.ImovelRepository;

@Service
public class ImovelService {
    private final ClienteRepository clienteRepository;
    @Autowired
    private ImovelRepository ImovelRepository;
    ImovelService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }
    public Long contarImovel(){
        return ImovelRepository.count();
    }
    public Imovel buscarImovel(Integer id){
        return ImovelRepository.findById(id).get();
    }
    public List <Imovel> listarImovel(){
        return ImovelRepository.findAll();
    }
    public Boolean deletarImovel(Integer id){
        if (ImovelRepository.existsById(id)) {
        ImovelRepository.deleteById(id);
        return true;
        }
        return false;
    }
    public Imovel cadastrarImovel(Imovel Imovel){
         return ImovelRepository.save(Imovel);

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


