package br.com.bluebank.crudtest.model;

import javax.persistence.*;

@Entity
@Table(name = "tb_enderecos")
public class Endereco {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_endereco")
    private Long id;
    private String rua;
    private String bairro;
    private String estado;
    private String logradouro;
    private String cep;

    public Long getId() {
        return id;
    }

    public String getRua() {
        return rua;
    }
    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getLogradouro() {
        return logradouro;
    }
    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getCep() {
        return cep;
    }
    public void setCep(String cep) {
        this.cep = cep;
    }
}
