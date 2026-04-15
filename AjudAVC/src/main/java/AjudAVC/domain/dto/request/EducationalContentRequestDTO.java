package AjudAVC.domain.dto.request;

public record EducationalContentRequestDTO(
        String titulo,
        String descricaoCurta,
        String corpoConteudo,
        String categoria,
        boolean ehEmergencia,
        String urlMidia,
        String linkFonte
) {}
