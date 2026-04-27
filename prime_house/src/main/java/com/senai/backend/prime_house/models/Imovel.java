package main.java.com.senai.backend.prime_house.models;

import jakarta.persistence.Table;

import java.time.LocalDate;

import javax.annotation.processing.GeneratedValue;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
@Table(name= "imovel")

public class Imovel {
  @Id
  @GeneratedValue(strategy=GenerationType.IDENTIFY)
  @Column (name="id")
  private Integer Id;
  @Column (name = "imovel")
  private String imovel;

  @Column (name="data_nascimento")
  private LocalDate id_imovel;

  public imovel() {
  }

  public imovel(Integer id, String nome, LocalDate id_Imovel) {
    Id = id;
    this.nome = nome;
    this.id_Imovel = id_imovel;
  }

  public Integer getId() {
    return Id;
  }

  public void setId(Integer id) {
    Id = id;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public LocalDate getid_Imovel() {
    return id_Imovel;
  }

  public void setid_Imovel(LocalDate id_Imovel) {
    this.id_Imovel = id_Imovel;
  }
  
  
}