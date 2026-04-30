package com.senai.backend.prime_house.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name= "clientes")

public class Cliente {
  @Id
  
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  @Column (name= "id")
  private Integer Id;
  @Column (name = "nome")
  private String nome;

  @Column (name="cpf")
  private String cpf;

  @Column(name = "telefone")
  private String telefone;

  @Column(name = "email")
  private String email;

  public Cliente() {
  }

  public Cliente(Integer id, String nome, String cpf, String telefone, String email) {
    Id = id;
    this.nome = nome;
    this.cpf = cpf;
    this.telefone = telefone;
    this.email = email;
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

  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  public String getTelefone() {
    return telefone;
  }

  public void setTelefone(String telefone) {
    this.telefone = telefone;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }
  
  
}
