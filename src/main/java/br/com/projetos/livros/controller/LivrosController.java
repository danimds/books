package br.com.projetos.livros.controller;

import br.com.projetos.livros.controller.dto.LivrosDto;
import br.com.projetos.livros.controller.form.LivroForm;
import br.com.projetos.livros.modelo.Livro;
import br.com.projetos.livros.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/livros")
public class LivrosController {

    @Autowired
    private LivroRepository livroRepository;


   @GetMapping
    public List<LivrosDto> listaLivros() {
        List<Livro> livros = livroRepository.findAll();
        //Livro livro = new Livro(1, "Geyson", "Recursão", "Blake Crouch", "Intrísica", "Ficção Científica", LocalDate.of(2020, 06, 15), LocalDate.of(2020, 11, 13));
        return LivrosDto.converter(livros);

    }

    @PostMapping
    public ResponseEntity<LivrosDto> cadastrarLivro (@RequestBody @Validated LivroForm form, UriComponentsBuilder uriBuilder) {
       Livro livro = form.converter();
        livroRepository.save(livro);

        URI uri = uriBuilder.path("/livro/{id}").buildAndExpand(livro.getId()).toUri();
        return ResponseEntity.created(uri).body(new LivrosDto(livro));
    }
}
