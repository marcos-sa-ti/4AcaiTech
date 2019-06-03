package data;

import java.io.InputStream;

public class ProdutoData {
    private int Id;
    private String Nome;
    private String Descricao;
    private int PrecoVenda;
    private int PrecoCompra;
    private int Quantidade;
    private String AnoLancamento;
    private String Categoria;
    private String Genero;  

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

    public String getAnoLancamento() {
        return AnoLancamento;
    }

    public void setAnoLancamento(String AnoLancamento) {
        this.AnoLancamento = AnoLancamento;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }
    
    
    
}
