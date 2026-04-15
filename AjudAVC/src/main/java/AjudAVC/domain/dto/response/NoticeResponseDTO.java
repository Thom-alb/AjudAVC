package AjudAVC.domain.dto.response;

import java.time.LocalDateTime;

public record NoticeResponseDTO(
        Integer id,
        String titulo,
        String conteudo,
        String categoria,
        String nomeAutor,
        LocalDateTime dataCriacao
) {}
