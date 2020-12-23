package br.com.projetos.livros.controller.dto;

import br.com.projetos.livros.modelo.Livro;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

public class LivrosDto {

    private Integer id;
    private String indicacao;
    private String nome;
    private String autor;
    private String editora;
    private String genero;
    @JsonFormat(pattern= "dd/MM/yyyy")
    private LocalDate dataPublicacao;
    @JsonFormat(pattern= "dd/MM/yyyy")
    private LocalDate dataInicio;


    public LivrosDto(Livro livro) {
        this.id = livro.getId();
        this.indicacao = livro.getIndicacao();
        this.nome = livro.getNome();
        this.autor = livro.getAutor();
        this.editora = livro.getEditora();
        this.genero = livro.getGenero();
        this.dataPublicacao = livro.getDataPublicacao();
        this.dataInicio = livro.getDataInicio();

    }

    public static List<LivrosDto> converter(List<Livro> livros) {
    return livros.stream().map(LivrosDto::new).collect(Collectors.toList());
    }

    public Integer getId() {
        return id;
    }

    public String getIndicacao() {
        return indicacao;
    }

    public String getNome() {
        return nome;
    }

    public String getAutor() {
        return autor;
    }

    public String getEditora() {
        return editora;
    }

    public String getGenero() {
        return genero;
    }

    public LocalDate getDataPublicacao() {
        return dataPublicacao;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }
}
