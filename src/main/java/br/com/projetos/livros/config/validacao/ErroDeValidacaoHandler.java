package br.com.projetos.livros.config.validacao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

@RestControllerAdvice
public class ErroDeValidacaoHandler {

    @ResponseStatus(code = HttpStatus.BAD_REQUEST)
    @ExceptionHandler(MethodArgumentNotValidException.class)

    @Autowired

    private MessageSource messageSource;

    public List<ErrodeFormularioDto> handler(MethodArgumentNotValidException exception) {
        List<ErrodeFormularioDto> errosDto = new ArrayList<>();
        List<FieldError> fieldError = exception.getBindingResult().getFieldErrors(); //lista de erros do formulario
        fieldErrors.forEach(e -> {
            String mensagem = MessageSource;
            ErroDeValidacaoHandler erro = new ErrodeFormularioDto(e.getField(), erro);
        });

        return errosDto;
    }
}
