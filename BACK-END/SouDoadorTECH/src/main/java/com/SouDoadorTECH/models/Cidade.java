package com.SouDoadorTECH.models;


import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
public class Cidade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCidade;
    private String nome;

    @ManyToOne
    @JoinColumn(name = "id_estado_cidade")
    private Estado estado;

    @OneToMany(mappedBy = "cidade")
    private List<Endereco> enderecosCidade = new ArrayList<>();


    public Cidade(){}


    public Long getIdCidade() {
        return idCidade;
    }

    public void setIdCidade(Long idCidade) {
        this.idCidade = idCidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public List<Endereco> getEnderecosCidade() {
        return enderecosCidade;
    }

    public void setEnderecosCidade(List<Endereco> enderecosCidade) {
        this.enderecosCidade = enderecosCidade;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Cidade cidade = (Cidade) o;
        return Objects.equals(idCidade, cidade.idCidade);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(idCidade);
    }
}
