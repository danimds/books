package br.com.projetos.livros.controller.form;

import br.com.projetos.livros.modelo.Livro;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.sun.istack.NotNull;

import java.time.LocalDate;

public class LivroForm {
    @NotNull
    private String indicacao;
    @NotNull
    private String nome;
    @NotNull
    private String autor;
    @NotNull
    private String editora;
    @NotNull
    private String genero;
    @NotNull
    @JsonFormat(pattern= "dd/MM/yyyy")

    private LocalDate dataPublicacao;
    @JsonFormat(pattern= "dd/MM/yyyy")

    private LocalDate dataInicio;

    public String getIndicacao() {
        return indicacao;
    }

    public void setIndicacao(String indicacao) {
        this.indicacao = indicacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public LocalDate getDataPublicacao() {
        return dataPublicacao;
    }

    public void setDataPublicacao(LocalDate dataPublicacao) {
        this.dataPublicacao = dataPublicacao;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Livro converter() {
        return new Livro(indicacao, nome, autor, editora, genero, dataPublicacao, dataInicio);
    }
}


