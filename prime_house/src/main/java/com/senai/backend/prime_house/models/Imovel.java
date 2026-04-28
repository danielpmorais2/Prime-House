package com.senai.backend.prime_house.models;

import jakarta.persistence.Table;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
@Entity
@Table(name= "imovel")

public class Imovel {
  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  @Column (name="id")
  private Integer Id;
  @Column (name = "imovel")
  private String imovel;

  @Column(name = "valor")
  private double valor_Imovel;

@OneToOne
  @JoinColumn (name="id_imovel")
  private List<Cliente> id_Imovel;
  @OneToMany
  @JoinColumn(name = "vendas")
  private List<Venda> vendas;

public Imovel() {
}

public Imovel(Integer id, String imovel, double valor_Imovel, List<Cliente> id_Imovel) {
  Id = id;
  this.imovel = imovel;
  this.valor_Imovel = valor_Imovel;
  this.id_Imovel = id_Imovel;
}

public Integer getId() {
  return Id;
}

public void setId(Integer id) {
  Id = id;
}

public String getImovel() {
  return imovel;
}

public void setImovel(String imovel) {
  this.imovel = imovel;
}

public double getValor_Imovel() {
  return valor_Imovel;
}

public void setValor_Imovel(double valor_Imovel) {
  this.valor_Imovel = valor_Imovel;
}

public List<Cliente> getId_Imovel() {
  return id_Imovel;
}

public void setId_Imovel(List<Cliente> id_Imovel) {
  this.id_Imovel = id_Imovel;
}


  


  
  
  
}