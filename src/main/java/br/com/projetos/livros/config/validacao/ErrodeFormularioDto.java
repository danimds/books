package br.com.projetos.livros.config.validacao;

public class ErrodeFormularioDto {
    private String campo;
    private String mensagem;

    public ErrodeFormularioDto(String campo, String mensagem) {
        this.campo = campo;
        this.mensagem = mensagem;
    }

    public String getCampo() {
        return campo;
    }

    public String getMensagem() {
        return mensagem;
    }
}


