package br.com.projetos.livros.repository;

import br.com.projetos.livros.modelo.Livro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivroRepository extends JpaRepository<Livro, Integer>{

}
