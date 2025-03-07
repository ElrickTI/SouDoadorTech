package com.SouDoadorTECH.models;


import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
public class PedidoDoacao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String fotoPaciente;
    private String nomeCompletoPaciente;
    private String dataNascimentoPaciente;
    private TipoSanguineo tipoSanguineoPaciente;
    private String hospitalDoacao;
    private String HistoriaPaciente;
    private StatusPedidoDoacao statusPedidoDoacao;

    @OneToMany(mappedBy = "pedidoDoacao")
    private List<Doacao> doacoes = new ArrayList<>();

    @ManyToOne
    @JoinColumn(name = "id_usuario_solicitante")
    private Usuario usuario;


    public PedidoDoacao(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFotoPaciente() {
        return fotoPaciente;
    }

    public void setFotoPaciente(String fotoPaciente) {
        this.fotoPaciente = fotoPaciente;
    }

    public String getNomeCompletoPaciente() {
        return nomeCompletoPaciente;
    }

    public void setNomeCompletoPaciente(String nomeCompletoPaciente) {
        this.nomeCompletoPaciente = nomeCompletoPaciente;
    }

    public String getDataNascimentoPaciente() {
        return dataNascimentoPaciente;
    }

    public void setDataNascimentoPaciente(String dataNascimentoPaciente) {
        this.dataNascimentoPaciente = dataNascimentoPaciente;
    }

    public TipoSanguineo getTipoSanguineoPaciente() {
        return tipoSanguineoPaciente;
    }

    public void setTipoSanguineoPaciente(TipoSanguineo tipoSanguineoPaciente) {
        this.tipoSanguineoPaciente = tipoSanguineoPaciente;
    }

    public String getHospitalDoacao() {
        return hospitalDoacao;
    }

    public void setHospitalDoacao(String hospitalDoacao) {
        this.hospitalDoacao = hospitalDoacao;
    }

    public String getHistoriaPaciente() {
        return HistoriaPaciente;
    }

    public void setHistoriaPaciente(String historiaPaciente) {
        HistoriaPaciente = historiaPaciente;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public List<Doacao> getDoacoes() {
        return doacoes;
    }

    public void setDoacoes(List<Doacao> doacoes) {
        this.doacoes = doacoes;
    }


    public StatusPedidoDoacao getStatusPedidoDoacao() {
        return statusPedidoDoacao;
    }

    public void setStatusPedidoDoacao(StatusPedidoDoacao statusPedidoDoacao) {
        this.statusPedidoDoacao = statusPedidoDoacao;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        PedidoDoacao that = (PedidoDoacao) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
