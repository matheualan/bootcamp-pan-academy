package br.com.bluebank.crudtest.model;

import javax.persistence.*;

@Entity
@Table(name = "tb_clientes")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_person")
    private Long id;
    private String nome;
    private String dataNascimento;
    private String nomeMae;
    private String cpf;
    private String rg;
    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "id_endereco")
    private Endereco endereco;

    public Cliente() {
    }

    public Cliente(String nome, String dataNascimento, String nomeMae, String cpf, String rg) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.nomeMae = nomeMae;
        this.cpf = cpf;
        this.rg = rg;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }
    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getNomeMae() {
        return nomeMae;
    }
    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }

    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }
    public void setRg(String rg) {
        this.rg = rg;
    }

    @Override
    public String toString() {
        return "Cliente: " +
                "\nId = " + id +
                "\nNome = " + nome +
                "\nData de Nascimento = " + dataNascimento;
    }
}
