/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.io.InputStream;

/**
 *
 * @author Android
 */
public class ProdutoData {
    private int Id;
    private String Nome;
    private String Descricao;
    private int PrecoVenda;
    private int PrecoCompra;
    private int Quantidade;
      

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String Descricao) {
        this.Descricao = Descricao;
    }

    public int getPrecoVenda() {
        return PrecoVenda;
    }

    public void setPrecoVenda(int PrecoVenda) {
        this.PrecoVenda = PrecoVenda;
    }

    public int getPrecoCompra() {
        return PrecoCompra;
    }

    public void setPrecoCompra(int PrecoCompra) {
        this.PrecoCompra = PrecoCompra;
    }

    public int getQuantidade() {
        return Quantidade;
    }

    public void setQuantidade(int Quantidade) {
        this.Quantidade = Quantidade;
    }

    public void setBlob(int i, InputStream is) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
