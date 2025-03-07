package com.SouDoadorTECH.models;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.Objects;

@Entity
public class Doacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idDoacao;

    @ManyToOne
    @JoinColumn(name = "id_doador")
    private Doador doador;

    private LocalDateTime dataInformada;

    private LocalDateTime dataDoacao;

    @ManyToOne
    @JoinColumn(name = "id_pedidoDoacao")
    private PedidoDoacao pedidoDoacao;

    private String fotoCartaoDoacao;

    private StatusDoacao statusDoacao;

    public Doacao(){}

    public Long getIdDoacao() {
        return idDoacao;
    }

    public void setIdDoacao(Long idDoacao) {
        this.idDoacao = idDoacao;
    }

    public Doador getDoador() {
        return doador;
    }

    public void setDoador(Doador doador) {
        this.doador = doador;
    }

    public LocalDateTime getDataInformada() {
        return dataInformada;
    }

    public void setDataInformada(LocalDateTime dataInformada) {
        this.dataInformada = dataInformada;
    }

    public LocalDateTime getDataDoacao() {
        return dataDoacao;
    }

    public void setDataDoacao(LocalDateTime dataDoacao) {
        this.dataDoacao = dataDoacao;
    }

    public PedidoDoacao getPedidoDoacao() {
        return pedidoDoacao;
    }

    public void setPedidoDoacao(PedidoDoacao pedidoDoacao) {
        this.pedidoDoacao = pedidoDoacao;
    }

    public String getFotoCartaoDoacao() {
        return fotoCartaoDoacao;
    }

    public void setFotoCartaoDoacao(String fotoCartaoDoacao) {
        this.fotoCartaoDoacao = fotoCartaoDoacao;
    }

    public StatusDoacao getStatusDoacao() {
        return statusDoacao;
    }

    public void setStatusDoacao(StatusDoacao statusDoacao) {
        this.statusDoacao = statusDoacao;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Doacao doacao = (Doacao) o;
        return Objects.equals(idDoacao, doacao.idDoacao);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(idDoacao);
    }
}
