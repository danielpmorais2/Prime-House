package com.senai.backend.prime_house.models;

import jakarta.persistence.Table;





import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
@Table(name= "cliente")

public class Cliente {
  @Id
  
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  @Column (name= "id")
  private Integer Id;
  @Column (name = "nome")
  private String nome;

  @Column (name="cpf")
  private String cpf;

  public Cliente() {
  }

  public Cliente(Integer id, String nome, String cpf) {
    Id = id;
    this.nome = nome;
    this.cpf = cpf;
  }

  public double getId() {
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

  public String getcpf() {
    return cpf;
  }

  public void setcpf(String cpf) {
    this.cpf = cpf;
  }
  
  
}
