package com.senai.backend.prime_house.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.senai.backend.prime_house.models.Venda;
@Repository
public interface VendaRepository extends JpaRepository<Venda, Integer> {
    
}
