package com.senai.backend.prime_house.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senai.backend.prime_house.models.Corretor;
import com.senai.backend.prime_house.services.CorretorService;

@RequestMapping("/corretor/")
@RestController
public class CorretorController {
    @Autowired
    private CorretorService corretorService;



    @GetMapping("/contar-corretor/")
    public Long contarcorretor(){ return corretorService.contarcorretor();


    }
    @GetMapping("/buscar-corretor/(id)")
    public  Corretor buscarcorretors(@PathVariable Integer id){
        return corretorService.buscarcorretor(id);
    }
    public List<Corretor> listarcorretor(){
        return corretorService.listarcorretor();
    }
    public String deletarcorretor (@PathVariable Integer id){
        if(corretorService.deletarcorretor(id)){
            return "Corretor deletado com sucesso";
        }
        return "Corretor não encontrado";
    }
@PutMapping("/atualizar-corretor/(id)")
    public String atualizarcorretor(@PathVariable Integer id, @RequestBody Corretor corretor){
        if(corretorService.atualizarcorretor(id, corretor)!=null){
          return "Corretor atualizado com sucesso";
        }
    return "Falha ao atualizar corretor";

    
}
}