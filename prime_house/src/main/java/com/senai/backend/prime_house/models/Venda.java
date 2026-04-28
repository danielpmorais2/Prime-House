package com.senai.backend.prime_house.models;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Table(name="vendas")
@Entity
public class Venda {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name = "id")
private Integer id;
@OneToMany
@JoinColumn(name = "imovel" )
private List <Imovel> imovel;
@OneToMany
@JoinColumn(name = "comprador")
private List<Cliente> comprador;
@Column
private LocalDate data_venda;
public Venda() {
}
public Venda(Integer id, List<Imovel> imovel, List<Cliente> comprador, LocalDate data_venda) {
    this.id = id;
    this.imovel = imovel;
    this.comprador = comprador;
    this.data_venda = data_venda;
}
public Integer getId() {
    return id;
}
public void setId(Integer id) {
    this.id = id;
}
public List<Imovel> getImovel() {
    return imovel;
}
public void setImovel(List<Imovel> imovel) {
    this.imovel = imovel;
}
public List<Cliente> getComprador() {
    return comprador;
}
public void setComprador(List<Cliente> comprador) {
    this.comprador = comprador;
}
public LocalDate getData_venda() {
    return data_venda;
}
public void setData_venda(LocalDate data_venda) {
    this.data_venda = data_venda;
}



}
