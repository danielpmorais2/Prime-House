package com.senai.backend.prime_house.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senai.backend.prime_house.models.Venda;
import com.senai.backend.prime_house.services.VendaService;

@RequestMapping("/vendas/")
@RestController
public class VendaController {
    @Autowired
    private VendaService vendaService;



    @GetMapping("/contar-vendas/")
    public Long contarvendas(){ return vendaService.contarvendas();


    }
    @GetMapping("/buscar-vendas/(id)")
    public  Venda buscarvendas(@PathVariable Integer id){
        return vendaService.buscarvenda(id);
    }
    public List<Venda> listarvenda(){
        return vendaService.listarvenda();
    }
    public String deletarvenda (@PathVariable Integer id){
        if(vendaService.deletarvenda(id)){
            return "venda deletado com sucesso";
        }
        return "venda não encontrado";
    }
@PutMapping("/atualizar-venda/(id)")
    public String atualizarvenda(@PathVariable Integer id, @RequestBody Venda venda){
        if(vendaService.atualizarvenda(id, venda)!=null){
          return "venda atualizado com sucesso";
        }
    return "Falha ao atualizar venda";

    
}}