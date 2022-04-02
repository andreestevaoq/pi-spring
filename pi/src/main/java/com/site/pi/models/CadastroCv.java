package com.site.pi.models;

import java.io.Serializable;
//import java.util.List;
//import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;

@Entity
public class CadastroCv implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

    @NotEmpty
    private String nome;

    @NotEmpty
    private String cpf;

    @NotEmpty
    private String email;

    @NotEmpty
    private String cel;

  @NotEmpty
  private String nascimento;

   @NotEmpty
   private String sexo;

   @NotEmpty
   private String cep;

   @NotEmpty
   private String logradouro;

   @NotEmpty
   private String numero;

    
    private String complemento;

    @NotEmpty
    private String bairro;

    @NotEmpty
    private String cidade;

    @NotEmpty
    private String uf;

    @NotEmpty
    private String competencias;

    @NotEmpty
    private String experiencias;

    

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCel() {
        return cel;
    }

    public void setCel(String cel) {
        this.cel = cel;
    }

   public String getNascimento() {
        return nascimento;
    }

    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }
 
    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getCompetencias() {
        return competencias;
    }

    public void setCompetencias(String competencias) {
        this.competencias = competencias;
    }

    public String getExperiencias() {
        return experiencias;
    }

    public void setExperiencias(String experiencias) {
        this.experiencias = experiencias;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }








    
}
