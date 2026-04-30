package com.senai.backend.prime_house.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senai.backend.prime_house.models.Imovel;
import com.senai.backend.prime_house.services.ImovelService;

@RequestMapping("/imoveis/")
@RestController
public class ImovelController {
    @Autowired
    private ImovelService imovelService;



    @GetMapping("/contar-imovel/")
    public Long contarimovel(){ return imovelService.contarImovel();


    }
    @GetMapping("/buscar-imovel/(id)")
    public  Imovel buscarimovel(@PathVariable Integer id){
        return imovelService.buscarImovel(id);
    }
    public List<Imovel> listarImovel(){
        return imovelService.listarImovel();
    }
    public String deletarimovel (@PathVariable Integer id){
        if(imovelService.deletarImovel(id)){
            return "Imovel deletado com sucesso";
        }
        return "Imovel não encontrado";
    }


    
}
