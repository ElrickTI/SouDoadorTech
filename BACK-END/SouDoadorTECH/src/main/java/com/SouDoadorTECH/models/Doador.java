package com.SouDoadorTECH.models;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.Objects;

@Entity
public class Doador {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idDoador;
    private String nomeCompleto;
    private LocalDateTime dataNascimento;


    private TipoSanguineo tipoSanguineo;

    @OneToOne
    @JoinColumn(name = "id_usuario_doador")
    private Usuario usuario;

    public Doador(){}


    public Long getIdDoador() {
        return idDoador;
    }

    public void setIdDoador(Long idDoador) {
        this.idDoador = idDoador;
    }

    public LocalDateTime getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDateTime dataNascimento) {
        this.dataNascimento = dataNascimento;
    }


    public TipoSanguineo getTipoSanguineo() {
        return tipoSanguineo;
    }

    public void setTipoSanguineo(TipoSanguineo tipoSanguineo) {
        this.tipoSanguineo = tipoSanguineo;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Doador doador = (Doador) o;
        return Objects.equals(idDoador, doador.idDoador);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(idDoador);
    }
}
