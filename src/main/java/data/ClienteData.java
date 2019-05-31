package data;

import java.sql.Timestamp;
import java.util.Date;

public class ClienteData {
    
    private Integer id;
    private String nome;
    private String cpf;
    private String datan;
    private String telefone;
    private String endereco;
    private String datanascimento;
    private String complemento;
    private String cep;
    private String numerocasa;
    private String cidade;
    private String estado;
    private String nomet;
    private String numeroc;
    private String codsegcartao; 
    private String email; 
    private String senha;
    
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNumerocasa() {
        return numerocasa;
    }

    public void setNumerocasa(String numerocasa) {
        this.numerocasa = numerocasa;
    }

    public String getNome() {
        return nome;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getCodsegcartao() {
        return codsegcartao;
    }

    public void setCodsegcartao(String codsegcartao) {
        this.codsegcartao = codsegcartao;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getDatan() {
        return datan;
    }

    public void setDatan(String datan) {
        this.datan = datan;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getNomet() {
        return nomet;
    }

    public void setNomet(String nomet) {
        this.nomet = nomet;
    }

    public String getNumeroc() {
        return numeroc;
    }

    public void setNumeroc(String numeroc) {
        this.numeroc = numeroc;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    } 

    public String getDatanascimento() {
        return datanascimento;
    }

    public void setDatanascimento(String datanascimento) {
        this.datanascimento = datanascimento;
    }
    
    
}
