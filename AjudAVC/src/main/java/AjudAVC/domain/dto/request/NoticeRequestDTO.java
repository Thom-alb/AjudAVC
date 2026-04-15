package AjudAVC.domain.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record NoticeRequestDTO(
        @NotNull(message = "ID de autor Obrigatório" )
        Integer autorid,

        @NotBlank(message = "Insira um titulo para o aviso")
        String titulo,

        @NotBlank(message = "Insira um texto para o aviso")
        String conteudo,

        @NotBlank(message = "Insira uma categoria")
        String categoria,

        @NotNull(message = "ID de grupo Obrigatório")
        Integer grupoid
) {}

