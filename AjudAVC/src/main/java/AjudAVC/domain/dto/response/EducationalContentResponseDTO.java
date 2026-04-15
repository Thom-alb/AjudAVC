package AjudAVC.domain.dto.response;

import java.time.LocalDateTime;

public record EducationalContentResponseDTO(
        Integer id,
        String titulo,
        String descricaoCurta,
        String corpoConteudo,
        String categoria,
        boolean ehEmergencia,
        String urlMidia,
        String linkFonte,
        LocalDateTime dataCriacao
) {}
